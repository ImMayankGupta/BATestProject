package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleTestNG {


	// This is the test message
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/mayankgupta/eclipse-workspace/SeleniumPractice/Driver/chromedriver");  
		driver=new ChromeDriver();
		//first command
		driver.get("https://demoqa.com/");
	}
	
	@BeforeSuite
	public void firstMethod() {
		System.out.println("Hello.. this is my automation framework test start....");
	}
	
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='card-up'])[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test3() throws InterruptedException {
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("ABC");
		Thread.sleep(2000);
	}
	
	@Test
	public void test4() throws InterruptedException {
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("ABC@gmail.com");
		Thread.sleep(2000);
	}
	
	@Test
	public void test5() throws InterruptedException {
		driver.findElement(By.id("currentAddress")).clear();
		driver.findElement(By.id("currentAddress")).sendKeys("New York");
		Thread.sleep(2000);
	}
	
	@Test
	public void test6() throws InterruptedException {
		driver.findElement(By.id("permanentAddress")).clear();
		driver.findElement(By.id("permanentAddress")).sendKeys("New York");
		Thread.sleep(2000);
	}
	
	@Test
	public void test7() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("output")).isDisplayed();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
