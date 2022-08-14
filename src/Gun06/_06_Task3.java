package Gun06;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task3 extends GenelWebDriver {
    /*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/
    @Test
    void specialTest() {
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Specials")).click();

        List<WebElement> products = driver.findElements(By.cssSelector("[class='caption'] a"));
        List<WebElement> productsOldPrice = driver.findElements(By.xpath("//span[@class='price-old']"));

        Assert.assertEquals(products.size(), productsOldPrice.size());

        List<WebElement> productsNewPrice = driver.findElements(By.cssSelector("span[class='price-new']"));
        for (int i = 0; i < productsNewPrice.size(); i++) {
            Assert.assertTrue(Tools.webElementToDouble(productsOldPrice.get(i))
                    >Tools.webElementToDouble(productsNewPrice.get(i)));
        }
    }
}
