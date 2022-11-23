package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TastBase.SetupM;

public class exchanges extends SetupM{
	public exchanges () {
		PageFactory.initElements(w, this);
	}

	

	public void nSE_Simulator_table() throws InterruptedException {
		Thread.sleep(3000);
		int a;
		for(a=1;a<=7;a++) {
		String b = w.findElement(By.xpath("//div[@class='react-bootstrap-table']//tr/th["+a+"]")).getText();
		System.out.print(b);
		}
	}
}
