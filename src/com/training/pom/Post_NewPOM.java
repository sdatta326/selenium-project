package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_NewPOM {
	
private WebDriver driver; 
	
	public Post_NewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//input[@id='title']")//new title
	private WebElement posttitlev;*/
	
	/*@FindBy(xpath="	//textarea[@id='content']")
	private WebElement textareav;
	

	
	@FindBy(xpath="//input[@id='publish']")
	private WebElement publishv;
	
	
	

	@FindBy(xpath="//div[@id='message']/p/a")
	private WebElement viewmsg;*/
	
	/*public void addnewtitleClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		this.posttitlev.click();
		this.posttitlev.sendKeys("second");//new title
	}*/
	
	/*public void textareaClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.textareav.sendKeys("typing second buildingaddress  here");
	}
	
	public void publishClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.publishv.click();
	}
	
	public void viewMSGClick()//QUESTIONS FOR EVERY OPERATION LIKE CLICK LINK,CLICK LOGIN DO WE HAVE TO CREATE METHODS HERE
	{
		//this.posttitlev.click();
		this.viewmsg.click();
	}
*/

	

}
