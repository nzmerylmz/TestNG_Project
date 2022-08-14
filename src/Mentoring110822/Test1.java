package Mentoring110822;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Utils.GenelWebDriver.driver;
import static Utils.GenelWebDriver.wait;

public class Test1 {
    @Test
    public void testMultipleCheckBox() throws Exception {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.webpagetest.org/");

        WebElement element1 = driver.findElement(By.cssSelector("input[aria-labelledby='tt-Mobile_4G']"));
        WebElement element2 = driver.findElement(By.cssSelector("input[aria-labelledby='tt-Desktop_Chrome']"));
        WebElement element3 = driver.findElement(By.cssSelector("input[aria-labelledby='tt-Mobile_3G']"));
        WebElement element4 = driver.findElement(By.cssSelector("input[aria-labelledby='tt-Desktop_Edge']"));
        WebElement element5 = driver.findElement(By.cssSelector("input[aria-labelledby='tt-Desktop_Firefox']"));
        WebElement[] elements = { element1, element2, element3, element4, element5 };
        safeSelectCheckBoxes(elements);
        driver.close();
    }
    public void safeSelectCheckBoxes(WebElement... elements) throws Exception {
        WebElement checkElement = null;
        try {
            if (elements.length > 0) {
                for (WebElement currentElement : elements) {
                    checkElement = currentElement;
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.elementToBeClickable(currentElement));

                    WebElement checkBox = currentElement;
                    if (checkBox.isSelected())
                        System.out.println("CheckBox " + currentElement
                                + " is already selected");
                    else
                        checkBox.click();
                }
            } else {
                System.out
                        .println("Expected at least one element as argument to safeSelectCheckboxes function");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element - " + checkElement
                    + " is not attached to the page document "
                    + Arrays.toString(e.getStackTrace()));

        } catch (NoSuchElementException e) {
            System.out.println("Element " + checkElement + " was not found in DOM"
                    + Arrays.toString(e.getStackTrace()));

        } catch (Exception e) {
            System.out.println("Unable to select checkbox " + Arrays.toString(e.getStackTrace()));
        }
    }
}
