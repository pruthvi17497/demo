package com.pageLayer;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TastBase.SetupM;

public class Dashboard extends SetupM{
	

	public Dashboard() {
		PageFactory.initElements(w, this);
	}

	private By Go_Exchange =By.xpath("//a[@class='mb-4 mt-2 btn btn-dark']");

	public void click_on_Exchange() throws InterruptedException {
		Thread.sleep(3000);
		w.findElement(Go_Exchange).click();
		Thread.sleep(6000);
	}
	private By Username =By.xpath("//input[@name='email']");

	public void enter_username(String username) throws InterruptedException {
		Thread.sleep(3000);
		w.findElement(Username).sendKeys(username);
	}
	
	private By profile =By.xpath("//i [@class='font-size-14 fas fa-user-ninja']");
	
	public void user_profile() throws InterruptedException {
		Thread.sleep(3000);
		w.findElement(profile).click();
		Thread.sleep(6000);
	}
     private By on_profile =By.xpath("//a [@class='dropdown-item']");
	
	public void on_userprofile() throws InterruptedException {
		Thread.sleep(3000);
		w.findElement(on_profile).click();
		Thread.sleep(6000);
	}
	
private By  logo=By.xpath("//a [@class='dropdown-item']");
	
	public void on_logo() throws InterruptedException {
		Thread.sleep(3000);
		boolean Dis = w.findElement(logo).isDisplayed();
		Thread.sleep(6000);
		assertTrue(Dis);
		
	}
	 private By search  =By.xpath("//input[@class='form-control']");
		
		public void on_search(String com) throws InterruptedException {
			Thread.sleep(6000);
			w.findElement(search).sendKeys(com);
			Thread.sleep(6000);
		}
		
		 private By tata_moters  =By.xpath("(//div[@class='m-2 card-title']//a)[2]");
			
			public void on_tatamoters() throws InterruptedException {
				Thread.sleep(6000);
				w.findElement(tata_moters ).click();
				Thread.sleep(6000);
			}

}
