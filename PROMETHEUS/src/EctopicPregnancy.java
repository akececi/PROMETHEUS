
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class EctopicPregnancy {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws Exception {

        Locale.setDefault(new Locale("en", "US"));
        WelcomePage start = new WelcomePage();
        start.setVisible(true);

        FileOperation io = new FileOperation();
        DemographicScreen dem = new DemographicScreen();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                start.loading.setText(Integer.toString(i) + "%");
                start.loadingProcessBar.setValue(i);
                if (i == 100) {
                    io.createAddHeader();
                    start.setVisible(false);
                    ImageIcon img = new ImageIcon("src\\images\\dem_.png");
                    dem.setIconImage(img.getImage());
                    dem.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.toString());
        }
    }

}
