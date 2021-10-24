package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTest {

	public static void main(String[] args) {
		//step1: formulate the test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver.exe";

		//step2:Set system property
		System.setProperty("webdriver.chrome.driver",driverPath);

		//Step3: Initate selenium webdriver
		WebDriver driver= new ChromeDriver();

		//Step4: Launch web browser
		driver.get(siteUrl);

		//Step5: Evaluate a test case
		String expectedTitle = "Google";
		String actualTitle =driver.getTitle();

		if(expectedTitle.equals(actualTitle)){
		System.out.println("Test is passed !");
		}else{
		System.out.println("Test failed");
		} 
		System.out.println("Expected Title: " +expectedTitle);
		System.out.println("Actual Title: " +actualTitle);

		//Step6: Close driver
		driver.close();
	}

}
