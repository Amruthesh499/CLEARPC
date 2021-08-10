package com.cucumber.stepdefinitions;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;

import Utilities.Star_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout_ClearPC {

	static Logger log = Logger.getLogger(Login_Logout_ClearPC.class.getName());
	
	@Given("^Open Browser and naviagate to the ClearPC portal$")
	public void Open_the_browser_and_navigate_to_the_ClearPC_Portal() throws Throwable {
		ClearPC_Locators.getlocators();
		Star_User_Function.geturl(ClearPC_Locators.Prod_PORTAL_d);
		Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to Production Login Portal");
		log.info("Navigated to Production Login Portal");
	}

	@When("^Enter the valid user name in username input field$")
	public void enter_the_valid_user_name_in_username_input_field() throws Throwable {
		Star_User_Function.inserttext(ClearPC_Locators.Prod_User_x,ClearPC_Locators.Prod_User_d);
		Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Valid username is entered in usename field");
		log.info("Valid username is entered in usename field");
	}

	@Then("^Click on Continue button of ClearPC$")
	public void click_on_Continue_button_of_ClearPC() throws Throwable {
	    Star_User_Function.click(ClearPC_Locators.Prod_Continue_button_x);
	    System.out.print("Clicked on Continue button");
	    Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Continue button");
		log.info("Clicked on Continue button");
	}

	@Then("^Enter the Valid password in the Password input field$")
	public void enter_the_valid_password_in_the_Password_input_field() throws Throwable {
		Star_User_Function.waitFor();
		Star_User_Function.inserttext(ClearPC_Locators.Prod_Password_x,ClearPC_Locators.Prod_pwd_wr_d);
		Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Entered valid password");
		log.info("Entered valid password");
	}

	@Then("^Click on Login button of ClearPC$")
	public void click_on_Login_button_of_ClearPC() throws Throwable {
	    Star_User_Function.click(ClearPC_Locators.Prod_Login_x);
	    Star_User_Function.waitFor();
	    Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Login button of PC CLEAR tenant");
		log.info("Clicked on Login button of PC CLEAR tenant");
	  }

	

	@Then("^Click on Logout button from ClearPC$")
	public void click_on_Logout_button_from_ClearPC() throws Throwable {
		Star_User_Function.waitFor();
		Star_User_Function.click(ClearPC_Locators.Prod_Username_x);
		Star_User_Function.sleep(1000);
	    Star_User_Function.click(ClearPC_Locators.Prod_Logout_x);
	    Star_User_Function.waitFor();
	    Star_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Logged out successfully");
		log.info("Logged out successfully");
		Thread.sleep(1000);
	}

	@Then("^Quit the browser for ClearPC$")
	public void quit_the_browser_for_ClearPC() throws Throwable {
		Thread.sleep(1000);
		Star_User_Function.validateElement(ClearPC_Locators.Prod_Login_x, "LOGIN");
		Star_User_Function.waitFor();
	    Star_User_Function.quit();
	    Reporter.addStepLog("Browser is closed");
		log.info("Browser is closed");
	    
	}
	
	
}
