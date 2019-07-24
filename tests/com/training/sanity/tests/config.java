package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.BlogPOM;
import com.training.pom.ContactPOM;
import com.training.pom.LoginPOM;
import com.training.pom.Lost_password;
import com.training.pom.New_Launches_tiltePOM;
import com.training.pom.Post_NewPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class config {
	
	public WebDriver driver;
	public String baseUrl;
	public LoginPOM loginPOM;
	public AdminPOM adminPOM;//my own code
	public Lost_password lpwd;
	public BlogPOM blogPOM;
	public New_Launches_tiltePOM  commentPOM;
	public Post_NewPOM postPOM;
	public ContactPOM contactPOM;
	public static Properties properties;
	public ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	//@Test
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		adminPOM = new AdminPOM(driver); //my own code 
		lpwd=new Lost_password(driver);
		blogPOM=new BlogPOM(driver);
		commentPOM=new New_Launches_tiltePOM(driver);
		contactPOM=new ContactPOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
 
}
