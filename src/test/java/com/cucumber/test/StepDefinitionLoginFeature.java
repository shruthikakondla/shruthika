package com.cucumber.test;
//package com.cucumber.test;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.*;


public class StepDefinitionLoginFeature{
	
	//WebDriver driver = null;
	private static ChromeDriverService service;
	private WebDriver driver;
	ChromeOptions options;
	
	@Given("^Application is open$")
	public void application_is_open() throws Throwable {

		//Open the Home page
		options = new ChromeOptions();
		//options.addArguments("--headless");
		options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
	
		/*service = new ChromeDriverService.Builder()
		        .usingDriverExecutable(new File("/usr/bin/chromedriver"))
		        .usingAnyFreePort()
		        //.withWhitelistedIps("3.8.123.191")
		        //.withVerbose(true)
		        .build();
		service.start();
		
		driver = new RemoteWebDriver(service.getUrl(), options);*/


		System.setProperty("webdriver.chrome.driver", "/Users/shiva/Drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		
		//Accessing app on  my AWS
		//driver.get("http://35.177.103.137:5000");
		
		//Accessing app on Ambadas AWS
		//driver.get("http://35.176.136.254:5000");
		driver.get("https://www.google.com");
		
		//Text Check
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("Login / Register"));
		
		System.out.println("Application is open successfully");
	}

	@When("^entered valid username as? (.*) and password as? (.*)$")
	public void entered_valid_username_and_password(String arg1, String arg2) throws Throwable {
	
		//Enter User name
		WebElement loginName = driver.findElement(By.name("logemail"));
		loginName.sendKeys(arg1);
		
		//Enter Password
		WebElement loginPwd = driver.findElement(By.name("logpassword"));
		loginPwd.sendKeys(arg2);
	}

	@Then("^homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		
		//Click Login Button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
				
		//Text Check
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText1.contains("Logged in as"));
								
		System.out.println("Homepage is displayed successfully");
		
		//Logout
		WebElement logoutButton = driver.findElement(By.name("viewlogout"));
		logoutButton.click();
		
		//Text Check
		String bodyText2 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText2.contains("Login / Register"));
		
		System.out.println("Logged out successfully");
		
		//Close the browser window
		//service.stop();
		driver.quit();
	}

	@When("^entered incorrect username as? (.*) and correct password as? (.*)$")
	public void entered_incorrect_username_and_correct_password(String arg1, String arg2) throws Throwable {
	    
		//Enter User name
		WebElement loginName = driver.findElement(By.name("logemail"));
		loginName.sendKeys(arg1);
				
		//Enter Password
		WebElement loginPwd = driver.findElement(By.name("logpassword"));
		loginPwd.sendKeys(arg2);
	}

	@Then("^login is failed$")
	public void login_is_failed() throws Throwable {
		
		//Click Login Button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
						
		//Text Check
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("Wrong email or password."));
									
		System.out.println("Login failed successfully");
		
		//Close the browser window
		//service.stop();
		driver.quit();	    
	}

	@When("^entered correct username as? (.*) and incorrect password as? (.*)$")
	public void entered_correct_username_and_incorrect_password(String arg1, String arg2) throws Throwable {
		
		//Enter User name
		WebElement loginName = driver.findElement(By.name("logemail"));
		loginName.sendKeys(arg1);
						
		//Enter Password
		WebElement loginPwd = driver.findElement(By.name("logpassword"));
		loginPwd.sendKeys(arg2);
	}
	
}