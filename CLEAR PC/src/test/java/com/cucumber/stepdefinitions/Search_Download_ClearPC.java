package com.cucumber.stepdefinitions;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.Star_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Download_ClearPC {

	static Logger log = Logger.getLogger(Search_Download_ClearPC.class.getName());

@Then("^Click on Search icon$")
public void click_on_Search_icon() throws Throwable {
	ClearPC_Locators.getlocators();
	Star_User_Function.click(ClearPC_Locators.CBS_Tenant_x);
	Thread.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Supportproject_x);
	Thread.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Search_icon_x);
	Star_User_Function.sleep(1000);
	Star_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Clicked on Search icon");
	log.info("Clicked on Search icon");
}

@Then("^Enter text value in Search field$")
public void enter_text_value_in_Search_field() throws Throwable {
	Star_User_Function.sendkeys(ClearPC_Locators.Search_Text_x,"check aspera");
	Star_User_Function.sleep(1000);
	Star_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Entered Text in Search textbox");
	log.info("Entered Text in Search textbox");    
}

@Then("^Search for asset$")
public void search_for_asset() throws Throwable {
	Star_User_Function.clickenter(ClearPC_Locators.Search_Text_x); 
	Star_User_Function.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Asset_displaying_x);
	Thread.sleep(1000);
	Star_User_Function.gettext(ClearPC_Locators.Asset_title_x);
	Star_User_Function.click(ClearPC_Locators.Asset_3doticon_x);
	Star_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}

@Then("^Select Download Operation from dropdown$")
public void select_Download_Operation_from_dropdown() throws Throwable {
	Star_User_Function.javaclick(ClearPC_Locators.Download_x);
	Star_User_Function.sleep(1000);
	Star_User_Function.validateElement(ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
	Star_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Download Operation is initiated from dropdown");
	log.info("Download Operation is initiated from dropdown");
	
}

@Then("^Validate Downloaded filename is correct or not$")
public void validate_Downloaded_filename_is_correct_or_not() throws Throwable {
	
}
    
    
}