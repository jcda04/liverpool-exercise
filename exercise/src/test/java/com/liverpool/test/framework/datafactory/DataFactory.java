package com.liverpool.test.framework.datafactory;

import java.io.InputStream;
import java.util.Calendar;

import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.Json;

public class DataFactory {

	public String getValidEmail() {
		String email = "";
		Calendar c = Calendar.getInstance();
		email = String.valueOf(c.get(Calendar.YEAR))+String.valueOf(c.get(Calendar.MONTH))+String.valueOf(c.get(Calendar.DAY_OF_YEAR))+
				String.valueOf(c.get(Calendar.HOUR))+String.valueOf(c.get(Calendar.MINUTE))+
				String.valueOf(c.get(Calendar.SECOND))+String.valueOf(c.get(Calendar.MILLISECOND))+"@mailinator.com";
		return email;
	}
	
	public String getValidPassword() {
		String password = "";
		
		String passwordPath = "framework/passwords.json";
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream resourceStream = classLoader.getResourceAsStream(passwordPath);
		JsonReader jsonReader = Json.createReader(resourceStream);
		
		JsonObject passJson = jsonReader.readObject();
		JsonObject passwordsObject  = passJson.getJsonObject("passwords");
		JsonObject validPasswordsObject = passwordsObject.getJsonObject("valid");
		password = validPasswordsObject.getString("valid_password");

		return password;
	}
}
