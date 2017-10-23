package com.appium.maas.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class UserPassAuthenticator extends Authenticator{
	private String username;
	private String password;
	
	public UserPassAuthenticator(String userName, String password){
		this.username=userName;
		this.password =password;
		
	}
	
	 public PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication(username, password);
     }
}
