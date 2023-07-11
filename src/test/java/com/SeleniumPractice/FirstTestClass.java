package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mayankgupta/eclipse-workspace/SeleniumPractice/Driver/chromedriver");  
		
		WebDriver driver=new ChromeDriver();
		
		//first command
		driver.get("https://www.google.com/");
		
		// imp commands= click, sendkeys, clear, submit, gettext 
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).clear();
		driver.findElement(By.id("APjFqb")).sendKeys("New York");
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).submit();
		Thread.sleep(5000);
		
		
		//last command
		driver.quit();
		
		
	
		
		//Multi thread- multiple test are running in parallel
		// 3 drivers
		// current driver is in queue 3 position
		// using notify with tell that driver is active

	}

}
