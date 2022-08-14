package Gun09;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Project5_Scenario2 extends GenelWebDriver {
    @Test
    void unsuccessfullLogIn (){
        _Project5_Elements elements=new _Project5_Elements(driver);
        elements.logIn.click();
        elements.email.sendKeys("techno@study.co");
        elements.password.sendKeys("123456789");
        elements.logInBtn.click();
        Assert.assertTrue(elements.unsuccessfullLogInMessage.isDisplayed());
        System.out.println(elements.unsuccessfullLogInMessage.getText());
    }
}
