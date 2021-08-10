package com.cucumber.stepdefinitions;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.Star_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Streaming_ClearPC {

	static Logger log = Logger.getLogger(Streaming_ClearPC.class.getName());

@Then("^Search for the asset$")
public void search_for_the_asset() throws Throwable {
	Star_User_Function.clickenter(ClearPC_Locators.Search_Text_x); 
	Star_User_Function.sleep(1000);
	Thread.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Asset_displaying_x);
	Thread.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Asset_displaying_x);
	Thread.sleep(1000);
	Star_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}

@Then("^Validate player functionality$")
public void validate_player_functionality() throws Throwable {
	Star_User_Function.sleep(1000);
	Star_User_Function.click(ClearPC_Locators.Streaming_PreviewPanel_x);
	
}
    
}