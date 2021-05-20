package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefination",
         monochrome = true, dryRun = false, strict = true, tags = ("~@RegressionTest"), 
         plugin = {
		 "html:Report/Html_Report",
		 "pretty",
		 "json:Reports/cucumber.json",                                                                                                                                            
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		 }
)
public class Test_Runner {
	public static WebDriver driver;// ---null driver

	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();

		driver = Base_Class.browserlaunch(browser);
	}

	@AfterClass
	public static void tearDowm() {
		driver.close();
	}
}
