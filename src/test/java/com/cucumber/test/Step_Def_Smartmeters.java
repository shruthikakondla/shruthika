package com.cucumber.test;

import org.openqa.selenium.WebDriver;

import com.cucumber.pageobjects.SmartmetersPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Step_Def_Smartmeters {
	WebDriver driver;
 SmartmetersPage SM = new SmartmetersPage();
	
	@When("^User navigates to smartmeter page$")
	public void user_navigates_to_smartmeter_page() throws InterruptedException  {
		Thread.sleep(10000);
		SM.User_navigates_to_Smartmeters();
	}

	@And("^User click on Smart meter installation reviews$")
	public void user_click_on_Smatmeter_reviews() throws InterruptedException  {
		Thread.sleep(10000);
	  SM.User_clickon_Smartmeter_reviews();
	   
	}


}
