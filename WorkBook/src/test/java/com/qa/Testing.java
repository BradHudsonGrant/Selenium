package com.qa;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Brad\\JUnit\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void addUser()  {
		 	driver.get("http://thedemosite.co.uk/addauser.php");   
		    DemoSiteAddUser addUser = PageFactory.initElements(driver, DemoSiteAddUser.class);
		    addUser.addDetails("Edna", "Mode");
		    
		    driver.get("http://thedemosite.co.uk/login.php");   
		    DemoSiteLogin login = PageFactory.initElements(driver, DemoSiteLogin.class);
		    
		  
		    login.enterLogin("Edna", "Mode");

		    assertEquals("Invalid Login","**Successful Login**", login.getResult());	
		    
		    
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}