package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePOM {
	
	private WebDriver driver; 

	public ProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;//my own implicit code
	}



	

	@FindBy(id="last_name")
	private WebElement lnamev;

	@FindBy(id="billing_phone")
	private WebElement phonev;

	@FindBy(id="submit")
	private WebElement updatev;
	

	@FindBy(xpath="//div[@class='updated notice is-dismissible']/p/strong")
	private WebElement msg1;
	
	
	@FindBy(xpath="//button[text()='Generate Password']")
	private WebElement gpwd;
	

	@FindBy(id="pass1-text")
	private WebElement  pwdtext;
	
	
	
	@FindBy(xpath="//ul[@id='wp-admin-bar-top-secondary']/li/a")
	private WebElement loutmvuser;



	@FindBy(xpath="//li[@id='wp-admin-bar-logout']")
	private WebElement loutclick;
	
	public void lastnameupdate(String lname) throws InterruptedException
	{
		this.lnamev.clear();

		this.lnamev.sendKeys(lname);
		Thread.sleep(9000);



	}
	public void phoneupdate(String phone) throws InterruptedException
	{
		this.phonev.clear();
		Thread.sleep(9000);
		this.phonev.sendKeys(phone);
		Thread.sleep(9000);


	}
	
	
	
	
	
	
	public void generatepwd(String gp) throws InterruptedException
	{

		
		this.gpwd.click();
		Thread.sleep(9000);
		this.pwdtext.sendKeys(gp);
		Thread.sleep(9000);
		

	}
	
	public void updatebuttonclick()
	{

		this.updatev.click();

	}
	
	public String update_message() {
		return this.msg1.getText();
	
	}
	
	

	public void logout()
	{
		Actions a=new Actions(driver);
		a.moveToElement(loutmvuser).build().perform();

		this.loutclick.click();
	}

}
