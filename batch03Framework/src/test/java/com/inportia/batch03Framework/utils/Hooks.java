package com.inportia.batch03Framework.utils;



import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;





public class Hooks {
    
	static WebDriver driver;
	
	@Before
	public static void createSingletonBrowser(String bname)
	{
		System.out.println("inside before method");
		driver =  BrowserManager.getBrowser(bname);
	}
	
	public static WebDriver getBrowser(String bname)
	{
		if(driver!=null)
		{
			return driver;
		}
		return null;
	}
	
	@After
	public static void closeBrowser()
	{
		
	}
	
}
