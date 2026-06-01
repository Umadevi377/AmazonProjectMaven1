package amazon_test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Baseclass;
import utility.RetryLogic;

public class Tc2_LogintoAmazonandSearchProduct extends Baseclass

{  
	@Test(retryAnalyzer=RetryLogic.class)
	
	 public void Login_ValidCredentials() throws InterruptedException
	    {
	   
	
	HomePage homepage = new HomePage(driver);
    homepage.HoverOveronAccountList(driver);
	homepage.Clicksign();
	
	LoginPage loginpage = new LoginPage(driver);
	
	loginpage.EnterValidUS();
	loginpage.ClickContinue();
	loginpage.EnterValidPW();
	loginpage.ClickSignin();
	
		
	homepage.Searchproduct();
	Reporter.log("Search product successful");;
	
	
	
	    }
	
}
