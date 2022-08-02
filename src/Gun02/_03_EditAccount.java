package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */
public class _03_EditAccount extends GenelWebDriver {

    @Test (priority = 1)
    void EditAccount1(){
        WebElement editAccount= driver.findElement(By.linkText("Edit Account"));
        editAccount.click();

        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys("adinnew");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("soyadinnew");

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continueBtn.click();

        WebElement updateMsg=GenelWebDriver.driver.findElement(By.xpath("//*[text()=' Success: Your account has been successfully updated.']"));

        Assert.assertTrue(updateMsg.getText().contains("Success"));
    }
    @Test (priority = 2)
    void EditAccount2(){
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit Account")));
        WebElement editAccount= driver.findElement(By.linkText("Edit Account"));
        editAccount.click();

        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys("adin");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("soyadin");

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continueBtn.click();

        WebElement updateMsg=GenelWebDriver.driver.findElement(By.xpath("//*[text()=' Success: Your account has been successfully updated.']"));

        Assert.assertTrue(updateMsg.getText().contains("Success"));
    }
}
