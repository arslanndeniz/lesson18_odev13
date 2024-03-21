import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MaasHesaplama {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int calisilanGun = Integer.parseInt(properties.getProperty("calisilanGun"));
        int gunlukKazanilanPara = Integer.parseInt(properties.getProperty("gunlukKazanilanPara"));
        int gunlukKazanilanPrim = Integer.parseInt(properties.getProperty("gunlukKazanilanPrim"));

        System.out.println(calculateSalary(calisilanGun, gunlukKazanilanPara, gunlukKazanilanPrim));
    }

    public static String calculateSalary(int calisilanGun, int gunlukKazanilanPara, int gunlukKazanilanPrim) {
        int maas = gunlukKazanilanPara * Math.min(calisilanGun, 25);
        int ekstraCalisilanGun = Math.max(calisilanGun - 25, 0);
        int prim = gunlukKazanilanPrim * ekstraCalisilanGun;

        if (calisilanGun <= 25) {
            return "Maas: " + maas + " TL";
        } else {
            return "Maas: " + maas + " TL, Prim: " + prim + " TL";
        }
    }
}
