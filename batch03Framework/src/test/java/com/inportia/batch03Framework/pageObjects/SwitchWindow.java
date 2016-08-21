package com.inportia.batch03Framework.pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;


public class SwitchWindow extends BasePage {
      
	
	public SwitchWindow()
    {
		
    }
	
	By window_button = By.id("openwindow");
	String main_window_handle;
	
	public void click_window_open_button()
	{
		main_window_handle = driver.getWindowHandle();
		driver.findElement(window_button).click();

	}
	
	
	public void switch_to_second_window()
	{
	   Set<String> handles = driver.getWindowHandles();
	   System.out.println(handles);
       driver.switchTo().window(main_window_handle);
	}
	
	public void verify_if_second_present()
	{
		boolean win_bt_present = driver.findElement(window_button).isDisplayed();
		Assert.assertTrue(win_bt_present);
	}
}
