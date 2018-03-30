package stepDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modules.Sort_SummerDress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Megamenu;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.BaseClass;
import helper.BrowserFactory;
import helper.ConfigReader;


public class OnlineShopping{

	public WebDriver driver;
 	Megamenu megamenu;
	RegistrationPage regpage;
	Sort_SummerDress sortsumdress;
	ConfigReader config = new ConfigReader();
	
		 @When("^I open automationpractice website$")
		 public void i_open_automationpractice_website() throws Throwable {				 
			 BrowserFactory.startBrowser(config.getBrowser(), config.getURL());
			 driver = BrowserFactory.driver;
		 }
	 
		 @When("^I sign in$")
		 public void i_sign_in() throws Throwable {	
			 
			 regpage = new RegistrationPage(driver);
			 regpage.accountCreation(config.getEmailID());
			
		 }
		 @Then("^I check megamenu$")
		 public void i_check_megamenu() throws Throwable {
			 
			 megamenu = new Megamenu(driver);
			 megamenu.summerDress();
		 }

		 @Then("^Sort Summer dresses$")
		 public void sort_Summer_dresses() throws Throwable {
			 
			 sortsumdress =  new Sort_SummerDress(driver);
			 sortsumdress.sort();
		 }
		 @Then("^I sign out$")
		 public void i_sign_out() throws Throwable {
		
			 driver.quit();
		 }
}