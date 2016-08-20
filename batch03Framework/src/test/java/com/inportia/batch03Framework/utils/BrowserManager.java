package com.inportia.batch03Framework.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {
   
	private static WebDriver browser;
	private static boolean is_created = false;
	
	private BrowserManager()
	{
		
	}
	
	static WebDriver createBrowser(String browser_name)
	{
		browser = new FirefoxDriver();
		browser.manage().deleteAllCookies();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return browser;
	}
	
	public static WebDriver getBrowser(String browserName)
	{
		if (!is_created)
		{
			is_created = true;
			return createBrowser(browserName);
			
		}
		
		return browser;
	}
	
}
