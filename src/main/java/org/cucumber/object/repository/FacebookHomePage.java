package org.cucumber.object.repository;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonutils.SeleniumMethods;

public class FacebookHomePage extends SeleniumMethods{

	public void CheckLoginVerification() {
		try {
			if(locateElement("link",("Home")).isDisplayed()) {
				//reportStep("User landed on homepage successfully","PASS");
			} else {
				//reportStep("USer not landed on Homepage successfully","FAIL");
			}
		} catch (WebDriverException e) {
			//reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}
	
		
	public void CreatePost() {
		click(locateElement("xpath",("//a[@loggingname='status_tab_selector']//span//span[contains(text(),'Post')]")));
		
	}
	
	public void TypePost(String post) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(locateElement("xpath", ("//div[@class = 'clearfix _ikh']/div[2]/div/div[contains(text(),something)]"))));
		type(locateElement("xpath", ("//div[@class = 'clearfix _ikh']/div[2]/div/div[contains(text(),something)]")), post);
		
	}
	
	public void ClickPostButton() {
		click(locateElement("//button[@type='submit']/span[contains(text(),'Share')]"));
			}
	
	
	public void verifyLogout() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(locateElement("xpath","(//a[@data-target='#login-popup'])[2]")));
			if(locateElement("xpath","(//a[@data-target='#login-popup'])[2]").isDisplayed()) {
				//reportStep("User successfully logs out of the application","PASS",false);
			} else {
				//reportStep("User is unable to logout of the application","FAIL");
			}
		} catch (WebDriverException e) {
			//reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}
}
