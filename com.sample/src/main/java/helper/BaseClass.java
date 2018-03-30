package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BaseClass {
 public static WebDriver driver;
 public static boolean bResult;
 public static WebDriverWait wait;

public BaseClass(WebDriver driver){
 BaseClass.driver = driver;
 BaseClass.bResult = true;
 wait = new WebDriverWait(driver, 60);
 
 }
}