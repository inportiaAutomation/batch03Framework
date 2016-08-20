package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.WebDriver;

import com.inportia.batch03Framework.utils.BrowserManager;

public class BasePage {
    
	   public WebDriver driver;
	
	   public BasePage()
	   {
		   driver = BrowserManager.getBrowser("firefox");
	   }
}