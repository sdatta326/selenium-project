package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Log In / Register']")//using my own xpath
	private WebElement mLOGINlink;//using my own xpath
	
	/*@FindBy(id="login")
	private WebElement userName; */
	
	@FindBy(id="user_login")
	private WebElement userName;//using my code
	
	//user_pass
	
	/*@FindBy(id="password")
	private WebElement password;*/
	
	@FindBy(id="user_pass")
	private WebElement password;//using my code
	
	
	/*@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn;*/
	
	//Sign In
	
	@FindBy(name="login")//using my own code
	private WebElement loginBtn; 
	
	
	
	

	@FindBy(xpath="//a[text()=' Lost Your Password?']")
	private WebElement changepwd; 
	
	
	@FindBy(xpath="//li[@id='menu-item-617']/a[text()='Blog']")
	private WebElement bloglink;
	
	
	
	@FindBy(xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-617']//a[text()='Blog']")
	private WebElement bloglinkdb;
	
	
	public void mLogInClick() {  //my own defined LOGIN/REGISTER CLICK method
		this.mLOGINlink.click(); //my own defined LOGIN/REGISTER CLICK method
		
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	
	
	public void clickLoginBtn() {
	
		this.loginBtn.click(); 
	}
	
	public void clcikbloglink() {
		this.bloglink.click(); 
	}
	
	
	
	public void clcikbloglinkdb() {
		this.bloglinkdb.click(); 
	}
	
	
	
	public void changePWD() throws InterruptedException {
		//keyboard//robot framework//javascriptexecuter
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//js.executeScript("arguments[0].scrollIntoView()",this.changepwd);
		Thread.sleep(3000);
		this.changepwd.click(); 
		
	}
}
