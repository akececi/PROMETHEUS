
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.meta.AdaBoostM1;
import weka.classifiers.meta.Bagging;
import weka.classifiers.meta.ClassificationViaRegression;
import weka.core.Attribute;
import weka.core.Debug.Random;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ConverterUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class Equation {

    private Classifier classModel_AdaBoostM1;
    private Instances dataModel;

    public static List<String> att = Arrays.asList("YAS", "SAT", "RIA_VARLIGI", "IVF_GEBELIK",
            "PELVIK_AGRI", "KANAMA", "DEFANS", "REBOUND", "HASSASIYET", "EP_BOYUTU", "GS",
            "YS", "CRL", "FKA", "SERBEST_SIVI_VARLIGI", "HGB", "WBC", "PDW", "PLT",
            "NEU", "LYM", "NLR", "BETA_1");

    public String adaBoostM1() {
        String result = null;
        double percResult = 0.0;

        try {
            ConverterUtils.DataSource source = new ConverterUtils.DataSource("src\\Files\\ectopic_preg_train_data_v2.arff");
            Instances train = source.getDataSet();

            train.setClassIndex(23);
            if (train.classIndex() == -1) {
                train.setClassIndex(train.numAttributes() - 1);
            }
            source = new ConverterUtils.DataSource("src\\Files\\ectopic_preg_test_data.arff");
            Instances test = source.getDataSet();
            test.setClassIndex(23);
            if (test.classIndex() == -1) {
                test.setClassIndex(test.numAttributes() - 1);
            }

            AdaBoostM1 adaBoostM1 = new AdaBoostM1();
            Classifier cls = adaBoostM1;
            cls.buildClassifier(train);

            for (int i = 0; i < test.numInstances(); i++) {
                double[] distributions = adaBoostM1.distributionForInstance(test.instance(i));

                double maxValue = -1;
                double maxIndex = -1;

                for (int j = 0; j < distributions.length; j++) {

                    System.out.println("class_" + j + ": " + distributions[j] + " ~ " + Math.round(distributions[j]));

                    if (distributions[j] > maxValue) {
                        maxIndex = j;
                        maxValue = distributions[j];
                    }
                }

                double classifiedIndex = cls.classifyInstance(test.instance(i));
                test.instance(i).setClassValue(classifiedIndex);
                percResult = 100 * distributions[(int) maxIndex];

                String classifiedText = test.instance(i).stringValue(test.numAttributes() - 1);

                result = String.valueOf(percResult) + "," + classifiedText;

                System.out.println("classified as: " + classifiedText + " (" + 100 * distributions[(int) maxIndex] + "%)");

                System.out.println("all classes: " + test.instance(i).attribute(test.instance(i).numAttributes() - 1));
            }

        } catch (Exception e) {
            System.out.println("from equation");
        }
        return result;
    }

    public String classify_AdaBoostM1(Dictionary<String, String> measures) throws Exception {
        try {
            classModel_AdaBoostM1 = (Classifier) SerializationHelper.read("src\\Files\\AdaBoostM1.model");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "clasify method There is a problem with reading the file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        FastVector dataClasses = new FastVector();
        FastVector dataAttributes = new FastVector();
        Attribute att_class;
        double values[] = new double[measures.size() + 1];
        int i = 0, maxIndex = 0;

        dataClasses.addElement("MTX");
        dataClasses.addElement("CERRAHI");
        att_class = new Attribute("class", dataClasses);

        for (Enumeration<String> keys = measures.keys(); keys.hasMoreElements();) {
            String key = keys.nextElement();
            double val = Double.parseDouble(measures.get(key));
            dataAttributes.addElement(new Attribute(key));
            values[i++] = val;
        }

        dataAttributes.addElement(att_class);

        dataModel = new Instances("classify", dataAttributes, 0);
        dataModel.setClass(att_class);
        dataModel.add(new Instance(1, values));

        dataModel.instance(0).setClassMissing();
        double cl[] = classModel_AdaBoostM1.distributionForInstance(dataModel.instance(0));
        for (i = 0; i < cl.length; i++) {
            if (cl[i] > cl[maxIndex]) {
                maxIndex = i;
            }
        }

        String percResult = Double.toString(cl[maxIndex]);
        percResult = percResult + "," + dataModel.classAttribute().value(maxIndex);

        return percResult;
    }
}
