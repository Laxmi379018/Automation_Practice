package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.BaseClass;

public class RegistrationPage extends BaseClass{
	
	public RegistrationPage(WebDriver driver){
		 super(driver);
		 }

		By sign_in_link = By.xpath("//a[contains(text(),'Sign in')]");
		By email_id_input = By.id("email_create");
		By createAccount_Button = By.id("SubmitCreate");
		By invalid_email_Id = By.xpath("//div[@class='alert alert-danger']");
		By invalid_email_Id_Message = By.xpath("//div[@class='alert alert-danger']//li");
		
		public void accountCreation(){
			
			try {
			driver.findElement(sign_in_link).click();
			Thread.sleep(5);	
			
			driver.findElement(email_id_input).sendKeys(config.getEmailID());
			driver.findElement(createAccount_Button).click();
			
				try{
				wait.until(ExpectedConditions.visibilityOfElementLocated(invalid_email_Id));
				WebElement error = driver.findElement(invalid_email_Id);
				if(error.isDisplayed()){
					System.out.println(driver.findElement(invalid_email_Id_Message).getText());
				}else{
					System.out.println("Valid email id is provided for account creation");
				}
				} catch (NoSuchElementException e) {
					System.out.println("Element does not exist!");
			    }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}

