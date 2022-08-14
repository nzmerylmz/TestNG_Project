package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {
    @Test
    @Parameters("mesaj") //XML'deki adı
    void contactUsTest(String gelenMesaj){ //metoddaki adı
        driver.manage().window().maximize();
        //1- ContactUs a tıklayınız
        driver.findElement(By.linkText("Contact Us")).click();

        //2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
        WebElement textBox=driver.findElement(By.id("input-enquiry"));
        textBox.sendKeys(gelenMesaj);

        //3- Submit ettikten sonra Contact US yazısını doğrulayınız.
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String expectedMessage="Contact Us";
        String actualMessage=driver.findElement(By.xpath("//h1[text()='Contact Us']")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        driver.close();

    }
}
