package com.pageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import TastBase.SetupM;

public class Loginpage extends SetupM {
	
	
	public Loginpage() {
		PageFactory.initElements(w, this);
	}


	private By Username =By.xpath("//input[@name='email']");

	public void enter_username(String username) throws InterruptedException {
		
		w.findElement(Username).sendKeys(username);
	}
	private By pwd_txt =By.xpath("//input[@name='password']");

	public void enter_password(String pwd) throws InterruptedException {
		
		w.findElement( pwd_txt ).sendKeys(pwd);
	}
	private By Login_btn =By.xpath("//button[text()='Log In']");

	public void Login_btn() throws InterruptedException {
		Thread.sleep(3000);
		w.findElement(Login_btn).click();
	}


}
