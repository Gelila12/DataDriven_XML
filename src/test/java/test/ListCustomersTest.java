package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.ListCustomersPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class ListCustomersTest {
	 
	
	

	  WebDriver driver;
//		
//		String userName = null;
//		String password = null;
//		String fullName = null;
//		String companyName= null;
//		String 	email = null;
//		String 	phone = null;
//		String 	address = null;
//		String 	city = null;
//		String 	state = null;
//		String 	zip = null;
//		String 	country = null;
//		
		
		
	
		  @Test
			@Parameters({"username", "password","FullName","CompanyName","Email","Phone","Address","City","State","Zip","Country"})
		  public void validUserShouldBeAbelToLogin(String userName,String password,String fullName,String companyName,String email,String phone,String address,String city,String state,String zip,String country) {
			 driver = BrowserFactory.init();
			 
			 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); 
			 loginPage.insertUserName(userName );
			 loginPage.insertPassword(password);
			 loginPage.clickOnSigninButton();
			 
			 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
			 dashboardPage.validateDashboardHeader();
			 dashboardPage.clickOnCustomerButton();
			 dashboardPage.clickOnAddCustomerButton();
			 dashboardPage.clickOnListCustomersButton();
		
			 AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
			 addcustomerpage.insertFullName (fullName);
			 addcustomerpage.insertCompanyName(companyName);
			 addcustomerpage.insertEmailAddress(email);
			 addcustomerpage.insertPhoneNumber(phone);
			 addcustomerpage.insertAddress(address);
			 addcustomerpage.insertCity(city);
			 addcustomerpage.insertState(state);
			 addcustomerpage.insertZip(zip);
			 addcustomerpage.enterCountryName(country);
			 addcustomerpage.clickSaveButton();
			
			 ListCustomersPage listcustomerspage = PageFactory.initElements(driver, ListCustomersPage.class);
			 listcustomerspage.clickOnListCustomersButton();
		     //listcustomerspage.verifyEnteredName();
		  
		}
		
		}
		
		