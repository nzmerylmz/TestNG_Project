package Gun09;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Project5_Scenario3 extends GenelWebDriver {
    @Test
    void placeOrder() {
        _Project5_Elements elements=new _Project5_Elements(driver);
        elements.logIn.click();
        elements.email.sendKeys("techno@study.com");
        elements.password.sendKeys("123456789");
        elements.logInBtn.click();
        elements.orderItem.click();
        elements.recipientName.sendKeys("Grup1");
        elements.recipientEmail.sendKeys("techno@study.com");
        elements.itemAddToCart.click();
        wait.until(ExpectedConditions.visibilityOf(elements.shoppingList));
        elements.shoppingList.click();
        elements.agreeTermsBtn.click();
        elements.checkoutBtn.click();
        Select addressMenu=new Select(elements.selectAddress);
        addressMenu.selectByIndex(elements.selectAddressList.size()-1);
        Select menu=new Select(elements.country);
        menu.selectByValue("1");
        Select menu2=new Select(elements.provinceId);
        menu2.selectByValue("29");
        elements.city.sendKeys("Boston");
        elements.address1.sendKeys("Boston");
        elements.zipCode.sendKeys("01234");
        elements.phoneNumber.sendKeys("0123456789");
        elements.continueBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.wait1));
        elements.continueBtn2.click();
        wait.until(ExpectedConditions.visibilityOf(elements.wait2));
        elements.continueBtn3.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.wait3));
        elements.confirmBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.wait4));
        Assert.assertTrue(elements.orderMessage.isDisplayed());

    }
}
