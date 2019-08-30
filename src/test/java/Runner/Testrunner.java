package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * Selenium Cuucmber Runner file
 * @author ajithkumar.s
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features", glue= {"seleniumgluecode"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},  

monochrome = true 

        ) 


public class Testrunner { 

    @AfterClass 

    public static void writeExtentReport() { 

        Reporter.loadXMLConfig(new File("config/report.xml")); 

     

    } 
}
