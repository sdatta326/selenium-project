package com.training.sanity.tests;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RETC_41_copy extends config {


	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/

	@Test
	public void RETC_041() throws InterruptedException, AWTException {
//implicit timeout value function call from here and create function in another page to apply it for all the below elements
		//explicit wait function call from here and create that statement inside another function to wait for that particuler element only 
		
		//
		loginPOM.clcikbloglink();
		blogPOM.readMore();
		commentPOM.commentb();
		//screenShot.captureScreenShot("Test_RETC_041_comments_user");
Thread.sleep(4000);
		//commentPOM.menu_Login_Click();
		commentPOM.mLogInClick();
		
		//commentPOM.mLogInClick();//calling my own defined LOGIN/REGISTER METHOD of LoginPOM.java class
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn();
		adminPOM.commentClick();
		adminPOM.logout();
		screenShot.captureScreenShot("Test_RETC_041_comments_admin");
	}
}
