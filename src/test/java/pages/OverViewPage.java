package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OverViewPage extends BasePage{
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement overViewTitlePage;

    @FindBy(css = "#cancel")
    private WebElement btnCancelOverView;

    @FindBy(css = "#finish")
    private WebElement btnFinish;

    public OverViewPage(WebDriver driver){
        super(driver);
    }

    public void setOverViewTitlePage(){

        isElementDisplayed(overViewTitlePage);
        Assert.assertEquals(overViewTitlePage.getText(), "Checkout: Overview");
    }
    public void setBtnCancelOverView(){
        btnCancelOverView.click();
    }
    public void setBtnFinish(){
        btnFinish.click();
    }


}
