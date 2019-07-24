package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lost_password {
	
private WebDriver driver; 
	
	public Lost_password(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user_login")//using my own code
	private WebElement loginemail; 
	
	@FindBy(name="submit")//using my own code
	private WebElement resetpwd;
	
	@FindBy(id="post-124")
	private WebElement msg;
	
	
	public void email(String e) {
		this.loginemail.sendKeys(e);
	}
	
	public void reset_password() {
		this.resetpwd.click();
	}
	
	public String password_message() {
		return this.msg.getText();
	
	}
	
	
	
	
	

}
