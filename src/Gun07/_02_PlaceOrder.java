package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_PlaceOrder extends GenelWebDriver {

    @Test
    void placeOrder() {
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.className("input-group-btn"));
        searchButton.click();

        WebElement addToCart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToCart.click();

        WebElement shoppingCart = driver.findElement(By.linkText("Shopping Cart"));
        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement  confirm=driver.findElement(By.id("button-confirm"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement h1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content']>h1")));

        Assert.assertEquals(h1.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");
    }
}
