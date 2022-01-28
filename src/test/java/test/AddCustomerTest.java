package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.loginpage;
import util.Browserfactory;

public class AddCustomerTest {
	WebDriver driver;

	


	//@Test
	@Parameters({"UserName","Password","FullName","CompanyName","Email","Phone","Address","City","State","Zip","Group"})
	public void validUserShouldBeAbleToAddCustomer(String username,String password,String fullName,String companyName,String email,String phone,String address,String city,String state,String zip,String group) throws InterruptedException {
		driver=Browserfactory.init();
		loginpage logInPage=PageFactory.initElements(driver, loginpage.class);
		logInPage.insertUserName(username);
		logInPage.insertPassword(password);
		logInPage.clickOnSignInButton();
		DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardHeader();
		Thread.sleep(2000);
		dashboardpage.clickOnCustomerButton();
		dashboardpage.clickOnaddCustomerButton();
		
		AddCustomerPage addcustomerpage=PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.insertfullName(fullName);
	    addcustomerpage.insertCompanyNmae(companyName);
	    addcustomerpage.insertEmailAddress(email);
	    addcustomerpage.insertphoneNumber(phone);
	    addcustomerpage.insertaddress(address);
	    addcustomerpage.insertcityName(city);
	    addcustomerpage.insertstateName(state);
	    addcustomerpage.insertZipName(zip);
	    addcustomerpage.insertGroupNmae(group);
	    //addcustomerpage.insertCountryNmae(country);
	    addcustomerpage.clicksaveButton();
	    //Thread.sleep(5000);
	    addcustomerpage.clickOnListCustomerButton();
	    addcustomerpage.verifyEnterdNameandDelete();
	    //addcustomerpage.clickOnListCustomerButton();



	}
	@Test
	@Parameters({"UserName","Password","FullName","CompanyName","Email","Phone","Address","City","State","Zip","Group"})
	public void validUserShouldBeAbleToAddCustomerOnSearchButtonInListCustomerPage(String username,String password,String fullName,String companyName,String email,String phone,String address,String city,String state,String zip,String group) throws InterruptedException {
		driver=Browserfactory.init();
		loginpage logInPage=PageFactory.initElements(driver, loginpage.class);
		logInPage.insertUserName(username);
		logInPage.insertPassword(password);
		logInPage.clickOnSignInButton();
		DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardHeader();
		Thread.sleep(2000);
		dashboardpage.clickOnCustomerButton();
		
		
		
		AddCustomerPage addcustomerpage=PageFactory.initElements(driver, AddCustomerPage.class);
	    addcustomerpage.clickOnListCustomerButton();

		addcustomerpage.clickOnAddCustomerInListCustomerPage();
		
		addcustomerpage.insertfullName(fullName);
	    addcustomerpage.insertCompanyNmae(companyName);
	    addcustomerpage.insertEmailAddress(email);
	    addcustomerpage.insertphoneNumber(phone);
	    addcustomerpage.insertaddress(address);
	    addcustomerpage.insertcityName(city);
	    addcustomerpage.insertstateName(state);
	    addcustomerpage.insertZipName(zip);
	    addcustomerpage.insertGroupNmae(group);
	    //addcustomerpage.insertCountryNmae(country);
	    addcustomerpage.clicksaveButton();
	    //Thread.sleep(5000);
	    addcustomerpage.clickOnListCustomerButton();
	    
	    addcustomerpage.insertEnteredNameInSearchBarOnlistcustomerPage();
	    
	    addcustomerpage.verifyEnterdNameandViewProfile();


	}

	}
	
	
	
	
	
