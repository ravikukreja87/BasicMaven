package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(name = "txtuname")
	public WebElement userNameTxt;

	@FindBy(name = "txtpwd")
	public WebElement passwordTxt;

	@FindBy(id = "loginbtn")
	public WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}