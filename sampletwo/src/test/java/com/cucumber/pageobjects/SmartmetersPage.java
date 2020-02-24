package com.cucumber.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartmetersPage {

	WebDriver driver;
	By TAB_SMARTMETERS = By.xpath("/html/body/np-app/np-header/header/nav/div/ul/li[1]/a");
	By CLICK_SMARTMETER_REVIEWS = By.cssSelector("div:nth-child(1) > div > ul > li:nth-child(6) > span.link__text > a");


public void User_navigates_to_Smartmeters() throws InterruptedException 
{
	Thread.sleep(5000);
	driver.findElement(TAB_SMARTMETERS).click();
}

public void User_clickon_Smartmeter_reviews() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(CLICK_SMARTMETER_REVIEWS).click();
}
}

