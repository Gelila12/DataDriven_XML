package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginTest {
 
	WebDriver driver;

//	String userName = null;
//	String password = null;
	
	@Test
	@Parameters({"username", "password",})
	public void validUserShouldBeAbelToLogin(String userName,String password) {
		
		driver = BrowserFactory.init();
		          //loginPage=is object variable
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);//object
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardHeader();
		
	    BrowserFactory.tearDown();
}
}