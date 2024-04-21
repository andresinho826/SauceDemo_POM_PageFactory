package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceLoginPage extends BasePage{
    WebDriver driver;

    @FindBy(css = ".login_logo")
    private WebElement loginTitle;

    @FindBy(css = "#user-name")
    private WebElement inputUserName;

    @FindBy(css = "#password")
    private WebElement inputPass;

    @FindBy(css = "#login-button")
    private WebElement btnLogin;

    @FindBy(className = "title")
    private WebElement productTitlePage;

    public void getTitleSauce(){
        //Assert.assertTrue(loginTitle.isDisplayed());
        //System.out.println("AQUIIII" + titleSauceDemo);
        //Assert.assertEquals("Swag Labs", titleSauceDemo);

        String titleSauceDemo = loginTitle.getText();
        Assert.assertTrue(titleSauceDemo.contains("Swag Labs"));

    }
    public SauceLoginPage(WebDriver driver){
        super(driver);
    }

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
        setInputUserName(user);
        setInputPass(pass);
        setBtnLogin();
    }
    public boolean succesLogin(){
        isElementDisplayed(productTitlePage);
        //String testing = productTitlePage.getText();
        //System.out.println("PAGE LOGIN - LUEGO PRODUCS  ____ "+testing);
        productTitlePage.isDisplayed();
        return true;

    }

}
