
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class FileOperation {

    public static String FILEPATH = "src\\Files\\ectopic_preg_test_data.arff";
    public static String HEADERPATH = "src\\Files\\arffHeader.arff";

    public String age = null, sat = null, riaPresence = null,
            ivfPregnancy = null, pelvicPain = null, bleeding = null, defence = null,
            rebound = null, sensibility = null, ep_size = null,
            gs = null, ys = null, crl = null, fka = null,
            presence_free_liquid = null, hgb = null, wbc = null, pdw = null, plt = null,
            neu = null, lym = null, nlr = null, beta_1 = null;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getRiaPresence() {
        return riaPresence;
    }

    public void setRiaPresence(String riaPresence) {
        this.riaPresence = riaPresence;
    }

    public String getIvfPregnancy() {
        return ivfPregnancy;
    }

    public void setIvfPregnancy(String ivfPregnancy) {
        this.ivfPregnancy = ivfPregnancy;
    }

    public String getPelvicPain() {
        return pelvicPain;
    }

    public void setPelvicPain(String pelvicPain) {
        this.pelvicPain = pelvicPain;
    }

    public String getBleeding() {
        return bleeding;
    }

    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getRebound() {
        return rebound;
    }

    public void setRebound(String rebound) {
        this.rebound = rebound;
    }

    public String getSensibility() {
        return sensibility;
    }

    public void setSensibility(String sensibility) {
        this.sensibility = sensibility;
    }

    public String getEp_size() {
        return ep_size;
    }

    public void setEp_size(String ep_size) {
        this.ep_size = ep_size;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }

    public String getCrl() {
        return crl;
    }

    public void setCrl(String crl) {
        this.crl = crl;
    }

    public String getFka() {
        return fka;
    }

    public void setFka(String fka) {
        this.fka = fka;
    }

    public String getPresence_free_liquid() {
        return presence_free_liquid;
    }

    public void setPresence_free_liquid(String presence_free_liquid) {
        this.presence_free_liquid = presence_free_liquid;
    }

    public String getHgb() {
        return hgb;
    }

    public void setHgb(String hgb) {
        this.hgb = hgb;
    }

    public String getWbc() {
        return wbc;
    }

    public void setWbc(String wbc) {
        this.wbc = wbc;
    }

    public String getPdw() {
        return pdw;
    }

    public void setPdw(String pdw) {
        this.pdw = pdw;
    }

    public String getPlt() {
        return plt;
    }

    public void setPlt(String plt) {
        this.plt = plt;
    }

    public String getNeu() {
        return neu;
    }

    public void setNeu(String neu) {
        this.neu = neu;
    }

    public String getLym() {
        return lym;
    }

    public void setLym(String lym) {
        this.lym = lym;
    }

    public String getNlr() {
        return nlr;
    }

    public void setNlr(String nlr) {
        this.nlr = nlr;
    }

    public String getBeta_1() {
        return beta_1;
    }

    public void setBeta_1(String beta_1) {
        this.beta_1 = beta_1;
    }

    public void createAddHeader() throws IOException {
        FileWriter fw = null;
        BufferedReader br = new BufferedReader(new FileReader(new File(HEADERPATH)));

        File file = new File(FILEPATH);
        Files.deleteIfExists(file.toPath());

        try {
            StringBuilder builder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");

            while ((line = br.readLine()) != null) {
                builder.append(line);
                builder.append(ls);
            }

            builder.deleteCharAt(builder.length() - 1);
            String header = builder.toString();

            fw = new FileWriter(FILEPATH);
            fw.write(header);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeDemoFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String finalString;
            stringBuilder.append(age);
            stringBuilder.append(",");
            stringBuilder.append(sat);
            stringBuilder.append(",");
            stringBuilder.append(riaPresence);
            stringBuilder.append(",");
            stringBuilder.append(ivfPregnancy);
            stringBuilder.append(",");
            stringBuilder.append(pelvicPain);
            stringBuilder.append(",");
            stringBuilder.append(bleeding);
            stringBuilder.append(",");

            finalString = stringBuilder.toString();

            fw = new FileWriter(FILEPATH, true);
            bw = new BufferedWriter(fw);
            bw.append(finalString);
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "There is a problem with reading the file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writePhysicalExFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String finalString;

            stringBuilder.append(defence);
            stringBuilder.append(",");
            stringBuilder.append(rebound);
            stringBuilder.append(",");
            stringBuilder.append(sensibility);
            stringBuilder.append(",");
            finalString = stringBuilder.toString();

            fw = new FileWriter(FILEPATH, true);
            bw = new BufferedWriter(fw);
            bw.write(finalString);
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "There is a problem with reading the file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeBioChemFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String finalString;

            stringBuilder.append(hgb);
            stringBuilder.append(",");
            stringBuilder.append(wbc);
            stringBuilder.append(",");
            stringBuilder.append(pdw);
            stringBuilder.append(",");
            stringBuilder.append(plt);
            stringBuilder.append(",");
            stringBuilder.append(neu);
            stringBuilder.append(",");
            stringBuilder.append(lym);
            stringBuilder.append(",");
            stringBuilder.append(nlr);
            stringBuilder.append(",");
            stringBuilder.append(beta_1);
            stringBuilder.append(",?");
            finalString = stringBuilder.toString();

            fw = new FileWriter(FILEPATH, true);
            bw = new BufferedWriter(fw);
            bw.write(finalString);

            //
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "There is a problem with reading the file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeUSGFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String finalString;

            stringBuilder.append(ep_size);
            stringBuilder.append(",");
            stringBuilder.append(gs);
            stringBuilder.append(",");
            stringBuilder.append(ys);
            stringBuilder.append(",");
            stringBuilder.append(crl);
            stringBuilder.append(",");
            stringBuilder.append(fka);
            stringBuilder.append(",");
            stringBuilder.append(presence_free_liquid);
            stringBuilder.append(",");
            finalString = stringBuilder.toString();

            fw = new FileWriter(FILEPATH, true);
            bw = new BufferedWriter(fw);
            bw.write(finalString);
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "There is a problem with reading the file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String readLastLine() throws IOException {
        try ( RandomAccessFile file = new RandomAccessFile(FILEPATH, "r")) {
            long fileLength = file.length() - 1;
            StringBuilder sb = new StringBuilder();

            for (long pointer = fileLength; pointer >= 0; pointer--) {
                file.seek(pointer);
                char c = (char) file.readByte();
                if (c == '\n' && sb.length() > 0) {
                    break;
                }
                sb.append(c);
            }
            String text = sb.reverse().toString();
            text = text.replace("?", "");
            return text;
        }
    }

    public static String getOneDrivePathFromRegistry() {
        try {
            /*
            Process process = Runtime.getRuntime().exec(
                    "reg query \"HKCU\\Software\\Microsoft\\OneDrive\" /v UserFolder"
            );
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("UserFolder")) {
                    String[] parts = line.split("REG_SZ");
                    if (parts.length > 1) {
                        return parts[1].trim();
                    }
                }
            }
             */
            String oneDrivePath = System.getenv("OneDrive"); // Personal OneDrive
            String oneDriveBusinessPath = System.getenv("OneDriveCommercial"); // Business OneDrive

            // Check and display the paths
            if (oneDrivePath != null) {
                System.out.println("Your OneDrive path is: " + oneDrivePath);
                return oneDrivePath;
            } else if (oneDriveBusinessPath != null) {
                System.out.println("Your OneDrive (Business) path is: " + oneDriveBusinessPath);
                return oneDriveBusinessPath;
            } else {
                System.out.println("OneDrive path not found. Please ensure OneDrive is set up on this system.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There is a problem with getting OneDrive Path!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void writeTestResult(String lineToAppend) {

        String oneDrivePath = getOneDrivePathFromRegistry();
        if (oneDrivePath != null) {
            System.out.println("OneDrive path from registry: " + oneDrivePath);

            String TESTPATH = oneDrivePath + "\\test.csv";
            try ( FileWriter fileWriter = new FileWriter(TESTPATH, true)) {
                fileWriter.write(lineToAppend + System.lineSeparator());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "There is a problem with writing the test file!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("Could not retrieve OneDrive path from registry.");
        }
    }
}
