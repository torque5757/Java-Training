package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selwaits {
	 
	public static void main(String args[])
	    {
	    	System.setProperty(
	    	          "webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	        
	       
	    	WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        String title = driver.getTitle();
	        System.out.println(title);
	       driver.findElement(By.linkText("Sign in")).click();

}
}
