package com.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmailPages.BaseClass;
import com.gmailPages.CreateAccountPage;
import com.gmailPages.SignInPage;

public class CreateAccountTest {
	BaseClass BaseclassObj;

	@BeforeMethod
	public void beforeMethod() {
		BaseclassObj = new BaseClass();
		BaseclassObj.webDriverInstatiation();
	}

	@Test
	public void validTest() {
		CreateAccountPage CAP = new CreateAccountPage();
		CAP.createAccBtn();		
	}
	
	@AfterMethod
	public void afterMethod() {
		BaseclassObj.driverClose();
	}
	

}
