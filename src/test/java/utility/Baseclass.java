package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass extends ListenerLogic
{

	 public WebDriver driver;
	 
	  @Parameters("Browsername")
	  @BeforeMethod
	
	public void BrowserLaunch( String Browserselect)
	{
		if(Browserselect.equals("Chrome"))
		{
			 driver = new ChromeDriver();
			
		}
		
		
		if(Browserselect.equals("Edge"))
		{
			
			driver = new EdgeDriver();
		}
		
		
		if(Browserselect.equals("Firefox"))
		{
			
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	  
	
	@AfterMethod
	public void BrowserQuit() throws InterruptedException 
	{
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
}
