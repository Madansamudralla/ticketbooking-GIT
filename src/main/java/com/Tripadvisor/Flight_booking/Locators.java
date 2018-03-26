package com.Tripadvisor.Flight_booking;

import org.openqa.selenium.By;

public class Locators {

	public static By Flights = By.partialLinkText("Flights");
	
	public static By Flightsdynxpath = By.xpath("//*[contains(@id,'nav-flights')]");
	
	public static By Oneway =  By.partialLinkText("One-way");
	
	public static By Origin = By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[2]/div/div[1]/div/div[1]/input[2]");

    public static By Destination = By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[2]/div/div[1]/div/div[2]/input[2]");

    public static By calendarclick = By.xpath("//div[@class='prw_rup prw_datepickers_flights_single_date_datepicker']/div[@id='ow_ui_picker']");

    public static By Rightnavigate = By.xpath("//div[@class='dsdc-next ui_icon single-chevron-right-circle']");
    
    public static By dateselection = By.xpath("//span[@class='dsdc-month']/span[@class='dsdc-cell dsdc-day'][12]");

    public static By flightsearchbutton = By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[2]/div/div[4]");


}
