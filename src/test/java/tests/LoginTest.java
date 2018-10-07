package tests;

import org.testng.annotations.Test;

import constants.LoginConstants;
import workflows.LoginWorkflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	WebDriver driver;
	LoginWorkflow loginWorkflow = new LoginWorkflow();
	
	@Test
	public void loginTest() {
		loginWorkflow.loginSteps(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
		driver.get(LoginConstants.URL);
		driver.manage().window().maximize();
		
	}
	//Hooks

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		//clear cookies
		//delete cache
		//send email
		//close db connections
	}
}