package managers;

import org.openqa.selenium.WebDriver;

import helper.ConfigReader;
import modules.Sort_SummerDress;
import pageObjects.LoginPage;
import pageObjects.Megamenu;
import pageObjects.RegistrationPage;

public class PageObjectManager {
	private WebDriver driver;
	private Megamenu megamenu;
	private RegistrationPage regpage;
	private ConfigReader configreader;
	private Sort_SummerDress sortsumdress;
	
	public PageObjectManager(WebDriver driver) {	 
		this.driver = driver; 
	}
	
	public ConfigReader getConfigReader(){
		 
		return (configreader == null) ? configreader = new ConfigReader() : configreader;
	}
	public Megamenu getMegaMenu(){
		 
		return (megamenu == null) ? megamenu = new Megamenu(driver) : megamenu;
	}
	public RegistrationPage getRegistrationPage(){
		 
		return (regpage == null) ? regpage = new RegistrationPage(driver) : regpage;
	}

	public Sort_SummerDress getSummerDressSorting(){
		 
		return (sortsumdress == null) ? sortsumdress = new Sort_SummerDress(driver) : sortsumdress;
	}

	
	

}
