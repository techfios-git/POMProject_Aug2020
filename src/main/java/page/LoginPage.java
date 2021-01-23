package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Lib
	/*
	 * WebElement USER_NAME_ELEMENT =
	 * driver.findElement(By.xpath("//*[@id='username']")); By USER_NAME_FIELD =
	 * By.xpath("//*[@id='username']");
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@name='login']")
	WebElement SIGNIN_BUTTON_FIELD;

	// Interactive Methods
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_FIELD.click();
	}

	/*
	 * public void loginIn(String userName, String password) {
	 * USERNAME_FIELD.sendKeys(userName); PASSWORD_FIELD.sendKeys(password);
	 * SIGNIN_BUTTON_FIELD.click(); }
	 */

}
