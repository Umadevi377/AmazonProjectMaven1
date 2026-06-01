package amazon_test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage

{

	
	//step 1: locate the element using @findBy annotations
	  
	  @FindBy(xpath ="//span[@class='nav-line-2 ']")
	  
	  WebElement AccountandList;
	  
    @FindBy(xpath ="//span[@class='nav-action-inner']")
	  
	  WebElement signinfromAccountandList;
    //step 2 : create methods for each WebElement and add actions for it
    
    
    @FindBy(id="twotabsearchtextbox")
    WebElement searchbox;
    
    @FindBy(xpath="//span[text()='Sign Out']")
    WebElement signout;
    
       
    public void HoverOveronAccountList(WebDriver driver)
    {
  	
  	  Actions a1 = new Actions(driver);
  	  a1.moveToElement(AccountandList).perform();
  	  
  	  
    }
   
    public void Clicksign()
    {
  	  
  	  signinfromAccountandList.click();
  	  
    }
    
    public void Searchproduct()
    {
    	
    	searchbox.sendKeys("shoes" + Keys.ENTER);
    	
    }
  
    //step 3: initialize all components inside the  constructor using pagefactory class
//if step 3 not created null pointer exception arise
	  
	   public void signoutClick()
	   {
		   
		   
		   signout.click();
		   
	   }
    
    public  HomePage(WebDriver driver)
    {
    	
    	
    	
    	PageFactory.initElements(driver, this);
    }
	
}
