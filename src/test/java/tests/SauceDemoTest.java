package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SauceLoginPage;

import java.time.Duration;

public class SauceDemoTest{

    WebDriver driver;
    String driverPath = "src/utils/chromedriver.exe";
    String urlPage = "https://www.saucedemo.com/";


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void  PurchaseAproduct(){
        // Login on page
        SauceLoginPage sauceLoginPage = new SauceLoginPage(driver);
        driver.get(urlPage);
        sauceLoginPage.getTitleSauce();
        sauceLoginPage.loginIntoSauceDemo("standard_user", "secret_sauce");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }



}
