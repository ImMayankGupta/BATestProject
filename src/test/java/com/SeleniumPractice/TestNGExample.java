package com.SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExample {
	
	@BeforeClass
	public void test0() {
		System.out.println("This will execute before test");
	}
	
	@Test
	public void test1() {
		System.out.println("This is my actual test case");
	}
	
	@AfterClass
	public void test2() {
		System.out.println("This will execute after test");
	}

}
