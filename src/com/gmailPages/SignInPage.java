package com.gmailPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage extends BaseClass {

	@FindBy(xpath= "//*[@type='email']")
	WebElement Email;

	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement NextBtn;	
	

	public SignInPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	public void validSignIn() {
		Email.sendKeys("tipuranjali555@gmail.com");
	}

	public void invalidSignIn() {
		Email.sendKeys("tipuranjali@gmail.com");
	}

	public void clickNext() {
		NextBtn.click();
	}

}
