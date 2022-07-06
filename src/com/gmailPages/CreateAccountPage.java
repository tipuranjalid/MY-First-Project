package com.gmailPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccountPage extends BaseClass{
	@FindBy(xpath="//span[contains(text(),'Create account')]")
	WebElement CreateAccBtn;
	
	@FindBy(xpath="//span[contains(text(),'For myself')]")
	WebElement MySelfBtn;
	
	@FindBy(xpath="//*[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Email;
	
	@FindBy(xpath="//input[translate(@name,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='passwd']")
	WebElement Password;
	
	@FindBy(name="ConfirmPasswd")
	WebElement ConfmPassword;
	
	@FindBy(xpath="//div[@id='selectioni1']")
	WebElement ShwPswdClick;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement NextClick;
	
	
	public CreateAccountPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	public void createAccBtn()  {
		
		  try { Thread.sleep(1000); }catch(Exception e) { e.printStackTrace(); }
		 
		
		CreateAccBtn.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MySelfBtn.click();
		FirstName.sendKeys("Tipuranjali");
		LastName.sendKeys("Cheekati");
		Email.sendKeys("tipuranjali@gmail.com");
		Password.sendKeys("Tipuranjali");
		ConfmPassword.sendKeys("Tipuranjali");
		ShwPswdClick.click();
		NextClick.click();
	}
	
	
	

}
