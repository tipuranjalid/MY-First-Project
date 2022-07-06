package com.testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmailPages.BaseClass;
import com.gmailPages.SignInPage;

public class SignInTest {
	BaseClass BaseclassObj;

	@BeforeMethod
	public void beforeMethod() {
		BaseclassObj = new BaseClass();
		BaseclassObj.webDriverInstatiation();
	}

	@Test
	public void validTest() {
		SignInPage SI = new SignInPage();
		SI.validSignIn();
		SI.clickNext();

	}

	@Test
	public void invalidTest() {
		SignInPage SI = new SignInPage();
		SI.invalidSignIn();
		SI.clickNext();
	}

	@AfterMethod
	public void afterMethod() {		
		BaseclassObj.driverClose();
	}

}
