package com.cucumber.stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClearPC_Locators

{
	
	// QA TEST DATA loading from Test_Data Properties file
	
	
	public static String Prod_PORTAL_d;
	public static String Prod_User_d;
	public static String Prod_pwd_wr_d;
	
	
	// Locating XPATH from Elements_Xpath Properties test file
	
	public static String Prod_User_x;
	public static String Prod_Continue_button_x;
	public static String Prod_Password_x;
	public static String Prod_Login_x ;
	public static String Prod_Username_x;
	public static String Prod_Logout_x;
	public static String CBS_Tenant_x;
	public static String Search_icon_x;
	public static String Search_Text_x;
	public static String Supportproject_x;
	public static String Asset_3doticon_x;
	public static String Asset_title_x;
	public static String Asset_displaying_x;
	public static String Download_x;
	public static String Download_initiated_alert_x;
	public static String Streaming_PreviewPanel_x;
	
	public static void getlocators() throws IOException {

		// Create FileInputStream Object for test data
		FileInputStream fileInput = new FileInputStream(new File("D:\\STAR_QA\\src\\test\\resources\\Data\\ClearPC_Testdata.properties"));

		// Create Properties object
		Properties prop = new Properties();

		//Loading Data from Test_Data Properties test file
		prop.load(fileInput);
		
		Prod_PORTAL_d = prop.getProperty("Prod_PORTAL_d");
		Prod_pwd_wr_d = prop.getProperty("Prod_pwd_wr_d");
		Prod_User_d = prop.getProperty("Prod_User_d");
		
	
		

		// Create FileInputStream Object for XPATH VALUES 
		
		FileInputStream Inputxpath = new FileInputStream(new File("D:\\STAR_QA\\src\\test\\resources\\Data\\ClearPC_Xpath.properties"));

		// Create Properties object
		Properties prop1 = new Properties();

		// // loading XPATH from Elements_Xpath Properties test file
		prop1.load(Inputxpath);

		Prod_User_x = prop1.getProperty("Prod_User_x");
		Prod_Continue_button_x = prop1.getProperty("Prod_Continue_button_x");
		Prod_Password_x = prop1.getProperty("Prod_Password_x");
		Prod_Login_x = prop1.getProperty("Prod_Login_x");
		Prod_Username_x = prop1.getProperty("Prod_Username_x");
		Prod_Logout_x = prop1.getProperty("Prod_Logout_x");
		CBS_Tenant_x = prop1.getProperty("CBS_Tenant_x");
		Search_icon_x = prop1.getProperty("Search_icon_x");
		Search_Text_x = prop1.getProperty("Search_Text_x");
		Supportproject_x = prop1.getProperty("Supportproject_x");
		Asset_3doticon_x = prop1.getProperty("Asset_3doticon_x");
		Asset_title_x = prop1.getProperty("Asset_title_x");
		Asset_displaying_x = prop1.getProperty("Asset_displaying_x");
		Download_x  = prop1.getProperty("Download_x");
		Download_initiated_alert_x = prop1.getProperty("Download_initiated_alert_x");
		Streaming_PreviewPanel_x = prop1.getProperty("Streaming_PreviewPanel_x");
		}

}
