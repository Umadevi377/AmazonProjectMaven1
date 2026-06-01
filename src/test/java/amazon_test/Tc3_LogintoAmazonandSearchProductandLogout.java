package amazon_test;

import org.testng.annotations.Test;

import utility.Baseclass;
import utility.RetryLogic;

public class Tc3_LogintoAmazonandSearchProductandLogout  extends Baseclass
{

			@Test (retryAnalyzer=RetryLogic.class)
		
		 public void Login_ValidCredentials_search() throws InterruptedException
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
		homepage.HoverOveronAccountList(driver);
		homepage.signoutClick();
		
		
		 
		    
		    }
		
	
}
