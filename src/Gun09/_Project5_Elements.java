package Gun09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _Project5_Elements {

    public _Project5_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement logIn;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = "input[type='submit'][value='Log in']")
    public WebElement logInBtn;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    @FindBy(css = "[class='validation-summary-errors']")
    public WebElement unsuccessfullLogInMessage;

    @FindBy(linkText = "$25 Virtual Gift Card")
    public WebElement orderItem;

    @FindBy(css = "[id=\"giftcard_2_RecipientName\"]")
    public WebElement recipientName;

    @FindBy(css = "[id=\"giftcard_2_RecipientEmail\"]")
    public WebElement recipientEmail;

    @FindBy(id = "add-to-cart-button-2")
    public WebElement itemAddToCart;

    @FindBy(xpath = "//*[text()='shopping cart']")
    public WebElement shoppingList;

    @FindBy(id = "termsofservice")
    public WebElement agreeTermsBtn;

    @FindBy(css = "[id='checkout']")
    public WebElement checkoutBtn;

    @FindBy(css = "[id='billing-address-select']")
    public WebElement selectAddress;

    @FindBy(css = "[id='billing-address-select'] option")
    public List<WebElement> selectAddressList;


    @FindBy(css = "[id='BillingNewAddress_CountryId']")
    public WebElement country;

    @FindBy(css = "[id='BillingNewAddress_StateProvinceId']")
    public WebElement provinceId;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement address1;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumber;

    @FindBy(css = "[id='billing-buttons-container'] input")
    public WebElement continueBtn;

    @FindBy(css = "[class='button-1 payment-method-next-step-button']")
    public WebElement continueBtn2;

    @FindBy(css = "[class='button-1 payment-info-next-step-button']")
    public WebElement continueBtn3;

    @FindBy(css = "[class='button-1 confirm-order-next-step-button']")
    public WebElement confirmBtn;

    @FindBy(css = "div[class='title'] strong")
    public WebElement orderMessage;

    @FindBy(id = "paymentmethod_3")
    public WebElement wait1;

    @FindBy(xpath = "//*[text()='You will pay by COD']")
    public WebElement wait2;

    @FindBy(css = "[class='button-1 confirm-order-next-step-button']")
    public WebElement wait3;

    @FindBy(css = "[class='button-2 order-completed-continue-button']")
    public WebElement wait4;


}
