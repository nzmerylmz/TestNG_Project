package Gun05;

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends ParametreliWebDriver {

    @Test
    @Parameters("mesaj")
    void searchFunctionalityTest(String aratilanKelime){
        driver.manage().window().maximize();
        // mac kelimeini göndererek aratınız.
        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys(aratilanKelime);
        driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();
        //Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
        List<WebElement> searchResults=driver.findElements(By.cssSelector("[class='caption'] a"));
        for (int i = 0; i < searchResults.size(); i++) {
            Assert.assertTrue(searchResults.get(i).getText().toLowerCase().contains(aratilanKelime));
        }
    }
}
