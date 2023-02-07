package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement buyNowButton;

    @FindBy(xpath = "//div[@class='title']")
    WebElement logoOfWebsite;

    @FindBy(xpath = "//a[contains(text(),'SIGN UP  →')]")
    WebElement signUpButton;

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-menu-left']")
    WebElement leftArrowButton;

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-menu-right']")
    WebElement rightArrowButton;

    public void clickOnBuyNowButton() {buyNowButton.click();}

    public void clickOnSignUpButton() {signUpButton.click();}

    public void clickOnLeftArrowButton() {leftArrowButton.click();}

    public void clickOnRightArrowButton() {rightArrowButton.click();}

    public boolean verifyLogoOfWebsiteDisplayed() {return logoOfWebsite.isDisplayed();}

}

