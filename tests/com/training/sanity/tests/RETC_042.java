package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RETC_042  extends config{
	
	@Test
	public void RETC_042() throws InterruptedException {
		loginPOM.mLogInClick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		adminPOM.postClick();
		adminPOM.addnewpostClick();
		Thread.sleep(3000);
		adminPOM.addnewtitleClick();
		//postPOM.addnewtitleClick();
		//postPOM.textareaClick();
		adminPOM.textareaClick();
		adminPOM.publishClick();
		adminPOM.viewMSGClick();
		blogPOM.postDetails();
		screenShot.captureScreenShot("Test_RETC_042_blogs_new_post_admin");
		
	}
}
