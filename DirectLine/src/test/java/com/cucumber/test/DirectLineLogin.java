package com.cucumber.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.pageobjects.DirectLineLoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DirectLineLogin {
	
	WebDriver driver;
	DirectLineLoginPage DL = new DirectLineLoginPage();

	@Given("^I Launch DirectLine Site$")
	public void ILaunchDirectLineSite() throws InterruptedException{
		DL.launch_directLine();
	}

	@When("^I Enter username and password$")
	public void IEnterUsernameandPassword(DataTable DT) throws InterruptedException  {
		List<String> list = DT.asList(String.class);
		String username = list.get(0);
		String password = list.get(1);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));
		DL.LoginPage_details(username, password);
	}
	
	@And("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
	    DL.Login();
	}

	@Then("^I verify whether login is successful$")
	public void i_verify_whether_login_is_successful(DataTable DT) throws Throwable {
		List<String> list = DT.asList(String.class);
		String DLVerifyText = list.get(0);
		DL.verifyLogin(DLVerifyText);
	}
		
	
	@And("^Close the browser$")
	public void close_the_browser() throws InterruptedException {
		DL.close_browser();
	}
	}
