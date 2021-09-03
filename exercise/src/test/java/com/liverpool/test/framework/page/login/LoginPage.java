package com.liverpool.test.framework.page.login;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liverpool.framework.page.LiverpoolPage;

public class LoginPage extends LiverpoolPage{

	public LoginPage(WebDriver driver) {
		super(driver, LoginPage.class.getName());
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'signup')]")
	WebElement createAccountLink;
	
	/**
	 * Public method to click on Sign Up button on Login Page
	 */
	public void clickOnSignUp() {
		wait.until(ExpectedConditions.elementToBeClickable(createAccountLink));
		createAccountLink.click();
		logger.log(Level.INFO, "Clicked on Create Account");
	}
}
