package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactPOM {
private WebDriver driver; 
	
	public ContactPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='name']")//using my own code
	private WebElement namec; 
	
	@FindBy(xpath="//input[@name='email']")//using my own code
	private WebElement emailc; 
	
	@FindBy(xpath="//input[@name='subject']")//using my own code
	private WebElement subjectc; 
	
	@FindBy(xpath="//textarea[@placeholder='Message']")//using my own code
	private WebElement msgc; 
	
	@FindBy(xpath="//input[@type='submit']")//using my own code
	private WebElement submitc; 
	
	@FindBy(xpath="//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng']")
	private WebElement getmsg;

	
	

	public String namecdb(String user) {
		
		this.namec.sendKeys(user); 
		return this.namec.getAttribute("value");
	}
	
	public String emailcdb(String email) {
		this.emailc.sendKeys(email); 
		return this.emailc.getAttribute("value");
	}
	
	public String subjectcdb(String sub) {
		this.subjectc.sendKeys(sub); 
		return this.subjectc.getAttribute("value");
	}
	
	public String msgcdb(String msg) {
		this.msgc.sendKeys(msg);
		return this.msgc.getAttribute("value");
		
	}
	
	public void submitcdb() throws InterruptedException {
		this.submitc.click(); 
		Thread.sleep(5000);
		/*String actualmsg=this.getmsg.getText();
		String expectmsg="Thank you for your message.";
		Assert.assertEquals(actualmsg, expectmsg);*/
	}
}
