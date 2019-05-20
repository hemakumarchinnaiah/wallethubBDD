package commonutils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMethods{

	public static RemoteWebDriver driver;

	public void startApp(String browser)
	{
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (WebDriverException e) {			

		}
	}

	public void passUrl(String URL) {
		try {
			driver.get(URL);

		} catch (WebDriverException e) {			

		}


	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case("id"): return driver.findElementById(locValue);
			case("link"): return driver.findElementByLinkText(locValue);
			case("xpath"):return driver.findElementByXPath(locValue);
			case("name"): return driver.findElementByName(locValue);
			case("class"): return driver.findElementByClassName(locValue);
			case("tag"):return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e) {

		} catch (WebDriverException e) {

		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			String x = ""+ele;

		} catch (InvalidElementStateException e) {

		} catch (WebDriverException e) {

		}
	}

	public void click(WebElement ele) {
		String text = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));			
			text = ele.getText();
			ele.click();

		} catch (InvalidElementStateException e) {

		} catch (WebDriverException e) {

		} 
	}

	public void clickWithNoSnap(WebElement ele) {
		String text = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));	
			text = ele.getText();
			ele.click();			

		} catch (InvalidElementStateException e) {

		} catch (WebDriverException e) {

		} 
	}

	public String getText(WebElement ele) {	
		String bReturn = "";
		try {
			bReturn = ele.getText();
		} catch (WebDriverException e) {

		}
		return bReturn;
	}

	public String getTitle() {		
		String bReturn = "";
		try {
			bReturn =  driver.getTitle();
		} catch (WebDriverException e) {

		} 
		return bReturn;
	}

	public String getAttribute(WebElement ele, String attribute) {		
		String bReturn = "";
		try {
			bReturn=  ele.getAttribute(attribute);
		} catch (WebDriverException e) {

		} 
		return bReturn;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);

		} catch (WebDriverException e) {

		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			new Select(ele).selectByIndex(index);

		} catch (WebDriverException e) {

		} 

	}

	public boolean verifyTitle(String title) {
		boolean bReturn =false;
		try {
			if(getTitle().equals(title)) {

				bReturn= true;
			}else {

			}
		} catch (WebDriverException e) {

		} 
		return bReturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).equals(expectedText)) {

			}else {

			}
		} catch (WebDriverException e) {

		} 

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(getText(ele).contains(expectedText)) {

			}else {

			}
		} catch (WebDriverException e) {

		} 
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).equals(value)) {

			}else {

			}
		} catch (WebDriverException e) {

		} 

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(getAttribute(ele, attribute).contains(value)) {
			}
			else {

			}
		} catch (WebDriverException e) {

		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected()) {

			} else {

			}
		} catch (WebDriverException e) {

		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed()) {

			} else {

			}
		} catch (WebDriverException e) {

		} 
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {

		} catch (WebDriverException e) {

		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);

		} catch (NoSuchFrameException e) {

		} catch (WebDriverException e) {

		} 
	}

	public void acceptAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();

		} catch (NoAlertPresentException e) {

		} catch (WebDriverException e) {

		}  
	}

	public void dismissAlert() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();

		} catch (NoAlertPresentException e) {

		} catch (WebDriverException e) {

		} 

	}

	public String getAlertText() {
		String text = "";		
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {

		} catch (WebDriverException e) {

		} 
		return text;
	}

	public long takeSnap(){
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}

	public void closeBrowser() {
		try {
			driver.close();

		} catch (Exception e) {

		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();

		} catch (Exception e) {

		}
	}
}
