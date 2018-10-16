package com.qa;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DrawTest {
	public WebDriver driver = null;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Brad\\JUnit\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void addUser() {
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver);
		
		// Letter B
		action.moveByOffset(100, 200).clickAndHold().moveByOffset(150, 0).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, 150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(-150, 0).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, 300).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(150, 0).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -150).release().perform();
		
		action.moveByOffset(50, 0).perform();
		
		// Letter r
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, 150).release().perform();
		action.moveByOffset(0, -150).clickAndHold().moveByOffset(150, 0).release().perform();
	
		action.moveByOffset(50, 0).perform();
		
		// Letter a
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, 150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(150, 0).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(-150, 0).release().perform();
		action.moveByOffset(150, 150).perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(50, 0).release().perform();
		
		action.moveByOffset(50, -150).perform();
		
		// Letter d
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, 150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(150, 0).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -150).release().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(-150, 0).release().perform();
		action.moveByOffset(150, 0).perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -150).release().perform();
		
	}

	@After
	public void tearDown() {
		// driver.quit();
	}
}