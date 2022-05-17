package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy (xpath = "//*[contains(@type,'email')]")
    public static WebElement email;
    @FindBy(id = "continue")
    public static WebElement continueBtn;
    @FindBy(xpath ="//*[contains(@data-csa-c-slot-id,'nav-link-accountList')]")
    public  static   WebElement account;
    @FindBy(xpath = "//*[contains(@type,'password')]")
    public static WebElement pass;
    @FindBy(xpath = "(//*[contains(text(),'Sign in')])[2]")
    public static WebElement signBtn;

    @FindBy(xpath = "(//*[contains(@id,'signInSubmit')])")
    public static WebElement sgnBtn;

    @FindBy(xpath = "(//*[contains(@class,'a-alert-content')])[2]")
    public static WebElement errorlabel;
    @FindBy(xpath = "(//*[contains(@class,'a-box-inner a-alert-container')])[1]")
    public static WebElement usernameerrorlabel;


    @FindBy(xpath = "//*[contains(@class,'a-expander-prompt')]")
    public static WebElement needhelp;
    @FindBy(id = "ap-other-signin-issues-link")
    public static WebElement issuewithOthe;
}
