package com.SeleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Medium {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "/Users/mayankgupta/eclipse-workspace/SeleniumPractice/Driver/chromedriver");  
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://medium.com/@mayankgupta654/list-of-remote-job-websites-f75ef6f6017e");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/how-chatgpt-helpful-for-qa-engineer-8d71fc72a906");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/internet-of-things-iot-testing-301be1da5c5f");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/testng-cheatsheet-8929f324f390");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/selenium-cheat-sheet-8b2e87cb4710");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/test-cases-for-bluetooth-earphone-b9a233c6b431");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/artificial-intelligence-in-testing-a400f8d99560");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/how-to-use-chatgpt-for-testing-949cc0dd7c29");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/how-artificial-intelligence-in-testing-works-e2c11010234c");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/how-to-use-chatgpt-1c09fd68bd9a");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/how-to-become-a-good-tester-ba56828f5515");
		
		Thread.sleep(180000);
		
		driver.get("https://medium.com/@mayankgupta654/why-do-we-need-automation-testing-498fb652aa38");
		
		Thread.sleep(180000);
		
		driver.quit();
		
	}

}
