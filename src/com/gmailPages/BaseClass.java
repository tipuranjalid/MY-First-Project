package com.gmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static ChromeDriver driver;
	public WebDriver webDriverInstatiation() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public void driverClose() {		
		driver.quit();
	}
}
