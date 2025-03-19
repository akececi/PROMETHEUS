
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import weka.classifiers.Classifier;
import weka.classifiers.meta.AdaBoostM1;
import weka.classifiers.meta.Bagging;
import weka.classifiers.meta.ClassificationViaRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class CreateModel {
    public static void Models() throws IOException, Exception
    {
        Classifier cls_AdaBoostM1 = (Classifier) new Bagging();
        Instances inst = new Instances(new BufferedReader(new FileReader("src\\Files\\ectopic_preg_train_data_v2.arff")));
        inst.setClassIndex(inst.numAttributes() - 1);
        
        cls_AdaBoostM1.buildClassifier(inst);
        
        ObjectOutputStream oos_CVR = new ObjectOutputStream(new FileOutputStream("src\\Files\\AdaBoostM1.model"));
        oos_CVR.writeObject(cls_AdaBoostM1);
        
        oos_CVR.flush();
        oos_CVR.close();
    }
}