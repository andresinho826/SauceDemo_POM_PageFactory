package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompletePage extends  BasePage{

    WebDriver driver;

    @FindBy(className = "title")
    private WebElement completeTitlePage;

    @FindBy(css = "#back-to-products")
    private WebElement btnBackHome;

    @FindBy(className = "complete-header")
    private WebElement textOrderComplete;

    public CompletePage(WebDriver driver){
        super(driver);
    }

    public void setCompleteTitlePage(){
        isElementDisplayed(completeTitlePage);
        Assert.assertEquals(completeTitlePage.getText(), "Checkout: Complete!");
    }
    public void setBtnBackHome(){
        btnBackHome.click();
    }
    public void setTextOrderComplete(){
        Assert.assertEquals(textOrderComplete.getText(), "Thank you for your order!");
    }

}