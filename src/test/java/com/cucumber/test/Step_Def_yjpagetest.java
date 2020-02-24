package com.cucumber.test;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.cucumber.pageobjects.YunoJunoPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_yjpagetest {
	
	WebDriver driver;
	YunoJunoPage YJ = new YunoJunoPage();
		 
	@Given("^Launch yunojuno site$")
	public void launch_yunojuno() {
		YJ.launch_yunojuno();
		}
		
	@When("^user logged in using username as “username” and password as “password”$")
	public void user_logged_in_using_username_as_username_and_password_as_password(DataTable DT){
		List<String> list = DT.asList(String.class);
		String username = list.get(0);
		String password = list.get(1);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));
	       YJ.Button_Login();
	       YJ.Login_Details(username,password);
	    }
	
	@Then ("^User login into yunojuno Successful$")
	public void verifySuccessful(DataTable DT){
		List<String> list = DT.asList(String.class);
		String dummy = list.get(0);
		
		System.out.println("The Dummy value is " + dummy);
		String title = YJ.LABEL_TEXT();
		System.out.println("Home page title ::"+ title);
		YJ.TEXT_VERIFICATION(title);
		Assert.assertEquals("Briefs", title);
		YJ.close_browser();
		
	}
	}
	/*String expectedText="Yunujuno";
	      String actualText=         dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
	      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
	      }/*
		
  /*@When("^Navigate to login page$")
	public void navigate_to_login_page() {
  String title=  driver.getTitle();
  System.out.println(title);
  Assert.assertEquals("Go to the sign in page on YunoJuno", title);
	}

		@Then("^User Enter Email Address and password$")
	public void user_enter_Email_address_and_password() {
			driver.findElement(By.name("Email Address")).sendKeys("shruthika.siri@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Omsairam@95");
	    }*/
 
	

