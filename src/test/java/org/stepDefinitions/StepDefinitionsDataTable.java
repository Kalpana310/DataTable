package org.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsDataTable {

	WebDriver driver;
	 @Given("User launch the url")
	 public void user_launch_the_url() throws IOException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	      }

	 @When("User enter the credentials")
	 public void user_enter_the_userid_and_password() {
		 driver.findElement(By.id("email")).sendKeys("facebook@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("pass@123");
	     }
	 
		 
	 @When("User enter the credentials using 1D dataTable without header")
	 public void user_enter_the_credentials_using_1d_data_table_without_header(io.cucumber.datatable.DataTable dataTable) {
     List<String> asList = dataTable.asList();
	   String userid = asList.get(2);
	   String pass = asList.get(1);
	   driver.findElement(By.id("email")).sendKeys(userid);
	   driver.findElement(By.id("pass")).sendKeys(pass);
	    
	 }
	 
	 @When("User enter the credentials using 1D dataTable with header")
	 public void user_enter_the_credentials_using_1d_data_table_with_header(io.cucumber.datatable.DataTable dataTable) {
	 Map<String, String> asMap = dataTable.asMap();
	 String userName = asMap.get("userName2");
	 String password = asMap.get("password1");
	 driver.findElement(By.id("email")).sendKeys(userName);
	 driver.findElement(By.id("pass")).sendKeys(password);
	   
	 
	 }
	 
	 @When("User enter the credentials using 2D dataTable without header")
	 public void user_enter_the_credentials_using_2d_data_table_without_header(io.cucumber.datatable.DataTable dataTable) {
	 List<List<String>> asLists = dataTable.asLists();
	 List<String> list = asLists.get(2);
	 String user = list.get(2);
	 String pass = list.get(0);
	 driver.findElement(By.id("email")).sendKeys(user);
	 driver.findElement(By.id("pass")).sendKeys(pass);
	 
	 
	 }
	 
	
	 @When("User enter the credentials using 2D dataTable with header")
	 public void user_enter_the_credentials_using_2d_data_table_with_header(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps();
	    Map<String, String> map = asMaps.get(1);
	    String username = map.get("username");
	    String password = map.get("password");
	    driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		 
	 }



	 
	 
	 
	 @When("User click the login button")
	 public void user_click_the_login_button() {
		 driver.findElement(By.name("login")).click();
	    
	 }

	 @Then("validate the outcomes")
	 public void validate_the_outcomes() {
		driver.close(); 
		     
	 }


}
