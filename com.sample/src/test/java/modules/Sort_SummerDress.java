package modules;

import static org.testng.Assert.fail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import helper.BaseClass;

public class Sort_SummerDress extends BaseClass{
	
	public Sort_SummerDress(WebDriver driver){
		 super(driver);
		 }
	
	By productlist = By.xpath("//ul[@class='product_list grid row']/li");
	By pricelist = By.xpath("//div/div[2]/span[@itemprop='price']");
	int i;
	
	public void sort() throws InterruptedException{
		
		Thread.sleep(40);
		List<WebElement> products = driver.findElements(productlist);
		List<Integer> prices = new ArrayList<Integer>();
		
			int listsize = products.size();
			
			for(i=1;i<listsize+1;i++){
				WebElement price = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li["+i+"]//div/div[1]/span[@itemprop='price']"));
				wait.until(ExpectedConditions.visibilityOf(price));
				System.out.println("Dress price : "+price.getText().toString());
				String priceValue = price.getText().toString().replace("$", "");				
				prices.add((int) Double.parseDouble(priceValue.trim()));							
			}
			
			System.out.println("Price before sorting : "+prices);			
			Collections.sort(prices);
			
			Select dropdown = new Select(driver.findElement(By.id("selectProductSort")));
			dropdown.selectByVisibleText("Price: Lowest first");			
			Thread.sleep(5000);		
			List<WebElement> productsSorted = driver.findElements(productlist);
			List<Integer> pricesSorted = new ArrayList<Integer>();
				
			int sortedListsize = productsSorted.size();
				
				for(i=1;i<sortedListsize+1;i++){
					WebElement priceSorted = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li["+i+"]//div/div[1]/span[@itemprop='price']"));
					wait.until(ExpectedConditions.visibilityOf(priceSorted));
				//	System.out.println("Dress price : "+priceSorted.getText().toString());
					String sortedPriceValue = priceSorted.getText().toString().replace("$", "");					
					pricesSorted.add((int) Double.parseDouble(sortedPriceValue.trim()));							
				}
				System.out.println("Sorted price : "+pricesSorted);		
				boolean result = Arrays.equals(prices.toArray(),pricesSorted.toArray());
				if(result==true){
					System.out.println("Summer dress prices are sorted correctlly");				
				}
				else{
					System.out.println("Summer dress prices are not sorted correctlly");
					fail("Summer dress prices are not sorted correctlly");
				}
				
			}	
				
}
