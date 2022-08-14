package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends GenelWebDriver {
    @Test
    void addAddress() {
        WebElement addressbook = driver.findElement(By.linkText("Address Book"));
        addressbook.click();

        WebElement newAddressBtn = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        newAddressBtn.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("name");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("surname");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("Techno");

        WebElement address = driver.findElement(By.id("input-address-1"));
        address.sendKeys("newAddress");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("newCity");

        WebElement postcode = driver.findElement(By.id("input-postcode"));
        postcode.sendKeys("001122");

        WebElement country = driver.findElement(By.id("input-country"));
        country.click();

        WebElement countrySelection = driver.findElement(By.cssSelector("[id='input-country']"));
        Select menu = new Select(countrySelection);
        menu.selectByValue("223");

        WebElement region = driver.findElement(By.id("input-zone"));
        Select menu1 = new Select(region);
        menu1.selectByValue("3644");

        WebElement radioBtn = driver.findElement(By.cssSelector("[type='radio'][value='1']"));
        radioBtn.click();

        WebElement continueBtn = driver.findElement(By.cssSelector("[value='Continue']"));
        continueBtn.click();

    }

    @Test(dependsOnMethods = {"addAddress"})
    void editAddress() {
        WebElement addressbook = driver.findElement(By.linkText("Address Book"));
        addressbook.click();

        List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
        WebElement sonEdit = editAll.get(editAll.size() - 1);
        sonEdit.click();

        WebElement firstnameNew = driver.findElement(By.id("input-firstname"));
        firstnameNew.clear();
        firstnameNew.sendKeys("newname");

        WebElement lastnameNew = driver.findElement(By.id("input-lastname"));
        lastnameNew.clear();
        lastnameNew.sendKeys("newsurname");

        WebElement continueBtn2 = driver.findElement(By.cssSelector("[type='submit']"));
        continueBtn2.click();
    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress() {
        WebElement addressbook = driver.findElement(By.linkText("Address Book"));
        addressbook.click();

        List<WebElement> deleteAll = driver.findElements(By.linkText("Delete"));
        WebElement sonDelete = deleteAll.get(deleteAll.size() - 2);
        sonDelete.click();
    }
}
