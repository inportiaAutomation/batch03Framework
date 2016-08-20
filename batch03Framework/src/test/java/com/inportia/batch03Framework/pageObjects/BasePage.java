package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.WebDriver;


import com.inportia.batch03Framework.utils.Hooks;

public class BasePage {
    
	   public WebDriver driver;
	
	   public BasePage()
	   {
		   Hooks.createSingletonBrowser("firefox");
		   driver = Hooks.getBrowser("firefox");
	   }
	   
	   public void close_browser(){
	   }
}
