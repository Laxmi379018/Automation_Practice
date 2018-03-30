package helper;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory extends BaseClass
        {
		public BrowserFactory(WebDriver driver){
		super(driver);
		 }
	
	public static WebDriver startBrowser(String Browsername,String URL){
		System.out.println("Launching browser");
		//System.out.println(config.getBrowser());
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(Browsername.equalsIgnoreCase("IE"))
		{
			
			File ieFile = new File("C:\\Users\\KASTURI PARIDA\\workspace\\Gleam\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", ieFile.getAbsolutePath());
			DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
			ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, URL);
			driver = new InternetExplorerDriver(ieCaps);
			
		}
		
		driver.manage().window().maximize();
		
		return driver;
	
	}
	

}
