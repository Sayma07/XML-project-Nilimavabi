
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.BasePage;
import page.DashboardPage;
import page.loginpage;
import util.Browserfactory;

public class LoginTest extends BasePage {
	WebDriver driver;

	/*
	 * String username=null; String password =null;
	 */

@Test
	@Parameters({ "UserName", "Password" })

	public void validUserShouldBeAbleToLogin(String username,String password) throws InterruptedException {

		driver = Browserfactory.init();

		loginpage logInPage = PageFactory.initElements(driver, loginpage.class);

		logInPage.insertUserName(username);
		logInPage.insertPassword(password);
		logInPage.clickOnSignInButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);

		dashboard.validateDashboardHeader();
		
		//Browserfactory.tearDown();
	}


}