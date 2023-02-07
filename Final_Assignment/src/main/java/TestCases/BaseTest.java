package TestCases;

import PageObjects.HomePage;
import PageObjects.ShoppingCartPage;
import Utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static Properties prop = new Properties();

    static WebDriver driver;

    public HomePage homePage;

    public ShoppingCartPage shoppingCartPage;

    public Actions actions;

    public BaseTest(){
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ File.separator+"resources"+File.separator+"testdata"+File.separator+"config.properties");
            prop.load(file);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e1) {
            e1.printStackTrace();
        }
    }


    @BeforeMethod
    public void beforeMethod(){
        driver.get(prop.getProperty("url"));
        Util.holdExecution(2);
    }

    @BeforeClass
    public void tearUp(){
        driver = launchBrowser("Chrome");
        System.out.println("Launching Browser");
        driver.get(prop.getProperty("url"));
        homePage=new HomePage(driver);
        shoppingCartPage=new ShoppingCartPage(driver);
        Util.holdExecution(4);
    }

    @Test



    public static WebDriver launchBrowser(String browserName){
        WebDriver driver ;
        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator+"resources"+File.separator+"drivers"+File.separator+"chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver");
            driver = new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+File.separator+"resources"+File.separator+"drivers"+File.separator+"msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator+"resources"+File.separator+"drivers"+File.separator+"chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
