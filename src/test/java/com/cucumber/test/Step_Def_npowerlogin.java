package com.cucumber.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.constants.myConstants;
import com.cucumber.pageobjects.npowerPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_npowerlogin {
	
	
	WebDriver driver;
	npowerPage NP = new npowerPage();
	myConstants MC = new myConstants();
	
	@Given("^Launch npower site$")
	public void launch_npower_site() throws InterruptedException {
	    NP.launch_npower();
	}
	@When("^user logsin$")
	public void user_logged_in_using_username_as_username_and_password_as_password(DataTable DT) throws InterruptedException 
	{
		List<String> list = DT.asList(String.class);
		String username = list.get(0);
		String password = list.get(1);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));
		NP.NPButton_login();
		NP.Login_Details(username, password);
		Thread.sleep(10000);
		}
	
	@And("^User login into npower Successful$")
	public void user_login_into_npower_Successful(DataTable DT) throws Throwable 
			{
			List<String> list = DT.asList(String.class);
			String dummy = list.get(0);
			
			System.out.println("The Dummy value is " + dummy);
			String title = NP.LABEL_TEXT();
			System.out.println("Home page title ::"+ title);
			Assert.assertEquals("Go to our business site", title);
			}


@Then ("^User click on logout$")
public void User_logout() throws InterruptedException
{
	//System.out.println("The dob is " + MC.date_of_birth);
	NP.NPButton_logout();
	}}

