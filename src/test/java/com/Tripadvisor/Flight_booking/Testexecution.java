package com.Tripadvisor.Flight_booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testexecution extends Tripadvisor_Repository{
  
	//public static WebDriver driver;
	//Tripadvisor_Repository tr;

	// Passing Browser parameter from TestNG xml
	@Parameters("browser")
	@BeforeClass
/*	public void beforeTest(String browser) {
		 // If the browser is Firefox, then do this		
	  if(browser.equalsIgnoreCase("Chrome")) {		  

			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			driver= new ChromeDriver();
			// If browser is IE, then do this	  

	  }else if (browser.equalsIgnoreCase("ie")) { 

		  // Here I am setting up the path for my IEDriver

		  System.setProperty("webdriver.ie.driver", "c://MicrosoftWebDriver.exe");

		  driver = new InternetExplorerDriver();
		  
         
	  } 	 
	  }*/
	
	public void launchbrowser(String browser){
		browserlaunch(browser);
		System.out.println("Browser has launched succesfully before Test");
	}
	

	@BeforeMethod
	public void EnterURL() throws InterruptedException{
		//tr = new Tripadvisor_Repository(driver);
		URL();
		System.out.println("We have passed teh URL in the Before Method ");
	}
	
	@Test(priority=0, description = "flightticket booking" ,enabled=true)
	public void ticketbooking() throws InterruptedException{
		flightlink();
		onewaylink();
		originlocation();
		destinationlocation();
		dateselection();
		findflights();
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("Ticket booking has completed succesfully and this is for after method");
	}
	
	@AfterClass
	public void browsertoquit() throws InterruptedException{
		browserquit();
		System.out.println("Browser quit has completed in after class method");
	}
}
