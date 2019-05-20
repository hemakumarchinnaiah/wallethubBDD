package org.cucumber.object.repository;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonutils.SeleniumMethods;

public class FacebookLoginPage extends SeleniumMethods{

	public void launchBrowser(String browser) {
		startApp(browser);
	}

	public void passURL(String URL) {
		passUrl(URL);
	}
	
	public void clickLogin() {
		click(locateElement("xpath", ("//label[@id='loginbutton']/input")));
	}
	
	public void clickLoginButton() {
		click(locateElement("u_0_3"));
	}
	
	
	public void enterUserNameAndPassword(String uname, String pwd){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(locateElement("id", "email")));
		type(locateElement("id", "email"), uname);
		type(locateElement("id", "pass"), pwd);
	}
}
