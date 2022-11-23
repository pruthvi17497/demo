package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TastBase.SetupM;

public class Profile extends SetupM{

	public Profile() {
		PageFactory.initElements(w, this);
	}

	

	public String profile_id() throws InterruptedException {
		Thread.sleep(3000);
		String profile = w.findElement(By.xpath("//div [@class='text-muted']")).getText();
		return profile;
	}
}
