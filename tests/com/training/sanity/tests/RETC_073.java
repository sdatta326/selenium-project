package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.dataproviders.ContactFormDataProviders;
import com.training.dataproviders.LoginDataProviders;

public class RETC_073 extends config{
	@Test(dataProvider = "dbcontact-inputs", dataProviderClass = ContactFormDataProviders.class)
	public void RETC_073(String dbuserName,String dbemail,String dbsubject,String dbmessage) throws InterruptedException {
		loginPOM.clcikbloglinkdb();
		blogPOM.droplinkclickfunc();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		String contactformuser=contactPOM.namecdb("samama");
		System.out.println(contactformuser);
		System.out.println(dbuserName);
		String contactformemail=contactPOM.emailcdb("s@gmail.com");
		String contactsubject=contactPOM.subjectcdb("welcome sub");
		String contactmsg=contactPOM.msgcdb("typing message here");
		contactPOM.submitcdb();
		Thread.sleep(3000);
		
		Assert.assertEquals(contactformuser,dbuserName,"matched");//validate for correct testdata in table
		//Assert.assertEquals(contactformuser,dbuserName,"not matched");//Validate FOR incorrect testdata in table
		
		Assert.assertEquals(contactformemail,dbemail,"matched");//for correct testdata in table
		//Assert.assertEquals(contactformemail,dbemail,"not matched");//FOR incorrect testdata in table
		
		
		Assert.assertEquals(contactsubject,dbsubject);//for correct testdata in table
		//Assert.assertEquals(contactsubject,dbsubject);//FOR incorrect testdata in table
		
		Assert.assertEquals(contactmsg,dbmessage);//for correct testdata in table
		//Assert.assertEquals(contactmsg,dbmessage);//FOR incorrect testdata in table
		
		
	}
}
