package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.LoginConstants;
import workflows.AddLeadWorkflow;
import workflows.LoginWorkflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddLeadTest {
	WebDriver driver;
	LoginWorkflow loginWorkflow = new LoginWorkflow();
	AddLeadWorkflow addLeadWorkflow = new AddLeadWorkflow();
	
	@Test
	public void addLeadTest() {
		loginWorkflow.loginSteps(driver);
		
		addLeadWorkflow.addALead(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
		driver.get(LoginConstants.URL);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
