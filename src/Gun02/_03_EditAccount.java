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

    @Test
    void EditAccount(){
        editAccount("adinnew","soyadinnew");
        editAccount("adin","soyadin");
    }
    void editAccount(String ad, String soyad){
        WebElement editAccount= driver.findElement(By.linkText("Edit Account"));
        editAccount.click();

        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys(ad);

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys(soyad);

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation();
    }
}
