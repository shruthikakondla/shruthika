package com.cucumber.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.cucumber.pageobjects.GmailPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_gmailLogin {
	
	WebDriver driver;
	GmailPage GP = new GmailPage();

	@Given("^Launch Gmail page$")
	public void Launch_Gmail_page() 
	{
	   GP.launch_gmail(); 
	}

	@When("^logged in using username as “username” and password as “password”$")
	public void User_Login_using_username_and_password(DataTable DT) throws InterruptedException 
	{ 
	List<String> list = DT.asList(String.class);
	String username = list.get(0);
	String password = list.get(1);
	System.out.println("Username - " + list.get(0));
	System.out.println("Password - " + list.get(1));
              GP.Signin_Details(username,password);
     
	}
	@Then("^Gmail home page should be displayed$")
	public void gmail_home_page_Verifivation(DataTable DT){
		List<String> list = DT.asList(String.class);
		String dummy = list.get(0);
		
		System.out.println("The Dummy value is " + dummy);
		String Gmail = GP.LABEL_TEXT();
		System.out.println("Home page title ::"+ Gmail);
		//GP.TEXT_VERIFICATION(title);
		Assert.assertEquals("Gmail", Gmail);
		GP.close_browser();
	}}
		

