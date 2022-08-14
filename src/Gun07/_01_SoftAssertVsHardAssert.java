package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    @Test
    void hardAssert(){
        String s1="Merhaba";

        System.out.println("Hard Assert Öncesi");
        Assert.assertEquals("Merhaba 123",s1,"Hard Assert Sonuç");
        System.out.println("Hard Assert Sonrası");
    }
    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditPage="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
        System.out.println("Assert 1. noktası");
        _softAssert.assertEquals("www.facebook.com/profile",strCartPage);
        System.out.println("Assert 2. noktası");
        _softAssert.assertEquals("www.facebook.com/settings",strEditPage);
        System.out.println("Assert 3. noktası");

        _softAssert.assertAll();
        System.out.println("Assertlik sonrası");
    }
}
