package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class _01_WishList extends GenelWebDriver {
    @Test
    @Parameters("mesaj")
    void searchFunctionalityTest(String aratilanKelime) {
        driver.manage().window().maximize();
        Gun07._03_PlaceOrderElements poe = new _03_PlaceOrderElements(driver);
        poe.searchBox.sendKeys(aratilanKelime);
        poe.searchButton.click();

        _01_WhishListElements elements = new _01_WhishListElements(driver);
        int a = (int) ((Math.random() * elements.addWishList.size()));
        String expected = elements.wishListItems.get(a).getText();
        elements.addWishList.get(a).click();
        elements.whishListBtn.click();

        boolean found = false;
        for (WebElement e : elements.resultItems) {
            if (e.getText().equals(expected)) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }
}
