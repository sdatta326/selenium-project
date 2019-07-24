package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;//my own code
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_RETC_11_copy {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	//private AdminPOM adminPOM;//my own code
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
		//adminPOM = new AdminPOM(driver); //my own code 
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
	@Test  //TESTCASE ID=RETC_011
	public void Test_RETC_011() {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		//admin@12345678910
		//loginPOM.sendPassword("admin@12345678910");
		//loginPOM.sendPassword("admin@123");
		//loginPOM.sendPassword("manzoorupdated");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Test_RETC_011");
	}
	
	/*@Test  //TESTCASE ID=RETC_012
	public void validResetpwdTest() {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		loginPOM.sendPassword("manzoorupdated");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}


	@Test(priority=1)//created my own method from here onwards method no=1 TESTCASE ID=RETC_013
	public void validAdminTest_RETC_013() throws InterruptedException {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		loginPOM.sendPassword("manzoorupdated");
		loginPOM.clickLoginBtn(); 

		adminPOM.userclick();//calling  METHODS of AdminPOM.java class
		adminPOM.myprofileclick();//calling  METHODS of AdminPOM.java class

		adminPOM.lastnameupdate("manzoor10");
		adminPOM.phoneupdate("9455234288");
		adminPOM.updatebuttonclick();
		screenShot.captureScreenShot("First");

	}

	@Test(priority=2)//created my own method from here onwards method no=2 TESTCASE ID=RETC_014
	public void validAdminTest_RETC_014() throws InterruptedException {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		loginPOM.sendPassword("manzoorupdated");
		loginPOM.clickLoginBtn(); 
		adminPOM.userclick();//calling  METHODS of AdminPOM.java class
		adminPOM.myprofileclick();//calling  METHODS of AdminPOM.java class
		//adminPOM.generatepwd("manzoorupdated");
		adminPOM.generatepwd("manzoorupdated");
		adminPOM.updatebuttonclick();
		screenShot.captureScreenShot("First");

	}

	@Test(priority=3)//created my own method from here onwards method no=2 TESTCASE ID=RETC_015
	public void validAdminTest_RETC_RETC_015() throws InterruptedException {
		loginPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		loginPOM.sendPassword("manzoorupdated");
		loginPOM.clickLoginBtn(); 
		adminPOM.userclick();//calling  METHODS of AdminPOM.java class
		adminPOM.logout();
		screenShot.captureScreenShot("First");

	}*/
}

