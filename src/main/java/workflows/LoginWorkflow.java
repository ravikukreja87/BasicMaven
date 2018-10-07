package workflows;

import org.openqa.selenium.WebDriver;

import constants.LoginConstants;
import pages.BasePage;
import pages.LoginPage;
import utils.WebDriverUtils;

public class LoginWorkflow {
	
	public void loginSteps(WebDriver driver) {
		BasePage basePage = new BasePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		WebDriverUtils.printPageURL(driver);
		basePage.loginDropDown.click();
		loginPage.userNameTxt.sendKeys(LoginConstants.USER_NAME);
		loginPage.passwordTxt.sendKeys(LoginConstants.PASS);
		loginPage.loginBtn.click();
		WebDriverUtils.printPageURL(driver);
		
	}

}
