
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AYBUKE KECECI KANMAZ
 */
public class LanguageManager {
    private static final Map<String, Map<String, String>> translations = new HashMap<>();
    private static String currentLanguage = "tr"; 

    static {
        // English translations
        Map<String, String> en = new HashMap<>();
        en.put("yes", "YES");
        en.put("no", "NO");
        en.put("returnHome", "Return to Home Screen");
        en.put("goBio", "Go to Biochemistry Screen");
        en.put("freeFluid", "Presence of Free Fluid");
        en.put("ys", "YS");
        en.put("gs", "GS");
        en.put("fka", "FKA");
        en.put("crl", "CRL");
        en.put("sat", "SAT");
        en.put("result", "Result");
        en.put("sizeEP", "Size of EP");
        en.put("goPhysical", "Go to Physical Examination Screen");
        en.put("bleeding", "Bleeding");
        en.put("pelvicPain", "Pelvic Pain");
        en.put("pregIVF", "IVF Pregnancy");
        en.put("ria", "Presense of RIA");
        en.put("zoneSymptoms", "Symptoms Zone");
        en.put("zoneDemographic", "Demographic Zone");
        en.put("age", "Age");
        en.put("goUltrasound", "Go to Ultrasound Screen");
        en.put("tenderness", "Tenderness");
        en.put("rebound", "Rebound");
        en.put("defence", "Defence");
        en.put("date", "yyyy-MM-dd");
        en.put("demogScreen", "Demographic Screen");
        en.put("usgScreen", "USG Screen");
        en.put("goResult", "Go to Calculation Screen");
        en.put("beta", "BETA-W1");
        en.put("usgScreen", "USG Screen");
        en.put("bioScreen", "Biochemistry Screen");
        en.put("physicalScreen", "Physical Screen");
        en.put("resultScreen", "Result Screen");
        en.put("hgb", "HGB");
        en.put("wbc", "WBC");
        en.put("pdw", "PDW");
        en.put("plt", "PLT");
        en.put("neu", "NEU");
        en.put("lym", "LYM");
        
        
        
        // Turkish translations
        Map<String, String> tr = new HashMap<>();
        tr.put("yes", "EVET");
        tr.put("no", "HAYIR");
        tr.put("returnHome", "Ana Ekrana Dön");
        tr.put("goBio", "Biyokimya Ekranına Git");
        tr.put("goResult", "Hesaplama Ekranına Git");
        tr.put("freeFluid", "Serbest Sıvı Varlığı");
        tr.put("ys", "YS");
        tr.put("gs", "GS");
        tr.put("fka", "FKA");
        tr.put("crl", "CRL");
        tr.put("sat", "SAT");
        tr.put("result", "Sonuç");
        tr.put("sizeEP", "EP Boyutu");
        tr.put("goPhysical", "Fiziksel Muayene Ekranına Git");
        tr.put("bleeding", "Kanama");
        tr.put("pelvicPain", "Pelvik Ağrı");
        tr.put("pregIVF", "IVF Gebelik");
        tr.put("ria", "RIA Varlığı");
        tr.put("zoneSymptoms", "Semptomlar Alanı");
        tr.put("zoneDemographic", "Demografik Alan");
        tr.put("age", "Yaş");
        tr.put("goUltrasound", "Ultrason Ekranına Git");
        tr.put("tenderness", "Hassasiyet");
        tr.put("rebound", "Rebound");
        tr.put("defence", "Defans");
        tr.put("date", "yyyy-MM-dd");
        tr.put("demogScreen", "Demografi Ekranı");
        tr.put("usgScreen", "USG Ekranı");
        tr.put("beta", "BETA-W1");
        tr.put("bioScreen", "Biyokimya Ekranı");
        tr.put("physicalScreen", "Fiziksel Muayene Ekranı");
        tr.put("resultScreen", "Sonuç Ekranı");
        tr.put("hgb", "HGB");
        tr.put("wbc", "WBC");
        tr.put("pdw", "PDW");
        tr.put("plt", "PLT");
        tr.put("neu", "NEU");
        tr.put("lym", "LYM");
        
        
        translations.put("en", en);
        translations.put("tr", tr);
    }
    
     // Method to change the language
    public static void setLanguage(String language) {
        if (translations.containsKey(language)) {
            currentLanguage = language;
        } else {
            throw new IllegalArgumentException("Language not supported: " + language);
        }
    }
    
    // Method to get translated text
    public static String getText(String key) {
        return translations.get(currentLanguage).getOrDefault(key, key);
    }
}
