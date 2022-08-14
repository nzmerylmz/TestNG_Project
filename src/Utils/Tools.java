package Utils;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList){
        for (int i = 0; i < menuExpectedList.size(); i++) {
            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText(),"Karşılaştırma Sonucu");
        }
    }
    public static void successMessageValidation(){
        WebElement msg=GenelWebDriver.driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msg.getText().contains("Success"));
    }

    public static double webElementToDouble(WebElement e){
        return Double.parseDouble(e.getText().replaceAll("[^\\d]",""));
    }


}
