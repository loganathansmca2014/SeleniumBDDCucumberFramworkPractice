package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrderPageLocators {


@FindBy(xpath = "(//div[@class='a-box-inner'])")
public static List<WebElement> orderListTimes;
}
