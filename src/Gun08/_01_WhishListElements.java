package Gun08;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_WhishListElements {

    public _01_WhishListElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(className = "input-group-btn")
    public WebElement searchButton;

    @FindBy(css = "button[data-toggle='tooltip'][data-original-title='Add to Wish List']")
    public List<WebElement> addWishList;

    @FindBy(css="[id='wishlist-total']")
    public WebElement whishListBtn;

    @FindBy(css = "[class='caption'] a")
    public List<WebElement> wishListItems;

    @FindBy(css = "[class='text-left'] a")
    public List<WebElement> resultItems;
}
