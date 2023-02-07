package seleniumproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebElement w = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//  wait.until(ExpectedConditions.visibilityOf(w));
		//driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		 WebElement fb = wait.until(new Function<WebDriver, WebElement>() { 
			 public WebElement apply(WebDriver driver)
			 {
				 return driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
			 }
			 
			});
		 fb.click();
		
		
	}

}
