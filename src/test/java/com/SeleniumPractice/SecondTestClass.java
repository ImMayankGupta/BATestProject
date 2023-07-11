package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mayankgupta/eclipse-workspace/SeleniumPractice/Driver/chromedriver");  
		
		WebDriver driver=new ChromeDriver();
		
		//first command
		driver.get("https://demoqa.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='card-up'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("ABC");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("ABC@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("currentAddress")).clear();
		driver.findElement(By.id("currentAddress")).sendKeys("New York");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("permanentAddress")).clear();
		driver.findElement(By.id("permanentAddress")).sendKeys("New York");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("output")).isDisplayed();
	
		
		Thread.sleep(2000);
		driver.quit();

	}

}
