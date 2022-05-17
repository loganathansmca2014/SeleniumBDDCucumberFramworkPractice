package BusinessLogic;

import PageLocators.HomePageLocators;
import PageLocators.LoginPageLocators;
import PageLocators.OrderPageLocators;
import Util.*;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class BussinessFun {

  public static BussinessFun INSTANCE = new BussinessFun();
  private static  Logger logger = LogManager.getLogger(BussinessFun.class.getName());

  /****************************************************************************************
   * DESCRIPTION:This method is used to fetch username and password for amazon portal
   * Created By:Loganathan Sengottaiyan
   * Created DATE:10 May 2021
   * UPDATED BY:
   * UPDATED DATE :
   * method:loginAuthentication(test test12345)
   * Example:
   * /
   ****************************************************************************************/
  public void loginAuthentication(String username, String pass) throws IOException {
    PageFactory.initElements(WebDriverFactory.getInstance().getDriver(), LoginPageLocators.class);
    logger.debug("Application property loaded");
    Actions act = new Actions(WebDriverFactory.getInstance().getDriver());
    act.moveToElement(LoginPageLocators.account).build().perform();
    LoginPageLocators.signBtn.click();
    String decodedString = new String(Base64.getDecoder().decode(pass.trim()));
    logger.debug("Decoded password:" + pass);
    LoginPageLocators.email.sendKeys(username);
    logger.debug("User name Entered :" + username);
    LoginPageLocators.continueBtn.click();
    if (LoginPageLocators.usernameerrorlabel.isDisplayed()) {
      GlobalFunction.scenario.write(LoginPageLocators.usernameerrorlabel.getText());
      GlobalFunction.selectionScreenshot();
    }
  if( LoginPageLocators.pass.isDisplayed()) {
    LoginPageLocators.pass.sendKeys(decodedString);
    LoginPageLocators.sgnBtn.click();
    GlobalFunction.selectionScreenshot();
  }

    if ((username.trim().isEmpty()) && (pass.trim().isEmpty())) {
      LoginPageLocators.sgnBtn.click();
      GlobalFunction.scenario.write(LoginPageLocators.errorlabel.getText());
    }


  }

  /****************************************************************************************
   * DESCRIPTION:This method is used to fetch list of ordered items
   * Created By:Loganathan Sengottaiyan
   * Created DATE:10 May 2021
   * UPDATED BY:
   * UPDATED DATE :
   * method:validateOerdeItms
   * Example:
   * /
   ****************************************************************************************/

  public void validateOerdeItms() {
    PageFactory.initElements(WebDriverFactory.getInstance().getDriver(), HomePageLocators.class);
    if (HomePageLocators.ordersItems.isDisplayed()) {
      HomePageLocators.ordersItems.click();
      GlobalFunction.scenario.write("Order items Clicked #:" + HomePageLocators.ordersItems.getText());
      logger.debug("Order items Clicked #:" + HomePageLocators.ordersItems.getText());

    }
  }


  public static BussinessFun getInstance() {
    return INSTANCE;
  }


  /****************************************************************************************
   * DESCRIPTION:This method is used to fetch latest order from list
   * Created By:Loganathan Sengottaiyan
   * Created DATE:10 May 2021
   * UPDATED BY:
   * UPDATED DATE :
   * method:userSelectLastestOrderAndViewDetails
   * Example:
   * /
   ****************************************************************************************/
  public void userSelectLastestOrderAndViewDetails() {
    PageFactory.initElements(WebDriverFactory.getInstance().getDriver(), HomePageLocators.class);

    List<String> view_Order = HomePageLocators.View_order_details.stream().map(WebElement::getText)
            .collect(Collectors.toList());
    for (String ActualViewOrder : view_Order) {
      if (ActualViewOrder.equalsIgnoreCase("View order details")) {
        HomePageLocators.View_order_details.stream().filter(It -> It.getText().equalsIgnoreCase("View order details")).findFirst().ifPresent(WebElement::click);
        //GlobalFunction.fullpageScreenshot();
        break;
      }
    }

  }

  /****************************************************************************************
   * DESCRIPTION:This method is used to fetch product information
   * Created By:Loganathan Sengottaiyan
   * Created DATE:10 May 2021
   * UPDATED BY:
   * UPDATED DATE :
   * method:userGetTheInformation
   * Example:
   * /
   ****************************************************************************************/
  public void userGetTheInformation() {
    PageFactory.initElements(WebDriverFactory.getInstance().getDriver(), HomePageLocators.class);
    PageFactory.initElements(WebDriverFactory.getInstance().getDriver(), OrderPageLocators.class);
    if (HomePageLocators.ordernumber.isDisplayed()) {
      GlobalFunction.scenario.write("Order#:" + HomePageLocators.ordernumber.getText());
      logger.debug("Order#:" + HomePageLocators.ordernumber.getText());
    }
    int count = 0;
    List<String> orderListTimes = OrderPageLocators.orderListTimes.stream().map(WebElement::getText)
            .collect(Collectors.toList());
    for (String actualorderDetails : orderListTimes) {
      if (actualorderDetails.equalsIgnoreCase(actualorderDetails)) {
        GlobalFunction.scenario.write("Order#:" + OrderPageLocators.orderListTimes.get(count).getText());
        logger.debug("Order#:" + OrderPageLocators.orderListTimes.get(count).getText());
      }
      count++;
    }
    GlobalFunction.fullpageScreenshot();
  }
}