package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	
import helper.BaseClass;
	public class LoginPage extends BaseClass
	{
		public LoginPage(WebDriver driver)
		{
		 super(driver);
		}

		 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")		 
		 static WebElement link_Sign_In;
	 
		 @FindBy(how = How.ID, using = "email")	 
		 static WebElement txtbx_email;
	 
		 @FindBy(how = How.ID, using = "passwd")	 
		 static WebElement txtbx_Password;
	 
		 @FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")	 
		 static WebElement btn_Submit_Login ;
	 
		 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")	 
		 static WebElement lnk_Sign_Out;
	}
	