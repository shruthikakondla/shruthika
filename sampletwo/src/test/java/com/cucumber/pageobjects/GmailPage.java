package com.cucumber.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailPage {
	
	WebDriver driver;
	By LABEL_VERIFY = By.cssSelector("#headingText span");
	By TEXTBOX_USERNAME = By.cssSelector("[type*='email']");
	By BUTTON_NEXT =By.cssSelector("#identifierNext span span");
	By TEXTBOX_PASSWORD = By.cssSelector("[type='password']");
	By BUTTON_NEXT1 =By.cssSelector("#passwordNext > span");
	By LABEL_VERIFY1 = By.cssSelector("[class*='gb_ua']");

	public void launch_gmail()
	{
	//System.setProperty("webdriver.gecko.driver", "/Users/shiva/Drivers/geckodriver.exe");;
			
	System.setProperty("webdriver.chrome.driver", "/Users/shiva/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.gmail.com/");
	}
	
	public String SIGNIN_TEXT_VERIFICATION()
	{
		String Verifysigninword = driver.findElement(LABEL_VERIFY).getText();
		return Verifysigninword;
	}
	public void  Signin_Details (String username, String password) throws InterruptedException 
	{
		driver.findElement(TEXTBOX_USERNAME).sendKeys(username);
		driver.findElement(BUTTON_NEXT).click();
		Thread.sleep(5000);
		driver.findElement(TEXTBOX_PASSWORD).sendKeys(password);
		driver.findElement(BUTTON_NEXT1).click();
	}
	public void close_browser()
	{
		driver.close();
	}
	public String LABEL_VERIFY1() {
		String VerifyGmailword = driver.findElement(LABEL_VERIFY1).getText();
		return VerifyGmailword;
	}
	public String LABEL_TEXT()
	{
		String Verifyword = driver.findElement(LABEL_VERIFY).getText();
		return Verifyword;
		}
}

