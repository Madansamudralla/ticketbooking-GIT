package booking_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  
	public static WebDriver driver;
  
	@BeforeTest
	public void launchchromebrowser(){
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
	}
  
	@BeforeMethod()
	
	public void URL(){
		  driver.get("https://www.tripadvisor.in/");	  
		  	driver.manage().window().maximize();	  	 
		  	//Flight_booking.capturescreenshot(driver);
		}
	
	
}
