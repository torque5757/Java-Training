package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunchDemo {
	
	
  public  static WebDriver driver;

    public static void main(String args[])
    {
    
    
    System.setProperty( 
    		"webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
    
  
    driver = new FirefoxDriver();
    
    
    driver.get("https://www.amazon.in/");
    String title = driver.getTitle();
    System.out.println(title);
    driver.findElement(By.id("nav-hamburger-menu")).click();
   
}

}


