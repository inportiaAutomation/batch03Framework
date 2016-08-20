package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.By;

import com.inportia.batch03Framework.utils.Hooks;

public class LayerOne extends BasePage {
      
	
	   String url = "https://letskodeit.teachable.com/pages/practice";
	   By radiobox_benz = By.id("benzradio");
	   By radiobox_bmw = By.id("bmwradio");
	   By radiobox_honda = By.id("hondaradio");
		  
	
	  public LayerOne() {
		super();
		
	  }
	  
	  public void open_traget_page()
	  {
		  driver.get(url);
	  }
 
	
	  public void select_radio_button(String option)
	  {
		 switch(option)
		 {
		    case "BMW":
		    	 driver.findElement(radiobox_benz).click();
		    default:
				 break;
		 }
	  }
	  
	  public void close_browser()
	  {
		  //Hooks.closeBrowser();
	  }
	  
	  
}
