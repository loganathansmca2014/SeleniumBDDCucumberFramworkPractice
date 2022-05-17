package BrowserAccess;

import BusinessLogic.BussinessFun;
import Util.GlobalFunction;
import Util.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang.SystemUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserControl {

    public static BrowserControl INSTANCE = new BrowserControl();
    static Properties prop = new Properties();
    public static String environment;
    public static String ChromeBrowser;
    public static String Firebox;
    public static String Edge;
    public static String IE;
    private static final Logger logger = LogManager.getLogger(BrowserControl.class.getName());

    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static void loadPropertiesFile() {

        try {
            //String filename = "src//test//resources//Browser.properties";
            String filename = "src/test/resources/Browser.properties";
            BrowserControl.class.getClassLoader().getResourceAsStream(filename);
            prop.load(new FileInputStream(filename));
            ChromeBrowser = prop.getProperty("ChromeBrowser");
            Firebox = prop.getProperty("FirefoxBrowser");
            IE = prop.getProperty("InternetExplorer");

            Edge = prop.getProperty("EdgeBrowser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openBrowser() {


        //Load the properties file
        loadPropertiesFile();
            if (ChromeBrowser.compareToIgnoreCase("Yes") == 0) {
                logger.debug("Driver initiated ");

                logger.debug("Chrome Browser lanuched Successfully");

                WebDriverManager.chromedriver().setup();
                //System.setProperty("webdriver.chrome.driver", getDriverPath());
                WebDriverFactory.getInstance().setDriver();
                threadLocalDriver.set(WebDriverFactory.INSTANCE.getDriver());
                threadLocalDriver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                environment = prop.getProperty("URl");
                logger.debug("URL" + environment);
                threadLocalDriver.get().get(environment);


            }

        if (Edge.compareToIgnoreCase("Yes") == 0) {
            logger.debug("Driver initiated ");
            WebDriverManager.edgedriver().setup();
            threadLocalDriver.set(WebDriverFactory.INSTANCE.getDriver());
            WebDriverFactory.getInstance().driver = new EdgeDriver();
            logger.debug("Edge Browser lanuched Successfully");
            WebDriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebDriverFactory.getInstance().getDriver().manage().window().maximize();
            environment = prop.getProperty("URl");
            logger.debug("URL" + environment);
            WebDriverFactory.getInstance().getDriver().get(environment);


        }

    }



    private String getDriverPath() {
        String driverPath = "drivers/%s";
        if (SystemUtils.IS_OS_MAC) {
            return String.format(driverPath, "chromedriver");
        } else {
            return String.format(driverPath, "chromedriver.exe");
        }

    }

    public static BrowserControl getInstance() {
        return INSTANCE;
    }

}
