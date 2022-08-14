package Gun09;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class _01_Project5_Scenario1 extends GenelWebDriver {
    @Test
    void logInTest() {

        _Project5_Elements elements=new _Project5_Elements(driver);

        elements.logIn.click();
        elements.email.sendKeys("techno@study.com");
        elements.password.sendKeys("123456789");
        elements.logInBtn.click();

        Assert.assertTrue(elements.logOut.isDisplayed());
    }
}
