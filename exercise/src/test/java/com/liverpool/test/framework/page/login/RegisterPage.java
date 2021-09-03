package com.liverpool.test.framework.page.login;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liverpool.framework.page.LiverpoolPage;
import com.liverpool.test.framework.datafactory.DataFactory;

public class RegisterPage extends LiverpoolPage{
	
	public RegisterPage(WebDriver driver) {
		super(driver, RegisterPage.class.getName());
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passWordField;
	
	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Crear cuenta')]")
	WebElement createAccountButton;
	
	
	public void setValidEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(emailField));
		DataFactory dataFactory = new DataFactory();
		emailField.sendKeys(dataFactory.getValidEmail());
		logger.log(Level.INFO, "Email set");
	}
	
	public void setValidPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(passWordField));
		DataFactory dataFactory = new DataFactory();
		passWordField.sendKeys(dataFactory.getValidPassword());
		logger.log(Level.INFO, "Password set");
	}
	
	public void clickOnCreateAccountButton() {
		wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
		createAccountButton.click();
		logger.log(Level.INFO, "Clicked on Create Account");
	}
}
