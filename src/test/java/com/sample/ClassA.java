package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	public static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Test
	public void test() {

		driver.findElement(By.id("username")).sendKeys("Francis3535");
		driver.findElement(By.id("password")).sendKeys("Francis@123");
		driver.findElement(By.id("login")).click();

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	
	
	
}
