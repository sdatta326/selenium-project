package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.pom.Lost_password;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;




public class RETC_012 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminPOM adminPOM;//my own code
	private Lost_password lpwd;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		adminPOM = new AdminPOM(driver); //my own code 
		lpwd=new Lost_password(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}	


	@Test  //TESTCASE ID=RETC_012
	public void Test_RETC_012() throws InterruptedException {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		//loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		//loginPOM.sendPassword("manzoorupdated");
		//loginPOM.clickLoginBtn(); 
		
		Thread.sleep(8000);
		loginPOM.changePWD();
		Thread.sleep(8000);
		lpwd.email("rinidatta6@gmail.com");
		lpwd.reset_password();
		//submit
		screenShot.captureScreenShot("Test_RETC_012");
	
		//try
		//{
			String expected="A confirmation link has been sent to your email address";
			String actual=lpwd.password_message();
			Assert.assertEquals(actual, expected,"validation failed without try catch");
		//}
		/*catch(Exception e)
		{
			System.out.println("validation failed with exception");
		}
		*/
		
		
		
		}
		
	}

