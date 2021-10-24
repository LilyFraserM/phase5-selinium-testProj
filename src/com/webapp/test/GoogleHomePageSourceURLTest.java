package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageSourceURLTest {

	public static void main(String[] args) {
		//step1: formulate the test url
		String siteUrl = "https://www.google.com";
		String driverPath = "drivers/chromedriver.exe";

		//step2:Set system property
		System.setProperty("webdriver.chrome.driver",driverPath);

		//Step3: Initate selenium webdriver
		WebDriver driver= new ChromeDriver();

		//Step4: Launch web browser
		driver.get(siteUrl);
		
		//Step5: Evaluate a test case
		if(siteUrl.equals(driver.getCurrentUrl())) {
				
				System.out.println("Test is passed !");
				}else{
				System.out.println("Test failed");
				} 
				System.out.println("Expected Title: " +siteUrl);
				System.out.println("Actual Title: " +driver.getCurrentUrl());

				//Step6: Close driver
				driver.close();

	}

}
