package amazon_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 

{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement submitbtn;
	
	
	public void EnterValidUS()
	{
		
		username.sendKeys("9500212556");
		
	}
	
	public void ClickContinue() throws InterruptedException
	{
		
		continuebtn.click();
Thread.sleep(2000);
		
	}
	
	
	
	public void EnterValidPW()
	{
		
		password.sendKeys("Uma@1234");
		
	}
	

	
	public void ClickSignin()
	{
		
		submitbtn.click();
		
	}
	
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
