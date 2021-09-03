package com.liverpool.test.testcase;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class MainTest {
	
	public WebDriver driver;
	public Logger logger;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.liverpool.com.mx/tienda/home");
		logger= Logger.getLogger("MainTest");
	}
}
