
package Util;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GlobalFunction  {
   // public static WebDriver driver;
    public static GlobalFunction INSTANCE = new GlobalFunction();
    public static Scenario scenario;
    static String testCaseID = "";
    private static  Logger logger = LogManager.getLogger(GlobalFunction.class.getName());
    public int rowno;

    @Before
    public void startTest(Scenario scenario) throws IOException {
        GlobalFunction.scenario=scenario;
        logger.info("Scenario called ");

        logger.info("###############################################################");
        System.out.println(scenario.getId());
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        logger.info("Test case Name:"+scenario.getName());

        logger.info("###############################################################");
        System.out.println("\n");
        for (String tag : scenario.getSourceTagNames()) {
            if (tag.contains("TC")) {
                testCaseID = tag.replace("@", "");
                logger.debug("Test case Tag:"+testCaseID.toString());

            }
        }
    }


    @After
    public static void TearDown() throws Exception {
        if (scenario.isFailed()) {
            try {

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                BufferedImage image = Shutterbug.shootPage(WebDriverFactory.getInstance().getDriver(), ScrollStrategy.BOTH_DIRECTIONS).getImage();
                ImageIO.write(image, "png", baos);
                baos.flush();
                scenario.embed(baos.toByteArray(), "image/png");

            } catch (Exception e) {
                e.printStackTrace();
            }
    WebDriverFactory.INSTANCE.driver.quit();
        }
      WebDriverFactory.INSTANCE.driver.quit();


    }
    @After
    public void embedScreenshot(Scenario scenario) {

      if (scenario.isFailed()) {
        try {
// byte[] screenshot = getScreenshotAs(OutputType.BYTES);
          byte[] screenshot = ((TakesScreenshot) WebDriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png");
        } finally {
          WebDriverFactory.getInstance().getDriver().quit();
        }
      }
    }

    public static void fullpageScreenshot() {
        if (scenario!=null&& !scenario.isFailed()) {
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                BufferedImage image = Shutterbug.shootPage(WebDriverFactory.getInstance().getDriver(), ScrollStrategy.BOTH_DIRECTIONS).getImage();
                ImageIO.write(image, "png", baos);
                baos.flush();
                scenario.embed(baos.toByteArray(), "image/png");

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }

    public static void selectionScreenshot() {
        if (scenario!=null &&!scenario.isFailed()) {
            try {
                final byte[] screenshot=((TakesScreenshot) WebDriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"image/png");

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }

    //Create instance for Resuable function
    public static GlobalFunction getInstance() {
        return INSTANCE;
    }

    public int getRowno() {
        return rowno;
    }

    public void setRow(int rowno) {
        this.rowno= rowno ;
    }
}
