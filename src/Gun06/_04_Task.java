package Gun06;


import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task extends GenelWebDriver {
    @Test(dataProvider="models")
    void searchFunctionalityTest(String model){
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys(model);
        driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();
        List<WebElement> searchResults=driver.findElements(By.cssSelector("[class='caption'] a"));
        for (int i = 0; i < searchResults.size(); i++) {
            Assert.assertTrue(searchResults.get(i).getText().toLowerCase().contains(model));
        }
        WebElement searchBoxClear=driver.findElement(By.cssSelector("[placeholder='Search']"));
        searchBoxClear.clear();
    }
    @DataProvider(name = "models")
    public Object[] getData2(){
        Object[] data={"mac", "ipod", "samsung"};
        return data;
    }
}
