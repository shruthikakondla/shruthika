package com.cucumber.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectLineLoginPage {
	
	WebDriver driver;
	By TEXTBOX_USERNAME = By.cssSelector("[name='loginUsername']");
	By TEXTBOX_PASSWORD = By.cssSelector("[name='loginPassword']");
	By BUTTON_LOGIN = By.cssSelector("[type='submit']");
	By LABEL_VERIFY = By.cssSelector("div.logged-in__success");
	
	public void launch_directLine() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://greenflag-qa-experience.dev.mycro.app");
		driver.manage().window().maximize();
		
	}
	public void LoginPage_details(String username, String password) 
	{
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(TEXTBOX_USERNAME));
	driver.findElement(TEXTBOX_USERNAME).sendKeys(username);
	wait.until(ExpectedConditions.visibilityOfElementLocated(TEXTBOX_PASSWORD));
	driver.findElement(TEXTBOX_PASSWORD).sendKeys(password);
	}
	
	public void Login()
	{
	driver.findElement(BUTTON_LOGIN).click();
	}
	
	public void verifyLogin(String DLVerifyText)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LABEL_VERIFY));
		String verifyText = driver.findElement(LABEL_VERIFY).getText();
		if(verifyText.equalsIgnoreCase(DLVerifyText))
		{
			System.out.print("Login is Successful");
		}else {
			System.out.print("Login is not Successful");
		}
	}

	public void close_browser() 
	{
		driver.close();
	}
}
