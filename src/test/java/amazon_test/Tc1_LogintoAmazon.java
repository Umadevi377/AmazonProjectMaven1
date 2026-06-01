package amazon_test;
import utility.RetryLogic;
import org.testng.IRetryAnalyzer;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utility.Baseclass;

public class Tc1_LogintoAmazon extends Baseclass


{
	@Test(retryAnalyzer=RetryLogic.class)
    public void Login_ValidCredentials() throws InterruptedException
    {
    	
		Reporter.log("Broweser launched");
		Thread.sleep(2000);
        
	HomePage homepage = new HomePage(driver);
    homepage.HoverOveronAccountList(driver);
	homepage.Clicksign();
	Reporter.log("logged into Amazon home page");;
	LoginPage loginpage = new LoginPage(driver);
	
	loginpage.EnterValidUS();
	loginpage.ClickContinue();
	loginpage.EnterValidPW();
	loginpage.ClickSignin();
	Reporter.log("Signin successful");;
	
	
    }
    
	

	
  }
	
	

