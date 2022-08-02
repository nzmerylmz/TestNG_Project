package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

// Senaryo
//         1- Siteyi açınız.
//         2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
//         3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
public class _02_SubsribeUnsubscribe extends GenelWebDriver {

    @Test (priority = 1)
    void subscribeTest(){
        WebElement newsletter=driver.findElement(By.cssSelector("[id='content'] :nth-child(8) a"));
        newsletter.click();

        WebElement radioYes= driver.findElement(By.cssSelector("[type='radio'][value='1']"));
        radioYes.click();

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation();
    }
    @Test (priority = 2)
    void unsubscribeTest(){
        WebElement newsletter=driver.findElement(By.cssSelector("[id='content'] :nth-child(8) a"));
        newsletter.click();

        WebElement radioNo= driver.findElement(By.cssSelector("[type='radio'][value='0']"));
        radioNo.click();

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation();
    }
    @Test (priority = 3)
    void subscribeControl(){
        WebElement newsletter=driver.findElement(By.cssSelector("[id='content'] :nth-child(8) a"));
        newsletter.click();

        WebElement radioYes= driver.findElement(By.cssSelector("[type='radio'][value='1']"));
        WebElement radioNo= driver.findElement(By.cssSelector("[type='radio'][value='0']"));
        WebElement continueBtn=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        if (radioYes.isSelected()){
            radioNo.click();
            continueBtn.click();
            Tools.successMessageValidation();
        } else {
            radioYes.click();
            continueBtn.click();
            Tools.successMessageValidation();
        }
    }
}
