package Utilities;

import java.io.File;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
	
		ChromeOptions options = new ChromeOptions();
//			options.addArguments("--incognito");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			System.setProperty("webdriver.chrome.driver", "E:\\Satish_workspace1\\EMS_Test_Automation\\driver\\chromedriver.exe");
//			System.setProperty("webdriver.gecko.driver","E:\\Satish_workspace1\\EMS_Test_Automation\\driver\\geckodriver.exe");
			driver = new ChromeDriver(cap);
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
			driver.navigate().to("C:\\Users\\tm_jyothiVNK\\Pictures\\Singtel - Business Portal.html");			
			
			Thread.sleep(8000);
//			
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy(0,250)", "");
//			
//			WebElement dropdownWithSelect = driver.findElement(By.xpath("//*[@id='overlayForm:unitNo']"));
//			
//			Select select = new Select(dropdownWithSelect);
//			select.selectByVisibleText("#01-94");

//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			// Now you can do whatever you need to do with it, for example copy somewhere
//			String destFile=System.getProperty("user.dir")+"\\Screenshots\\screenshot"+ 1 +".png";
//			FileUtils.copyFile(scrFile, new File(destFile));
			
//			WebElement d=driver.findElement(By.xpath("//*[@id='tcal']/table[2]/tbody"));
//			List<WebElement> date=d.findElements(By.tagName("td"));
//			//*[@id="tcal"]/table[2]/tbody/tr[1]
//			//*[@id="tcal"]/table[2]/tbody/tr[5]
//			System.out.println(date.size());
//			System.out.println(date);
			
			//*[@id='tcal']/table[2]/tbody/tr[3]/td[5]
			
			WebElement dateWi = driver.findElement(By.id("tcal"));
			List<WebElement> dateWidget1 = dateWi.findElements(By.tagName("table"));
			for (int i = 0; i < dateWidget1.size(); i++) {
				if(i==2){
					WebElement dateWidget2 = dateWidget1.get(i).findElement(By.tagName("tr"));
					java.util.List<WebElement> columns1 = dateWidget2.findElements(By.tagName("td"));
					System.out.println(columns1.get(0).getText());	
				}
				
			}
			

			
	}

}
