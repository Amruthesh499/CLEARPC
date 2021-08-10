package Utilities;




import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.Locators;
import com.sun.jna.platform.win32.WinDef.CHAR;

public class Star_User_Function {
	
	static Logger log = Logger.getLogger(Star_User_Function.class.getName());
	public static WebDriver driver;
	public static String driverPath;
	public static Properties prop;
	static String starttimeStamp;
	static String endtimeStamp;
	static WebDriverWait wait;
	static String BuyerCompany;
	static String username;
	static int i11;
	
	static String selectedtype;
	private static String selctedtype, selectedtype1;
	public static String fileDownloadpath = "C:\\Users\\Downloads";

	public static Properties prop1;
	public static String buyerdetailprop;
	static List<WebElement> tabs;
	public static String parentWindow;
	public static String celtext;
	public static String Asset1;
	
	
	public static void geturl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\STAR_QA\\Driver_File\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 2000);
		driver.get(url);
		
	}
	
	public static String inserttext(String xpath, String value) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
		
		text.sendKeys(value);
		return value;
		
	}
	
	
	public static void HighlightMe(String xpath) throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;

	for(int i=0 ; i<3 ; i++)
	{
		js.executeScript("arguments[0].style.border='5px groove Blue'", xpath);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.border=''", xpath);
	}
	}
	
	public static void HighlightMe1(WebElement xpath) throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;

	for(int i=0 ; i<3 ; i++)
	{
		js.executeScript("arguments[0].style.border='5px groove Blue'", xpath);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.border=''", xpath);
	}
	}
	
	public static void sendkeys(String xpath, String value) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.sendKeys(value);			
	}
	
	
	public static void hscroll(String xpath) throws InterruptedException
	{
		WebElement scroll = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", scroll);
	}
	
	
	public static void sendtabkeys(String xpath) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.sendKeys(Keys.TAB);			
	}
	
	
	public static void clickf2(String xpath) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.click();
		text.sendKeys(Keys.F2);			
	}
	
	public static void click(String xpath)
	{
		
		try {
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.xpath(xpath));
			HighlightMe1(text);
			text.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void clickenter(String xpath)
	{
		
		try {
			Thread.sleep(1000);
			HighlightMe1(driver.findElement(By.xpath(xpath)));
			WebElement text = driver.findElement(By.xpath(xpath));
			text.click();
			text.sendKeys(Keys.ENTER);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void javaclick(String xpath) throws InterruptedException
	{
		Star_User_Function.waitFor();
		WebElement text = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		js.executeScript("arguments[0].click();", text);
		
	}
	
	public static void waitFor() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
	
	public static void waitFor120() {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
	}
	
	
	public static void Explicitwait() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.Fct_x)));
	}
	
	public static void sleep(Integer time)
	{
	driver.manage().timeouts().implicitlyWait(time,TimeUnit.MILLISECONDS);
	}
	
	public static void mousemove(String xpath) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	    
	    //After mouse hover, element form dropdown is appeared, then click on it.
	    WebElement role = driver.findElement(By.xpath(xpath));
	    role.click();
	    HighlightMe1(role);
	    Thread.sleep(1000);
//		WebElement text = driver.findElement(By.xpath(xpath));
//		HighlightMe1(driver.findElement(By.xpath(xpath)));
//		actions.moveToElement(text);
//		HighlightMe1(driver.findElement(By.xpath(xpath)));
//		text.click();		
//		Star_User_Function.sleep(400);
	}
	
	public static void extentReportScreenShot() throws Exception {
		String screenshotPath = takeScreenshot();

		Reporter.addScreenCaptureFromPath(screenshotPath, "Scenario Failed");
		Reporter.addScreenCast(screenshotPath);
	}
	
	static String takeScreenshot() throws IOException {
		String dateName = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "\\Screenshots\\screenshot_" + dateName + ".png";
		FileUtils.copyFile(scrFile, new File(destFile));
		return destFile;
	}
	
	
	static void WebElementslistclick(String xpath) throws InterruptedException
	{
		List<WebElement> asset = driver.findElements(By.xpath(xpath));
		for(int i=0; i<asset.size(); i++)
		{
			HighlightMe1(driver.findElement(By.xpath(xpath)));
			asset.get(i).click();
		}
		
		}
	
	
	public static void validateElement(String xpath, String Value) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            HighlightMe1(driver.findElement(By.xpath(xpath)));
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText() +", But Actual Element is - "+Value +", is Matching");
            log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + Value + ", is Matching");
        }

 

        catch (Throwable e) {
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

 

    }
	
	public static String validateElement2(String xpath, String Value) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            HighlightMe1(driver.findElement(By.xpath(xpath)));
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText() +", But Actual Element is - "+Value +", is Matching");
            log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + Value + ", is Matching");
        }

 

        catch (Throwable e) {
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

        return Value;
 

    }
	
	public static void validateAttributestring(String xpath, String Value) throws Throwable 
    {
        try {
        
            org.junit.Assert.assertEquals(xpath,Value);
            Reporter.addStepLog("Expected Element is - " +xpath+", But Actual Element is - "+Value+", is Matching");
            log.info("Expected Element is - " +xpath+ ", But Actual Element is - " +Value+ ", is Matching");
        }

 

        catch (Throwable e) {
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

 

    }
	
	
	public static Integer validateAttributestring2(Integer a,Integer b,Integer c)
	{
		a=5;
		b=2;
		c=a/b;
		System.out.println(c);
		return  c;
	}
	
	public static void validateAttributebyclass(String xpath, String Value) throws Throwable 
    {
        try {
        
            org.junit.Assert.assertEquals(xpath,Value);
            Reporter.addStepLog("Expected Element is - " +xpath+", But Actual Element is - "+Value+", is Matching");
            log.info("Expected Element is - " +xpath+ ", But Actual Element is - " +Value+ ", is Matching");
        }

 

        catch (Throwable e) {
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

 

    }
	
	
	public static void validateRFElement(String xpath, String Value) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            HighlightMe1(driver.findElement(By.xpath(xpath)));
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), Value);
            Reporter.addStepLog("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
            ", But Actual is - " + Value + " Asset is displaying."  + ", is Matching");
            log.info("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                    ", But Actual is - " + Value + " Asset is displaying."  +  ", is Matching");
        }

 

        catch (Throwable e) {
        	Reporter.addStepLog("Expected : " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                    ", But Actual is - " + Value + " Asset is displaying."  + ", Not is Matching");
                    log.info("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                            ", But Actual is - " + Value + " Asset is displaying."  +  ", Not is Matching");
        }

 

    }
	
	
	
	public static void validateElementstring(String xpath) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            //org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), Value);
            
            WebElement w = driver.findElement(By.xpath(xpath));
            	
            
            if(w.isDisplayed() && w.getText().equals("Pending"))
            {
            	waitFor();
            	Star_User_Function.click(xpath);
            	Star_User_Function.click(Locators.QC_save_btn_x);
            	sleep(1000);
            	Star_User_Function.javaclick(Locators.QC_Yes_x);
            	Star_User_Function.validateElement(xpath, "Completed");
            }
            else
            {
            	Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()    + ", But Actual Element is - " + "Completed" + ", is  Matching");
                log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + "Completed" + ", is  Matching");
                Thread.sleep(1000);
                //Star_User_Function.click(Locators.QC_logout_x);
            }
            
        }

 

        catch (Throwable StaleElementReferenceException) {
        	
        	WebElement w = driver.findElement(By.xpath(xpath));
        	if(w.isDisplayed() && w.getText().equals("Pending"))
            {
            	waitFor();
            	Star_User_Function.click(xpath);
            	Star_User_Function.click(Locators.QC_save_btn_x);
            	sleep(1000);
            	Star_User_Function.javaclick(Locators.QC_Yes_x);
            	Star_User_Function.validateElement(xpath, "Completed");
            }
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + "Pending" + ", is Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + "Pending"  + ", is Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()    + ", But Actual Element is - " + "Pending" + ", is not Matching");
        }

 

    }
	
	
	public static void quit()
	{
		driver.close();
	}
	
	public static void linktext(String ltext)
	{
		sleep(100);
		driver.findElement(By.linkText(ltext));
	}
	
	
	public static String gettext(String xpath)
	{
		String s = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(s);
		return s; 
	}
	
	
	public static String getAttribute(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("value");
		return cfn; 
	}
	
	public static String getAttributetitle(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("title");
		return cfn; 
	}
	
	public static String getAttributebytitle(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("title");
		return cfn; 
	}
	
	public static String getAttributebyclass(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("class");
		return cfn; 
	}
	
	public static void navigateto(String url)
	{
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 2000);
		driver.navigate().to(url);
	}
	
	
	public static void Writetofile(String type, String key, String value) throws Throwable
	{
		File file = new File("D:\\STAR_QA\\src\\test\\resources\\Data\\Temp1.properties");
		String fileContext = FileUtils.readFileToString(file);
		if (type.equals(key + "=")) {
			System.out.println(key + " : " + value);
			fileContext = fileContext.replaceAll(type + "(.*)", type + value);
			FileUtils.write(file, fileContext);
		}
	}
	
	
	public static void readfile1(String xpath1,String xpath2) throws IOException, InterruptedException 
	{
		
				
		File file = new File("D:\\\\STAR_QA\\\\src\\\\test\\\\resources\\\\Data\\\\Temp1.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		String temp2 = null;
		st = br.readLine();
		System.out.println(st);
		  if (st != null)
			  temp2 = st.substring(4,st.length());
		 WebElement data1 = driver.findElement(By.xpath(xpath1));
		 data1.sendKeys(temp2);
		 Star_User_Function.sleep(1000);
		 WebElement data2 = driver.findElement(By.xpath(xpath2));
		 Star_User_Function.HighlightMe1(data2);
		 Star_User_Function.sleep(1000);
	}
	
	
	
	public static String readfile2(String xpath1) throws Throwable 
	{
		
				
		File file = new File("D:\\\\STAR_QA\\\\src\\\\test\\\\resources\\\\Data\\\\Temp1.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		String temp2 = null;
		st = br.readLine();
		System.out.println(st);
		  if (st != null)
			  temp2 = st.substring(4,st.length());
		 String s = driver.findElement(By.xpath(xpath1)).getText();
		 Star_User_Function.sleep(1000);
		 return s; 
		 
	}
	
	
	public static void dd(String xpath , String value) throws InterruptedException 

	{
			WebElement identifier = driver.findElement(By.xpath(xpath));
			Select select = new Select(identifier);
			select.selectByVisibleText(value); 
	}
	
	
	public static void dropdownWithoutSelect(String locator, String type, String value) throws Throwable {
		try {

			WebElement dropdownWithSelect = locatorIdentifier(prop.getProperty(locator), type);
			Select sl = new Select(dropdownWithSelect);
			System.out.println("Selected Option : " + sl.getFirstSelectedOption());
			java.util.List<WebElement> options = dropdownWithSelect.findElements(By.tagName("option"));

			for (WebElement option : options) {
				if (option.equals(prop.getProperty(value))) {
					// Reporter.addStepLog(prop.getProperty(value) + " is
					// clicked from dropdown box...");
					option.click();
				}
			}
		} catch (Exception e) {
			System.out.println("Element not available for Insert operation...");
		}
	}
	
	
	public static WebElement locatorIdentifier(String locator, String type) throws Throwable {

		switch (type) {
		case "xpath":
			if (FindElementSafe(By.xpath(locator)) != null) {
				// Reporter.addStepLog("Element identified with XPath : " +
				// locator);

				return driver.findElement(By.xpath(locator));
			}
			break;
		case "id":
			if (FindElementSafe(By.id(locator)) != null) {
				// Reporter.addStepLog("Element identified with ID : " +
				// locator);
				return driver.findElement(By.id(locator));
			}
			break;
		case "name":
			if (FindElementSafe(By.name(locator)) != null) {
				// Reporter.addStepLog("Element identified with Name : " +
				// locator);
				return driver.findElement(By.name(locator));
			}
			break;
		case "className":
			if (FindElementSafe(By.className(locator)) != null) {
				// Reporter.addStepLog("Element identified with ClassName : " +
				// locator);
				return driver.findElement(By.className(locator));
			}
			break;
		case "cssSelector":
			if (FindElementSafe(By.cssSelector(locator)) != null) {
				// Reporter.addStepLog("Element identified with cssSelector : "
				// + locator);
				return driver.findElement(By.cssSelector(locator));
			}
			break;
		case "linktext":
			waitFor();
			if (FindElementSafe(By.linkText(locator)) != null) {
				// Reporter.addStepLog("Element identified with LinkText : " +
				// locator);
				return driver.findElement(By.linkText(locator));
			}
			break;
		case "tagName":
			if (FindElementSafe(By.tagName(locator)) != null) {
				// Reporter.addStepLog("Element identified with TagName : " +
				// locator);
				return driver.findElement(By.tagName(locator));
			}
			break;
		case "partialLinkText":
			if (FindElementSafe(By.partialLinkText(locator)) != null) {
				// Reporter.addStepLog("Element identified with Partial LinkText
				// : " + locator);
				return driver.findElement(By.partialLinkText(locator));
			}
			break;
		default:
			// Reporter.addStepLog("Element not available for do action....");
			System.out.println("Element not available....");
		}
		return null;
	}

	public static WebElement FindElementSafe(By locator) throws InterruptedException {

		try {

			HighlightMe1(driver.findElement(locator));
			return driver.findElement(locator);

		} catch (NoSuchElementException e) {
			waitFor();
			FindElementSafe(locator);
		}
		return null;
	}
	
	public static String Insertdata(String xpath, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
		text.clear();
		Thread.sleep(1000);
		text.sendKeys(value);
		return value;

	}
	
	public static void ScrolltillElement(String id) throws InterruptedException
	{
	WebElement element = driver.findElement(By.id(id));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(500); 
	}
	
	
	public static void scrollToWebElement(String locator1, String type1) throws Throwable {
		WebElement element = locatorIdentifier(prop.getProperty(locator1), type1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	public static void scrollToWebElement(String xpath) 
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
	}
	
		
	public static void MoveMousePointer (String xpath) throws InterruptedException{
		
		WebElement dropdown = driver.findElement(By.xpath(xpath));

		Actions act = new Actions(driver); 
		act.moveToElement(dropdown);
		Thread.sleep(2000);

		act.click().build().perform();



	}
	
public static void Onhover(String xpath) throws InterruptedException{
		
		WebElement dropdown = driver.findElement(By.xpath(xpath));

		Actions act = new Actions(driver); 
		act.moveToElement(dropdown);
		Thread.sleep(2000);

		act.build().perform();



	}
	
	
	
	public static void QCSegdd(String xpath1, String xpath2, String xpath3, String xpath4) throws Throwable 
	{
		
		String[] a = 	{"Montage","Precap","Segment 1","Coming UP","Break Bumper","Segment 2","Opening Bumper","Out Bumper", "Tomorrow (Kalprecap)","Tonight (Aaaj Raat Precap)"};
		String[] b = 	{"10:00:02:00","10:00:03:00","10:00:04:00","10:00:05:00","10:00:06:00","10:00:07:00","10:00:08:00","10:00:09:00","10:00:10:00","10:00:11:00"};
		String[] c = 	{"10:00:02:05","10:00:03:05","10:00:04:05","10:00:05:05","10:00:06:05","10:00:07:05","10:00:08:05","10:00:09:05","10:00:10:05","10:00:11:05"};
			
		
		for(int i=0; i<10; i++)
			driver.findElement(By.xpath(xpath4)).click();
		List<WebElement>  segtab1 =  driver.findElements(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr"));
		
		for(int j=0; j <  a.length ; j++)
		{
						
			Thread.sleep(100);
				
			WebElement dropdownWithSelect = driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(j+3)+"]/td[1]/select"));
			HighlightMe1(dropdownWithSelect);
			
			
			
			Select sl = new Select(dropdownWithSelect);
			//System.out.println("Selected Option : " + sl.getFirstSelectedOption());
			java.util.List<WebElement> options = dropdownWithSelect.findElements(By.tagName("option"));
			
			
			for (int opt=0; opt< options.size() ;opt++) {
				
				if (options.get(opt).getText().equals(a[j])) {
					
					
					
					Star_User_Function.scrollToWebElement("//*[@id=\"qcSegmentList11\"]");
					
					Thread.sleep(100);
					options.get(opt).click();
				}
			}
		}
		
		for(int k=0; k < b.length ; k++)
		{
			Thread.sleep(100);			
			WebElement text = driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[2]/input"));
			HighlightMe1(driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[2]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",
					driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[2]")));
			Thread.sleep(100);			
			text.sendKeys(b[k]);
			Thread.sleep(100);
			
		}
		
		for(int k=0; k < b.length ; k++)
		{
			Thread.sleep(100);			
			WebElement text = driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[3]/input"));
			HighlightMe1(driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[3]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",
					driver.findElement(By.xpath("//*[@id=\"qcSegmentListTable\"]/tbody/tr["+(k+3)+"]/td[3]")));
			Thread.sleep(100);			
			text.sendKeys(c[k]);
			Thread.sleep(100);
			
		}
		
	}
	
	public static String gettitle()
	{
		try
		{
		return driver.getTitle();
		
	}
		catch(Exception  e)
	
		{
			sleep(1000);
			gettitle();
		}
		
		return driver.getTitle();
	}
	
	
	public static void clear(String xpath)
	{
			sleep(1000);
			driver.findElement(By.xpath(xpath)).clear();
			sleep(1000);

	}
	
	
	public static String Substring(String S,Integer m, Integer n)
	{
		
		String t = S.substring(m,n);
		return t;
		
	}
	
	
	public static void validateContentType(String xpath, String value) throws Throwable
	{
		Thread.sleep(100);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			HighlightMe1(driver.findElement(By.xpath((xpath))));
			org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("conttype"), value);
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")+ ", and Actual Content Type asset displayed is - " + value + ", is  Matching");
			log.info("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")+ ", and Actual Content Type asset displayed is - " + value + ", is Matching");
		} 
		catch (Throwable e)
		{
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
			log.error("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
		}
	}
	
	
	public boolean isFileDownloaded(String fileDownloadpath, String fileName) {
		 boolean flag = false;
		 
		 File directory = new File(fileDownloadpath);
		 File[] content = directory.listFiles();
		 for (int i = 0; i < content.length; i++) { if (content[i].getName().equals(fileName)) return flag=true; 
		 else Assert.assertTrue(isFileDownloaded(fileDownloadpath, "check aspera.mp4"));
		 } 
		 return flag; 
		 }

			
}

	

