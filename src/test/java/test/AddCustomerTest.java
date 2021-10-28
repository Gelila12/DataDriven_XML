package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.ListCustomersPage;
import page.LoginPage;
import util.BrowserFactory;


public class AddCustomerTest {
	 
	
	
	  WebDriver driver;
		
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
		
			 AddCustomerPage addCustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
			 addCustomerpage.insertFullName(fullName);
			 addCustomerpage.insertCompanyName(companyName);
			 addCustomerpage.insertEmailAddress(email);
			 addCustomerpage.insertPhoneNumber(phone);
			 addCustomerpage.insertAddress(address);
			 addCustomerpage.insertCity(city);
			 addCustomerpage.insertState(state);
			 addCustomerpage.insertZip(zip);
			 addCustomerpage.enterCountryName(country);
			 addCustomerpage.clickSaveButton();
		     addCustomerpage.clickOnListCustomersButton();
		     
		     ListCustomersPage listcustomerspage = PageFactory.initElements(driver, ListCustomersPage.class);
			 listcustomerspage.clickOnListCustomersButton();
		     // addCustomerpage.verifyEnteredNameAndDelete();
		}
		
		}
		
		
		


