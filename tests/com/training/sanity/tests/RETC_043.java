package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RETC_043 extends config{
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}	

	@Test
	public void RETC_045() throws InterruptedException
	{
		loginPOM.mLogInClick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		adminPOM.propertyclickfun();
		adminPOM.addnewvfunc();
		adminPOM.titlefunc();
		adminPOM.textareafunc();
		adminPOM.regionpublishfunc();
		adminPOM.viewmsgfunc();
	}
}
