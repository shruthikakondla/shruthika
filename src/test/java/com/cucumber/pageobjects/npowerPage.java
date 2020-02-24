package com.cucumber.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class npowerPage {

	WebDriver driver;
//	By NPBUTTON_LOGIN = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[4]/a");
	By NPBUTTON_LOGIN = By.cssSelector("a[href*='mynpower']:nth-child(1)[data-envirnoment*='log'] :nth-of-type(2)");
	By TEXTBOX_USERNAME = By.cssSelector("#username");
	By TEXTBOX_PASSWORD = By.cssSelector("#password");
	By BUTTON_SIGNIN = By.cssSelector("[class*='button button--full-width']");
	By LABEL_VERIFY = By.cssSelector("li:nth-child(2) p a");
	By REMEMEBR_CHECKBOX = By.cssSelector("[class*='form-checkbox__label']");
	By NBUTTON_LOGOUT = By.cssSelector("a span.label.label");
	
	public void launch_npower() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shiva/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.npower.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void NPButton_login() 
	{
	 driver.findElement(NPBUTTON_LOGIN).click();	
	}
	
	public void Login_Details(String username, String password)throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(TEXTBOX_USERNAME).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(TEXTBOX_PASSWORD).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(REMEMEBR_CHECKBOX).click();;
		Thread.sleep(5000);
		driver.findElement(BUTTON_SIGNIN).click();
		
	}
	public void Remember_Checkbox() 
	{
	 driver.findElement(REMEMEBR_CHECKBOX).click();	
	}

	public String LABEL_TEXT() {
		String Verifyword = driver.findElement(LABEL_VERIFY).getText();
		return Verifyword;
	}
	
public void NPButton_logout() throws InterruptedException 
{
	Thread.sleep(5000);
 driver.findElement(NBUTTON_LOGOUT).click();
 
}
}
	

