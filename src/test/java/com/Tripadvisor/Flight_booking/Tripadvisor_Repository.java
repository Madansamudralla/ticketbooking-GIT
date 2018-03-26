package com.Tripadvisor.Flight_booking;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Tripadvisor_Repository {

	public  WebDriver driver;
	
	/*public  Tripadvisor_Repository(WebDriver driver){
		this.driver = driver;
	
	}*/
	
	public void browserlaunch(String browser) {
		 // If the browser is Firefox, then do this		
	  if(browser.equalsIgnoreCase("Chrome")) {		  

			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			driver= new ChromeDriver();
			// If browser is IE, then do this	  

	  }else if  (browser.equalsIgnoreCase("ie")) { 

		  // Here I am setting up the path for my IEDriver

		  System.setProperty("webdriver.ie.driver", "c://MicrosoftWebDriver.exe");

		  driver = new InternetExplorerDriver();
        
	  } 
	  
	  else if  (browser.equalsIgnoreCase("firefox")) { 

		  // Here I am setting up the path for my IEDriver
		  System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		    driver = new FirefoxDriver();
		         
	  } 
	  
	}

	
	public void URL() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.tripadvisor.in/");	  
		  	driver.manage().window().maximize();	  	 
		  	Tripadvisor_Repository.capturescreenshot(driver);
		  	Thread.sleep(2000);
		  	System.out.println(driver.getCurrentUrl());		
		  	System.out.println(driver.getTitle());	
		  	//driver.navigate().refresh();
		  	//Thread.sleep(2000);
		  		}
	
	public void flightlink(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			driver.findElement(Locators.Flights).click();
			System.out.println("Clicked on flight link");
		}
		
		catch(Exception e){
			driver.findElement(Locators.Flightsdynxpath).click();
			System.out.println("Clicked on flight link");
		}
		
		
		
		
		//i have tried validation in below scenario
	     String url = driver.getCurrentUrl();
	
  	     if(url.equals("https://www.tripadvisor.in/CheapFlightsHome")){
  		 System.out.println("Test Case passed, clicked on flights link");
  	       }
  	      else{
  		 System.out.println("Test case failed,Flight link has not clicked please recheck once");
  	    }
  	     
  	   Tripadvisor_Repository.capturescreenshot(driver);
	    }
	
    public void onewaylink() throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement oneway = driver.findElement(Locators.Oneway);
    	oneway.click();
    	String text = oneway.getText();
		System.out.println(text);
		
		if(text.equals("One-way")){
				System.out.println("Test case passed and clicked on one way link");
	}
	else{
		System.out.println("Test case Failed");
	}
   //Below i kept thread to observe the action 		
	Thread.sleep(3000);
    }
    
    public void originlocation() throws InterruptedException{
    	WebElement origin = driver.findElement(Locators.Origin);
    	origin.clear();
    	Thread.sleep(2000);
    	origin.click();
    	origin.sendKeys(Testdata.originName);
    	Thread.sleep(2000);    	
    }
    
    public void destinationlocation() throws InterruptedException{
    	WebElement destination = driver.findElement(Locators.Destination);
    	destination.clear();
    	Thread.sleep(2000);
    	destination.click();
    	destination.sendKeys(Testdata.DestinationName);
       	Tripadvisor_Repository.capturescreenshot(driver);
       	Thread.sleep(4000);
    }
    
    public void dateselection() throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(Locators.calendarclick).click();
    	Thread.sleep(2000);
    	driver.findElement(Locators.Rightnavigate).click();
    	Thread.sleep(2000);
    	driver.findElement(Locators.dateselection).click();
    	Thread.sleep(3000);
    }
    
    public void findflights(){
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(Locators.flightsearchbutton).click();
    }

  	public static void capturescreenshot(WebDriver driver ){
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			//i am copying the  screenshot to my given location
			//FileUtils.copyFile(src, new File("C:/Users/madan.samudralla/SeleniumPractise1/workspace/Flight_booking/screenshot"+System.currentTimeMillis()+".png")); 
		}
		catch(Exception e1){
			System.out.println("Please check");
		}
  	
  	}
  	
	
	
  	public void browserquit() throws InterruptedException{
  		Thread.sleep(3000);
  		driver.quit();
	}
	
}
