package com.liverpool.test.framework.page.Home;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.liverpool.framework.page.LiverpoolPage;
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends LiverpoolPage{
	
	
	public HomePage(WebDriver driver) {
		super(driver, HomePage.class.getName());
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='a-header__topLink']")
	WebElement signInButton;

	
	/**
	 * Public method to click on Sign In button on Home Page
	 * @throws Exception 
	 */
	public void clickOnSignIn() throws Exception {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
		logger.log(Level.INFO, "Clicked on Sign In");
	}
}
