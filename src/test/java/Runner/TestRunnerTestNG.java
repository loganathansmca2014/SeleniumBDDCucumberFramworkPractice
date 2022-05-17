package Runner;


import Util.ReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        features = "src/test/resources/Features/POC_Practices.feature",
        glue = {"Stepdef"},
        tags = {"@Automation"},
        plugin = { "json:target/cucumber.json",
                "html:target/cucumber-reports/html",
        "rerun:target/failedrerun.txt"},
        monochrome = true)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {


    @AfterSuite
    public void TearDownReportGeneration() throws Exception {
//GlobalFunction.driver.quit();
       ReportGeneration.generateJVMReport();

    }





}







