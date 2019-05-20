package stepdefinitions;



import org.cucumber.object.repository.FacebookHomePage;
import org.cucumber.object.repository.FacebookLoginPage;

import commonutils.SeleniumMethods;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginScreen extends SeleniumMethods {
	
	FacebookLoginPage loginTest = new FacebookLoginPage();
	FacebookHomePage homePage = new FacebookHomePage();
	
	/*@Before
	 
	 // shows message as execution started before initiating the launch browser
	public void before() {	
		System.out.println("******Start Execution**********");	
	}
	
	@After
	
	//Closes the browser once completing the scenario
	public void after() {
		closeAllBrowsers();
	}*/
	
	//Scenario for login facebook and create post
	
	@Given ("^I launch the (.*)$")
	public void I_launch_the_browser(String browser) {
		loginTest.launchBrowser(browser);
	}

	@And ("^I pass the (.*)$")
	public void I_pass_the_URL(String URL) {
		loginTest.passURL(URL);
	}
	
	@And ("^I enter (.*) and (.*)$")
    public void I_enter_username_and_password(String uname, String pwd) {
		loginTest.enterUserNameAndPassword(uname, pwd);
	}

	@And ("^I click on login button$")
	public void I_click_on_login() {
		loginTest.clickLogin();
				
	}
	

	@And ("^I should land on homepage and enter (.*) in the create post section$")
	public void I_should_land_on_homepage_and_enter_hello_world_in_Create_post_Section(String post) {
		
		homePage.CheckLoginVerification();
		homePage.TypePost(post);
	}
	
	@And ("^I click on share button$")
	public void I_should_click_on_Share_button() {
			homePage.CreatePost();
	}
	
	@And ("^I see post has been created successfully$")
	public void I_see_post_has_been_created_successfully() {
		
	}
}

