
package com.utilities;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;



import TastBase.SetupM;

public class UtilClass extends SetupM {
	
	public UtilClass()
	{
		PageFactory.initElements(w, this);
	}
	
	static String path = "C:\\Users\\VAIBHAV\\eclipse-workspace\\dalalstreet\\Screenshots\\"; 
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)w;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}	
	}
}
