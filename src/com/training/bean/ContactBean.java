package com.training.bean;

public class ContactBean {
	private String username;
	private String email;
	private String subject;
	private String message;

	public ContactBean() {
	}

	public ContactBean(String userName, String email,String sub,String msg) {
		super();
		this.username = userName;
		this.email = email;
		this.subject=sub;
		this.message=msg;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String sub) {
		this.subject = sub;
	}
	
	public String getMsg() {
		return message;
	}

	public void setMsg(String msg) {
		this.message = msg;
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + username + ", email=" + email + "subject="+subject+"message="+message+"]";
	}

}
