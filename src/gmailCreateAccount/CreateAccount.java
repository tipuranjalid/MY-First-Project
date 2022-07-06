package gmailCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("//input[@type='email']")).sendKeys("tipuranjali555@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
