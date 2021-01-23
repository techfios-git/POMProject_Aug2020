package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
			//driver 2
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		//driver 2			//driver 1
		driver = BrowserFactory.init();
		
		//LoginPage loginPage = new LoginPage();	//driver 2
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardHeader();
		
		BrowserFactory.tearDown();
	}
	

}
