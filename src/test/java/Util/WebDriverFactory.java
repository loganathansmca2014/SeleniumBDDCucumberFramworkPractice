package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
  public WebDriver driver;
  public static WebDriverFactory INSTANCE = new WebDriverFactory();


  public void setDriver() {
    ChromeOptions chromeoptions = new ChromeOptions();
    chromeoptions.setAcceptInsecureCerts(true);
    //chromeoptions.addArguments("-headless");
    chromeoptions.addArguments("-incognito");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(chromeoptions);
    WebDriverFactory.getInstance().getDriver().manage().window().maximize();



  }

  public WebDriver getDriver()
  {
    return driver;
  }

  public static WebDriverFactory getInstance() {
    return INSTANCE;
  }

}
