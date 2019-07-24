package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlogPOM {
private WebDriver driver; 
	
	public BlogPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//div[@id='post-4916']/child::div/child::a")//the original one
	private WebElement readmorev;*/
	
	//p[text()='New Launch in Home']//following-sibling::a[@class='read-more']
	
	@FindBy(xpath="//p[text()='New Launch in Home']//following-sibling::a[@class='read-more']")
	private WebElement readmorev;
	
	
	@FindBy(xpath="//div[@class='blog-post single-post']/div/a/h3")
	private WebElement postdetailv;
	
	
	
	@FindBy(xpath="//a[@class='button fullwidth margin-top-20']")
	private WebElement droplinkclick;
	
	
	
	
	
	
	
	
	public void readMore() throws InterruptedException
	{
		//Thread.sleep(8000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		this.readmorev.click();
		
	}
	
	public void postDetails() throws InterruptedException
	{
		
		//Thread.sleep(8000);
		this.postdetailv.click();
		
	}
	
	
	
	public void droplinkclickfunc() throws InterruptedException
	{
		Thread.sleep(3000);
		/*WebElement delement=this.droplinkclick;//not working
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", delement);
		Thread.sleep(3000);*/
		this.droplinkclick.click();
		
		
		
	}
	
	
	
	
}
	