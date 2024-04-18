package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceDemoTest {

    WebDriver driver;

    @FindBy(css = ".login_logo")
    private WebElement loginTitle;

    @FindBy(css = "#user-name")
    private WebElement inputUserName;

    @FindBy(css = "#password")
    private WebElement inputPass;

    @FindBy(css = "#login-button")
    private WebElement btnLogin;

    public void getTitleSauce(){
        String titleSauceDemo = loginTitle.getText();
        Assert.assertEquals("Swag Labs", titleSauceDemo);
        //Assert.assertTrue(titleSauceDemo.contains("Swag Labs"));
        //Assert.assertTrue(titleSauceDemo.);
    };

    public void setInputUserName(String userName) {
        inputUserName.sendKeys(userName);
    }

    public void setInputPass(String inPass) {
        inputPass.sendKeys(inPass);
    }

    public void setBtnLogin() {
        btnLogin.click();
    }

    public void loginIntoSauceDemo(String user, String pass){
        this.setInputUserName(user);
        this.setInputPass(pass);
        this.setBtnLogin();
    }
    public SauceDemoTest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
