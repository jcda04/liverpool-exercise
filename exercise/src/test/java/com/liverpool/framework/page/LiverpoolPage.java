package com.liverpool.framework.page;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiverpoolPage {

	public WebDriver driver;
	public Logger logger;
	public WebDriverWait wait;
	
	public LiverpoolPage(WebDriver driver, String className) {
		this.driver = driver;
		logger= Logger.getLogger(className);
		wait = new WebDriverWait(driver, 30);
	}
}
