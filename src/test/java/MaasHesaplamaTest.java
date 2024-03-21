import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaasHesaplamaTest {

    @Test
    void testMaasHesaplama() {
        int calisilanGun = 30;
        int gunlukKazanilanPara = 500;
        int gunlukKazanilanPrim = 1000;

        String expected = "Maas: 12500 TL, Prim: 5000 TL";
        String result = MaasHesaplama.calculateSalary(calisilanGun, gunlukKazanilanPara, gunlukKazanilanPrim);
        assertEquals(expected, result);
    }
}
