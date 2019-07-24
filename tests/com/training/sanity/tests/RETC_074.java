package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;

public class RETC_074 extends config {
	
	
	
	@Test(dataProvider ="excel-inputs_forRETC_074", dataProviderClass = LoginDataProviders.class)
	
public void RETC_074(String Users_Checkbox,String Change_Role,String newuser,String newuseremail) throws InterruptedException {
		loginPOM.mLogInClick();
		loginPOM.sendUserName("admin");//EXCEL
		loginPOM.sendPassword("adminuser@12345");//EXCEL
		loginPOM.clickLoginBtn(); 
		adminPOM.userlinkclcikfunc();
		adminPOM.addnewuserfunc();
		adminPOM.newunamecfunc(newuser);//EXCEL
		adminPOM.addnewemailfunc(newuseremail);//EXCEL
		adminPOM.addnewusersubfunc();
		Thread.sleep(5000);
		adminPOM.alluserlinkclcikfunc();
		Thread.sleep(5000);
		adminPOM.checkuserfunc(Users_Checkbox);//EXCEL
		//adminPOM.changerolefunc();
		adminPOM.selectnewrolefunc(Change_Role);
		adminPOM.rolechangesubfunc();
	}
}
