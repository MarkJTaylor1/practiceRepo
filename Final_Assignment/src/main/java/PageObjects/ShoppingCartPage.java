package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {


        WebDriver driver;

        public ShoppingCartPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//div[@class='cart-inner']//span[1]")
        WebElement shoppingCartLogo;

        @FindBy(xpath = "//span[@class='label label-primary']")
        WebElement shoppingCartLabel;

        @FindBy(xpath = "//th[normalize-space()='Product']")
        WebElement productLogo;

        @FindBy(xpath = "//th[normalize-space()='Qty']")
        WebElement quantityLogo;

        @FindBy(xpath = "//th[@class='amount']")
        WebElement amountLogo;

        @FindBy(xpath = "//td[normalize-space()='Name']")
        WebElement nameLogo;

        @FindBy(xpath = "//input[@value='Budi']")
        WebElement nameInputValueBox;

        @FindBy(xpath = "//td[normalize-space()='Email']")
        WebElement emailLogo;

        @FindBy(xpath = "//input[@value='budi@utomo.com']")
        WebElement emailInputValueBox;

        @FindBy(xpath = "//td[normalize-space()='Phone no']")
        WebElement phoneNumberLogo;

        @FindBy(xpath = "//input[@value='081808466410']")
        WebElement phoneNumberInputValueBox;

        @FindBy(xpath = "//td[normalize-space()='City']")
        WebElement cityLogo;

        @FindBy(xpath = "//input[@value='Jakarta']")
        WebElement cityInputValueBox;

        @FindBy(xpath = "//td[normalize-space()='Address']")
        WebElement addressLogo;

        @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
        WebElement addressInputValueBox;

        @FindBy(xpath = "//td[normalize-space()='Postal Code']")
        WebElement postalCodeLogo;

        @FindBy(xpath = "//input[@value='10220']")
        WebElement postalCodeInputValueBox;

        @FindBy(xpath = "//div[@class='cart-checkout']")
        WebElement checkoutBox;

        @FindBy(xpath = "//div[@class='cart-checkout-settings']")
        WebElement settingsBox;

        @FindBy(xpath = "//div[@class='cancel-btn']")
        WebElement cancelBox;




        public boolean verifyOnShoppingCartLogo(){ return shoppingCartLogo.isDisplayed();}

        public boolean verifyOnShoppingCartLabel(){ return shoppingCartLabel.isDisplayed();}

        public boolean verifyProductLogo(){ return productLogo.isDisplayed();}

        public boolean verifyQuantityLogo(){ return quantityLogo.isDisplayed();}

        public boolean verifyAmountLogo(){ return amountLogo.isDisplayed();}

        public boolean verifyNameLogo(){ return nameLogo.isDisplayed();}

        public boolean phoneNumberLogo(){ return phoneNumberLogo.isDisplayed();}

        public boolean emailLogo(){ return emailLogo.isDisplayed();}

        public boolean cityLogo(){ return cityLogo.isDisplayed();}

        public boolean addressLogo(){ return addressLogo.isDisplayed();}

        public boolean postalCodeLogo(){ return postalCodeLogo.isDisplayed();}




        public void clickOnEmailInputValueBox(){emailInputValueBox.click();}

        public void clickOnPhoneNumberInputValueBox(){phoneNumberInputValueBox.click();}

        public void clickOnNameInputValueBox(){nameInputValueBox.click();}

        public void clickOnCityInputValueBox(){cityInputValueBox.click();}

        public void clickOnAddressInputValueBox(){addressInputValueBox.click();}

        public void clickOnPostalCodeInputValueBox(){postalCodeInputValueBox.click();}

        public void clickOnCheckoutBox(){checkoutBox.click();}

        public void clickOnSettingsBox(){settingsBox.click();}

        public void clickOnCancelBox(){cancelBox.click();}

    }


