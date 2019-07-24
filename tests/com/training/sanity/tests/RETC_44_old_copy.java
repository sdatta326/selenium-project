package com.training.sanity.tests;

import org.testng.annotations.Test;

public class RETC_44_old_copy extends config{
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
		adminPOM.featureslugfunc();
		adminPOM.featurtextareafunc();
		adminPOM.addfeaturesubmitfunc();
		adminPOM.propertyclickfun();
		adminPOM.addnewvfunc();
		adminPOM.titlefunc();
		adminPOM.textareafunc();
		//adminPOM.checkboxfunc1();
		//adminPOM.checkboxfunc2();
		adminPOM.regionpublishfunc();
		adminPOM.viewmsgfunc();
	}
}
