package com.training.sanity.tests;

import org.testng.annotations.Test;

public class RETC_044 extends config{
	@Test
	public void RETC_045() throws InterruptedException
	{
		
		loginPOM.mLogInClick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		
		loginPOM.clickLoginBtn(); 
		adminPOM.propertyclickfun();
		//adminPOM.regionclickfun();
		//adminPOM.regiontextfunc();
		//adminPOM.selectvfunc();
		//adminPOM.textdescvfunc();
		//adminPOM.addregionclvfunc();
		//adminPOM.addnewvfunc();
		adminPOM.featurenewvfunc();
		adminPOM.featuretitlefunc();
		String featureTitleCapture=adminPOM.getFeatureTitle();//creating object of AdminPOM.java that is adminPOM here and 
		//then accessing return value of function of AdminPOM.java class
		adminPOM.featureslugfunc();
		adminPOM.featurtextareafunc();
		adminPOM.addfeaturesubmitfunc();
		adminPOM.propertyclickfun();
		adminPOM.addnewvfunc();
		adminPOM.titlefunc();
		adminPOM.textareafunc();
		Thread.sleep(3000);
		//pass variable featureTitleCapture in checkboxfun1 below
		adminPOM.checkboxfunc1(featureTitleCapture);
		Thread.sleep(3000);
		//adminPOM.checkboxfunc2();
		adminPOM.regionpublishfunc();
		adminPOM.viewmsgfunc();
	}
}
