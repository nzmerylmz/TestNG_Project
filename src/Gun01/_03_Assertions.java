package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    //Yeşil tik: testte hata yok
    //Sarı çarpı: testte hata var
    //Beyaz ikon: test çalıştırılmadı, skipped

    @Test
    void EqualOrnek() {
        String s1 = "Merhaba";
        String s2 = "İyi akşamlar";

        Assert.assertEquals(s1, s2, "Karşılaştırma sonucu");
    }

    @Test
    void NotEqualOrnek() {
        String s1 = "Merhaba";
        String s2 = "İyi akşamlar";

        Assert.assertNotEquals(s1, s2, "Karşılaştırma sonucu");
    }
    @Test
    void TrueOrnek() {
        int s1 = 55;
        int s2 = 55;

        Assert.assertEquals(s1 == s2, "Karşılaştırma sonucu");
    }

    @Test
    void direktFail(){
        Assert.fail();
    }
    @Test
    void nullOrnek(){
        String s1=null;

        Assert.assertNull(s1,"Karşılaştırma sonucu");
    }
}
