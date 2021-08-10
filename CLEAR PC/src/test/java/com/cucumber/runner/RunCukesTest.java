package com.cucumber.runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * A sample test to demonstrate
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/ClearPC.feature"},
		glue = {"com.cucumber.stepdefinitions"},
		
		
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		//tags = {"@T1Search_ContentType_Validation,@T2Search_LanguageFilter_Validation,@T3Search_QualityFilter_Validation"}
		//,@T7Search_ArchivalStatusFilter_Validation,@T8Search_CatalogueStatusFilter_Validation,@T9Search_PlayoutStatusFilter_Validation @T10Search_SubtitleStatusFilter_Validation"}
		//tags = {"@T1Login_Logout_ClearPC"}
		//tags = {"@T2Search_Autosuggestion_ClearPC"}
		tags = {"@T3Streaming_ClearPC"}
		)

public class RunCukesTest
{
	
    
	@BeforeClass
	public static void setup()
	{
		String dateName = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		ExtentProperties extentProperties = ExtentProperties.INSTANCE; 
		extentProperties.setProjectName("CL 2.0");
		extentProperties.setReportPath("output/CL_Test_Summary_Report_"+dateName+".html");
	
    }
	
	@AfterClass
	public static void teardown() 
	{
		
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     Reporter.setSystemInfo("Selenium", "2.53.0");
	     Reporter.setSystemInfo("Maven", "4.0.0");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
		 Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("Content Live Automation Testing");

	
		 
	}
}

