package com.cucumber.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YunoJunoPage {
	
	WebDriver driver;
	By BUTTON_LOGIN = By.cssSelector("[class*='login']");
	By TEXTBOX_USERNAME = By.cssSelector("#id_username");
	By TEXTBOX_PASSWORD = By.cssSelector("#id_password");
	By BUTTON_SIGNIN = By.cssSelector("[value*='Sign']");
	By LABEL_VERIFY = By.cssSelector("#navigation a[href*=brief][class*='Menu--briefs']");
	//private static final String BUTTON_LOGIN = "//*[@id=\\\"gatsby-focus-wrapper\\\"]/div/div[1]/header/div/nav/div/div[1]/a";
	
	public void launch_yunojuno()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shiva/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yunojuno.com/");
	}
	
	public void Button_Login()
	{
		driver.findElement(BUTTON_LOGIN).click();
	}
	
	public void Login_Details(String username, String password)
	{
		driver.findElement(TEXTBOX_USERNAME).sendKeys(username);
		driver.findElement(TEXTBOX_PASSWORD).sendKeys(password);
		driver.findElement(BUTTON_SIGNIN).click();
	}
	
	public String LABEL_TEXT()
	{
		String Verifyword = driver.findElement(LABEL_VERIFY).getText();
		return Verifyword;
	}
	
	public void close_browser()
	{
		driver.close();
	}
	
	public void TEXT_VERIFICATION(String title)
	{
		try
		{
			Assert.assertEquals("Briefs", title);
		}catch(Exception e)
		{
			System.out.println("TEXT is not matching");
		}
		
	}
	

}
