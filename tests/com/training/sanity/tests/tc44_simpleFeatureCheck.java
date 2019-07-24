package com.training.sanity.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc44_simpleFeatureCheck {
  @Test
  public void tc44() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("http://realestatem1.upskills.in/");
		driver.manage().window().maximize();
		//a[text()=' Log In / Register']
		driver.findElement(By.xpath("//a[text()=' Log In / Register']")).click();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		System.out.println("login button clicked");
		driver.findElement(By.xpath("//div[@class='wp-menu-image dashicons-before dashicons-admin-multisite']")).click();
		driver.findElement(By.xpath("//li[@id='menu-posts-property']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("hello new title");
		//input[@id='tag-slug']
		driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("hello title description");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//label[text()=' Added']")).click();
		
		

  }
}
