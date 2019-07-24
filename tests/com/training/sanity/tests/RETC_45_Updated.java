package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.RETC_45POM;

public class RETC_45_Updated extends config{
	private RETC_45POM retc45pom;
	
	@Test
	public void Region() throws InterruptedException {
		retc45pom = new RETC_45POM(driver);
		loginPOM.mLogInClick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		retc45pom.propertyclickfun();
		retc45pom.regionclickfun();
		retc45pom.regiontextfunc();
		String regiontext=retc45pom.regiontitle();
		retc45pom.selectvfunc();
		String regionxpath=retc45pom.parentRegion();
		retc45pom.textdescvfunc();
		retc45pom.addregionclvfunc();
		retc45pom.addnewvfunc();
		retc45pom.titlefunc();
		retc45pom.textareafunc();
		retc45pom.checkboxfunc1(regionxpath);
		Thread.sleep(5000);
		retc45pom.checkboxfunc2(regiontext);
		retc45pom.regionpublishfunc();
		retc45pom.viewmsgfunc();
	}
}
