package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.ContactBean;
import com.training.dao.ELearningDAO;

public class ContactFormDataProviders {
	@DataProvider(name = "dbcontact-inputs")
	public Object [][] getDBData() {

		List<ContactBean> list = (List<ContactBean>) new ELearningDAO().getContacts(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(ContactBean temp : list){
			Object[]  obj = new Object[4]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getemail(); 
			obj[2] = temp.getSubject(); 
			obj[3] = temp.getMsg();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
}
