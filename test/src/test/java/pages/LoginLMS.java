package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.FrameworkAllLocators;

public class LoginLMS extends FrameworkAllLocators {
	
    private static WebElement element = null ;
	 protected static By username = By.xpath("//input[@placeholder = \"Enter your email address / username\" ]");
	 protected static By password = By.xpath("//input[@placeholder = \"Enter your Password\"]");
	 protected static By submit   = By.xpath("(//span[text() = 'Sign In'])[2]");	
	//Login screen
	

	public static WebElement enterUsername(WebDriver driver,String uid) {
		element = driver.findElement(username);
		element.sendKeys(uid);
		return element;
		
		}
	
	public static WebElement enterpassword(WebDriver driver,String pwd) {
		element = driver.findElement(password);
		element.sendKeys(pwd);
		
		return element;
		 
	}
	
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(submit);
		return element;
		
	
	}

	
	
	
	
}
