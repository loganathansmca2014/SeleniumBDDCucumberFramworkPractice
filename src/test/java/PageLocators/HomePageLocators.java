package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocators {
    @FindBy(xpath = "//a[@id='nav-orders']//span[1]")
    public static WebElement ordersItems;

    @FindBy(xpath = "//bdi[@dir='ltr']")
    public static WebElement ordernumber;

    @FindBy(xpath = "(//a[text()[normalize-space()='View order details']])")
    public static List<WebElement > View_order_details;
}
