package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Launches_tiltePOM {
private WebDriver driver; 
	
	public New_Launches_tiltePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//textarea[@id='comment']")
	private WebElement commentv;
	
	@FindBy(xpath="//input[@id='author']")
	private WebElement cname;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement cemail;
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement subc;
	
	@FindBy(xpath="//a[text()=' Log In / Register']")//using my own xpath
	private WebElement mLOGINlink;
	
	
	/*@FindBy(xpath="//div[@class='mmenu-trigger']")
	private WebElement menuc;
	*/
	
	/*
	@FindBy(xpath="//ul[@class='menu mm-listview']/li[7]/a")
	private WebElement loginc;*/
	
	
	

	@FindBy(xpath="//li[@class='right-side-menu-item']")
	private WebElement loginc;
	
	
	
	public void commentb() throws InterruptedException
	{
		//Thread.sleep(8000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");*/
		this.commentv.click();
		this.commentv.sendKeys("John title");
		this.cname.sendKeys("John26100");
		this.cemail.sendKeys("John26100@gmail.com");
		//Thread.sleep(3000);
		this.subc.click();
		//Thread.sleep(3000);
		
		/*JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		*/
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,-4000)");
		
	}
	public void menu_Login_Click() throws InterruptedException
	{
		
		/*Thread.sleep(3000);
		this.menuc.click();
		Thread.sleep(6000);*/
		this.loginc.click();
		
		
		
		
	}
	
	public void mLogInClick() throws InterruptedException, AWTException {
		
		//WebElement link=driver.findElement(By.xpath("//a[@class='sign-in']"));
        Actions action = new Actions(driver);
        action.contextClick(this.mLOGINlink).build().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
		//Actions a=new Actions(driver);
		//a.contextClick(this.mLOGINlink).build().perform();
		//Thread.sleep(4000);
		//this.mLOGINlink.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
		//a.contextClick(this.mLOGINlink).build().perform();
		
		Thread.sleep(4000);
		//a.contextClick(this.mLOGINlink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();//no new window opening,same window clicking
		//Robot rt=new Robot();
		//rt.keyPress(KeyEvent.VK_DOWN);
		//rt.keyPress(KeyEvent.VK_DOWN);
		//rt.keyPress(KeyEvent.VK_ENTER);
		
		//my own defined LOGIN/REGISTER CLICK method
		//this.mLOGINlink.click(); //my own defined LOGIN/REGISTER CLICK method
		/*Thread.sleep(4000);
		Set<String> winid = driver.getWindowHandles();
        Iterator<String> iter = winid.iterator();
        iter.next();
        String tab = iter.next();
        driver.switchTo().window(tab);*/
        //System.out.println(driver.getTitle());
		/*a.contextClick(this.mLOGINlink).perform();
		Thread.sleep(3000);
		a.sendKeys("t").perform();*/
		System.out.println("register button click");
		
	}
	
	public void newWindow()
	{
		
			
		String MainWindow=driver.getWindowHandle();	
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    /*driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();	*/		
                                 
			// Closing the Child Window.
                       // driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            //driver.switchTo().window(MainWindow);
	}
	
	/*public void closechildwindow() throws InterruptedException
	{
		// Closing the Child Window.
       driver.close();
     // Switching to Parent window i.e Main Window.
        //this.driver=driver;
        String MainWindow=driver.getWindowHandle();	
        Thread.sleep(3000);
        driver.switchTo().window(MainWindow);
        //driver.close();
	}*/
	
	
	
}
