

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class BioChemScreen extends javax.swing.JFrame {

    /**
     * Creates new form BioChemScreen
     */
    FileOperation io = new FileOperation();
    
    final JPopupMenu menu = new JPopupMenu("Menu");
    
    public BioChemScreen() {
        initComponents();
        
        menu.add("TR").addActionListener((e) -> {
            LanguageManager.setLanguage("tr");
            updateTexts();
        });
        menu.add("EN").addActionListener((e) -> {
            LanguageManager.setLanguage("en");
            updateTexts();
        });
        
        hgbLabel.setText(LanguageManager.getText("hgb"));
        wbcLabel.setText(LanguageManager.getText("wbc"));
        pdwLabel.setText(LanguageManager.getText("pdw"));
        pltLabel.setText(LanguageManager.getText("plt"));
        neuLabel.setText(LanguageManager.getText("neu"));
        lymLabel.setText(LanguageManager.getText("lym"));
        betaW1Label.setText(LanguageManager.getText("beta"));       
        
        goToCalculation.setText(LanguageManager.getText("goResult"));       
        
        this.setTitle(LanguageManager.getText("bioScreen"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settings = new javax.swing.JLabel();
        hgbLabel = new javax.swing.JLabel();
        wbcLabel = new javax.swing.JLabel();
        pdwLabel = new javax.swing.JLabel();
        pltLabel = new javax.swing.JLabel();
        neuLabel = new javax.swing.JLabel();
        lymLabel = new javax.swing.JLabel();
        betaW1Label = new javax.swing.JLabel();
        wbcText = new javax.swing.JFormattedTextField();
        hgbText = new javax.swing.JFormattedTextField();
        goToCalculation = new javax.swing.JButton();
        pdwText = new javax.swing.JFormattedTextField();
        pltText = new javax.swing.JFormattedTextField();
        neuText = new javax.swing.JFormattedTextField();
        lymText = new javax.swing.JFormattedTextField();
        beta1_Text = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        settings.setText(bundle.getString("DemographicScreen.settings.text")); // NOI18N
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 40, 40));

        hgbLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        hgbLabel.setForeground(new java.awt.Color(0, 64, 64));
        hgbLabel.setText("HGB");
        getContentPane().add(hgbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, 30));

        wbcLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        wbcLabel.setForeground(new java.awt.Color(0, 64, 64));
        wbcLabel.setText("WBC");
        getContentPane().add(wbcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, 30));

        pdwLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        pdwLabel.setForeground(new java.awt.Color(0, 64, 64));
        pdwLabel.setText("PDW");
        getContentPane().add(pdwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, 30));

        pltLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        pltLabel.setForeground(new java.awt.Color(0, 64, 64));
        pltLabel.setText("PLT");
        getContentPane().add(pltLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, 30));

        neuLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        neuLabel.setForeground(new java.awt.Color(0, 64, 64));
        neuLabel.setText("NEU");
        getContentPane().add(neuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 210, 30));

        lymLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lymLabel.setForeground(new java.awt.Color(0, 64, 64));
        lymLabel.setText("LYM");
        getContentPane().add(lymLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 210, 30));

        betaW1Label.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        betaW1Label.setForeground(new java.awt.Color(0, 64, 64));
        betaW1Label.setText("BETA_W1");
        getContentPane().add(betaW1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 210, 30));

        wbcText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        getContentPane().add(wbcText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 290, 30));

        hgbText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        hgbText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hgbTextActionPerformed(evt);
            }
        });
        getContentPane().add(hgbText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 290, 30));

        goToCalculation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        goToCalculation.setForeground(new java.awt.Color(0, 64, 64));
        goToCalculation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sonuc_.png"))); // NOI18N
        goToCalculation.setText("Hesaplama Ekranına Git");
        goToCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToCalculationActionPerformed(evt);
            }
        });
        getContentPane().add(goToCalculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 620, 45));

        pdwText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        getContentPane().add(pdwText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 290, 30));

        pltText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(pltText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 290, 30));

        neuText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        getContentPane().add(neuText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 290, 30));

        lymText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        getContentPane().add(lymText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 290, 30));

        beta1_Text.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(beta1_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 290, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital-background-1952.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 707));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goToCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToCalculationActionPerformed
        CalculationScreen calc = new CalculationScreen();
        String result_AdaBoostM1;
        Equation equation;

        if ((!hgbText.getText().isEmpty()) && (!wbcText.getText().isEmpty())
                && (!pdwText.getText().isEmpty()) && (!pltText.getText().isEmpty())
                && (!neuText.getText().isEmpty()) && (!lymText.getText().isEmpty())
                && (!beta1_Text.getText().isEmpty())) {
            io.hgb = hgbText.getText();
            io.wbc = wbcText.getText();
            io.pdw = pdwText.getText();
            io.plt = pltText.getText();
            io.neu = neuText.getText();
            io.lym = lymText.getText();
            io.nlr = String.valueOf(new DecimalFormat("##.#").format(Float.parseFloat(neuText.getText()) / Float.parseFloat(lymText.getText())));
            io.beta_1 = beta1_Text.getText();

            io.writeBioChemFile();
            try {
                CreateModel.Models();

                equation = new Equation();
                result_AdaBoostM1 = equation.adaBoostM1();

                ArrayList<String> adaBoostM1 = new ArrayList<>(Arrays.asList(result_AdaBoostM1.split(",")));
                double adaBoostM1_Percentage = Double.parseDouble(adaBoostM1.get(0));
                calc.bagging_PercentageText.setText(new DecimalFormat("##.######").format(adaBoostM1_Percentage) + "%");
                calc.bagging_ClassText.setText(adaBoostM1.get(1));

                
                io.writeTestResult(io.readLastLine() + adaBoostM1.get(1));
                ImageIcon img = new ImageIcon("src\\images\\sonuc_.png");
                calc.setIconImage(img.getImage());
                calc.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "ERROR-BioChem", JOptionPane.ERROR_MESSAGE);
            }
        } else
            JOptionPane.showMessageDialog(null, "Fill in the necessary empty spaces!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_goToCalculationActionPerformed

    private void hgbTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hgbTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hgbTextActionPerformed

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        menu.show(settings, settings.getWidth() / 2, settings.getHeight() / 2);
    }//GEN-LAST:event_settingsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BioChemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BioChemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BioChemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BioChemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioChemScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField beta1_Text;
    private javax.swing.JLabel betaW1Label;
    private javax.swing.JButton goToCalculation;
    private javax.swing.JLabel hgbLabel;
    private javax.swing.JFormattedTextField hgbText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lymLabel;
    private javax.swing.JFormattedTextField lymText;
    private javax.swing.JLabel neuLabel;
    private javax.swing.JFormattedTextField neuText;
    private javax.swing.JLabel pdwLabel;
    private javax.swing.JFormattedTextField pdwText;
    private javax.swing.JLabel pltLabel;
    private javax.swing.JFormattedTextField pltText;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel wbcLabel;
    private javax.swing.JFormattedTextField wbcText;
    // End of variables declaration//GEN-END:variables

    private void updateTexts() {
        hgbLabel.setText(LanguageManager.getText("hgb"));
        wbcLabel.setText(LanguageManager.getText("wbc"));
        pdwLabel.setText(LanguageManager.getText("pdw"));
        pltLabel.setText(LanguageManager.getText("plt"));
        neuLabel.setText(LanguageManager.getText("neu"));
        lymLabel.setText(LanguageManager.getText("lym"));
        betaW1Label.setText(LanguageManager.getText("beta"));       
        
        goToCalculation.setText(LanguageManager.getText("goResult"));       
        
        this.setTitle(LanguageManager.getText("bioScreen"));
    }
}
