package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;


/**
 * @author loganat.sengottaiyan
 */

@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Stepdef"},
        tags = {"@Automation"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/html/POCReport.html","json:target/cucumber.json",
                "html:target/cucumber-reports/html",
       "rerun:target/failedrerun.txt" },
        monochrome = true)
public class TestRunnerJunit  {


    @AfterSuite
    public void TearDownReportGeneration() throws Exception {

       // GlobalFunction.driver.quit();

    }





}







