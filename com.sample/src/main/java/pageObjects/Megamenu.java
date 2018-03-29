package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.BaseClass;

public class Megamenu extends BaseClass{

	public Megamenu(WebDriver driver) {
		super(driver);
		
	}

	
	By dresses_link = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
	By summerdress_link = By.xpath("//*[@id='block_top_menu']/ul/li[2]//a[@title='Summer Dresses']");
	
		 public void summerDress() throws InterruptedException{
			 
			 try{
				 
				 Thread.sleep(10);
				 WebElement dresslink = driver.findElement(dresses_link);
				 WebElement summerdresslink = driver.findElement(summerdress_link);
				 Actions action = new Actions(driver);				 
				 action.moveToElement(dresslink).pause(5).build().perform();
				 Thread.sleep(10);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(summerdress_link));
				 Actions action1 = new Actions(driver);
				 action1.moveToElement(summerdresslink).click(summerdresslink).build().perform();
				 
		
				 
			 }catch(NoSuchElementException e){
				 
			 }
		 }
}
