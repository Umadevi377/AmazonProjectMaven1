package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLogic  implements ITestListener

{
public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result)
	
	{
		
		ITestListener.super.onTestSuccess(result);
		TakesScreenshot ts = (TakesScreenshot) driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File desc = new File("C:\\Users\\vasuma\\eclipse-workspace\\Amazon_project01\\test-output\\Screenshotforpass\\Testcase1"+Math.random()+".png");
	try {
		FileHandler.copy(src,desc);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\vasuma\\eclipse-workspace\\Amazon_project01\\test-output\\Screenshotfor_Fail\\Testcase1"+Math.random()+".png");
		try {
			FileHandler.copy(src,desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}
