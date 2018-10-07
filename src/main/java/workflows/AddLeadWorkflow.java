package workflows;

import org.openqa.selenium.WebDriver;

import constants.LeadConstants;
import pages.AddLeadPage;
import pages.HomePage;
import utils.WebDriverUtils;

public class AddLeadWorkflow {

	public void addALead(WebDriver driver) {
		AddLeadPage addLeadPage = new AddLeadPage(driver);
		HomePage homePage = new HomePage(driver);
		WebDriverUtils.printPageURL(driver);
		homePage.addLeadBtn.click();
		addLeadPage.leadNameTxt.sendKeys(LeadConstants.LEAD_NAME);
		WebDriverUtils.printPageURL(driver);
	}

}
