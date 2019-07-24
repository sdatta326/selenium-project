package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RETC_45POM {

	private WebDriver driver; 

	public RETC_45POM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//property tab
	@FindBy(xpath="//div[@class='wp-menu-image dashicons-before dashicons-admin-multisite']")
	private WebElement propertyclv;

	public void propertyclickfun() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{

		this.propertyclv.click();
		Thread.sleep(3000);
	}


	//region
	@FindBy(xpath="	//a[text()='Regions']")
	private WebElement regionclv;

	public void regionclickfun() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{

		this.regionclv.click();
		this.regionclv.click();
	}

	//region textbox

	@FindBy(xpath="//input[@id='tag-name']")
	private WebElement regionnamev;//child region

	@FindBy(xpath="//input[@id='tag-slug']")
	private WebElement 	tag_slugv;

	public void regiontextfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{

		this.regionnamev.sendKeys("region title of silk board");
		Thread.sleep(3000);
		this.tag_slugv.sendKeys("slug text silk board");
	}

	//retriew regoin textbox value	
	public String regiontitle() throws InterruptedException {
		String child = this.regionnamev.getAttribute("value");
		Thread.sleep(6000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,300)");
				
				String childregionxpathbefore="//label[text()=' ";//from uncomment
				String childregionxpathafter="']";

				return childregionxpathbefore+child+childregionxpathafter;
	}

	//select region
	@FindBy(xpath="//select[@id='parent']")
	private WebElement 	selectv;

	public void selectvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{

		Thread.sleep(3000);
		Select s=new Select(selectv);
		s.selectByVisibleText("Villas");

	}

	//fetch parent region & xpath to click
	public String parentRegion() {
		Select s=new Select(selectv);
		String region= s.getFirstSelectedOption().getText();
		String regionxpathbefore="//label[text()=' ";
		String regionxpathafter="']";

		String regionxpath=regionxpathbefore+region+regionxpathafter;//uncomment
		System.out.println(regionxpath);//uncomment
		return regionxpath;
	}

	//textdescription
	@FindBy(xpath="//textarea[@id='tag-description']")
	private WebElement 	textdescv;

	public void textdescvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.textdescv.sendKeys("full text description Villas");
	}

	//clickaddbutton
	@FindBy(xpath="//input[@id='submit']")
	private WebElement 	addregionclv;

	public void addregionclvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.addregionclv.click();
	}


	//properties tab

	//add new button
	@FindBy(xpath="//li[@id='menu-posts-property']/ul/li[3]/a")
	private WebElement 	addnewv;

	public void addnewvfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.addnewv.click();
	}

	//title
	@FindBy(xpath="//input[@id='title']")//new title
	private WebElement posttitlev;
	public void titlefunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.posttitlev.sendKeys("title next Villas");
	}

	//text area
	@FindBy(xpath="	//textarea[@id='content']")
	private WebElement textareav;	

	public void textareafunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.textareav.sendKeys("hello bangalore textarea for next Villas");
	}

	public void checkboxfunc1(String checboxxpath) throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		System.out.println("function is called");
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.xpath(checboxxpath)).click();//uncomment
		}

	public void checkboxfunc2(String childxpath) 
	{
		
		
		driver.findElement(By.xpath(childxpath)).click();//to uncomment
		}
	
	
	//publish button
	@FindBy(xpath="//input[@id='publish']")
	private WebElement 	regionpub;
	
	public void regionpublishfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-4000)");
		this.regionpub.click();
		}
	
	@FindBy(xpath="//a[text()='View post']")
	private WebElement 	viewrecl;
	
	public void viewmsgfunc() throws InterruptedException//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		Thread.sleep(3000);
		this.viewrecl.click();
	}
	
}
