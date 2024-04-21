package tests;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SauceDemoTest{

    WebDriver driver;
    String driverPath = "src/utils/chromedriver.exe";
    String urlPage = "https://www.saucedemo.com/";


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(urlPage);
    }

    @Test(priority = 0)
    public void  loginPage(){
        // Login on page
        SauceLoginPage sauceLoginPage = new SauceLoginPage(driver);
        sauceLoginPage.getTitleSauce();
        sauceLoginPage.loginIntoSauceDemo("standard_user", "secret_sauce");
        Assert.assertTrue(sauceLoginPage.succesLogin());
    }


    @Test(priority = 1)
    public void selecProduct(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.setProductTitlePage();
        productsPage.setOneProducList();
        productsPage.setBtnCart();
    }

    @Test(priority = 2)
    public void cartPurchase(){
        CartPage cartPage = new CartPage(driver);
        cartPage.setCartTitlePage();
        cartPage.setBtnCheckout();
    }
    @Test(priority = 3)
    public void fillYourInfo(){
        YourInformationPage yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.setYourInfoTitlePage();
        yourInformationPage.setDatos("Harlen", "Castillo", "0500060");
    }
    @Test(priority = 4)
    public void overViewPage(){
        OverViewPage overViewPage = new OverViewPage(driver);
        overViewPage.setOverViewTitlePage();
        overViewPage.setBtnFinish();
    }
    @Test(priority = 5)
    public void purchaseSucess(){
        CompletePage completePage = new CompletePage(driver);
        completePage.setCompleteTitlePage();
        completePage.setTextOrderComplete();
        completePage.setBtnBackHome();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.setProductTitlePage();
    }
    @Test(priority = 6)
    public void addToCartProducts(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.setThreeProductList();
        productsPage.setBtnCart();
    }
    @Test(priority = 7)
    public void removeFromCartProducts(){
        CartPage cartPage = new CartPage(driver);
        cartPage.setBtnRemove();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.setThreeProductList();
    }
    @Test(priority = 8)
    public void closeSession(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.logOutSesion();
        SauceLoginPage sauceLoginPage = new SauceLoginPage(driver);
        sauceLoginPage.getTitleSauce();
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }



}
