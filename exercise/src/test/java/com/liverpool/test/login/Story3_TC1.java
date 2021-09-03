package com.liverpool.test.login;

import java.util.logging.Level;
import org.testng.annotations.Test;
import com.liverpool.test.framework.page.Home.HomePage;
import com.liverpool.test.framework.page.login.LoginPage;
import com.liverpool.test.framework.page.login.RegisterPage;
import com.liverpool.test.testcase.MainTest;

public class Story3_TC1 extends MainTest{
 
	@Test
  public void CreateAccount() throws Exception {
	  HomePage homePage = new HomePage(driver);
	  LoginPage loginpage = new LoginPage(driver);
	  RegisterPage registerPage = new RegisterPage(driver);
	  
	  logger.log(Level.INFO, "Step 1: Navigate to https://www.liverpool.com.mx/tienda/home");
	  
	  logger.log(Level.INFO, "Step 2: Click on \"Iniciar Sesion\" button");
	  homePage.clickOnSignIn();
	  
	  logger.log(Level.INFO, "Step 3: Click on \"Crear Cuenta\"");
	  loginpage.clickOnSignUp();
	  
	  logger.log(Level.INFO, "Step 4: Validate fields for Email and Password are displayed");
	  
	  logger.log(Level.INFO, "Step 5: \"Crear Cuenta\" button is displayed and enabled");
	  
	  logger.log(Level.INFO, "Step 6: Enter any valid email");
	  registerPage.setValidEmail();
	  
	  logger.log(Level.INFO, "Step 7: Enter any valid password");
	  registerPage.setValidPassword();
	  
	  logger.log(Level.INFO, "Step 8: Click on \"Crear Cuenta\"");
	  registerPage.clickOnCreateAccountButton();
	  
  }
}
