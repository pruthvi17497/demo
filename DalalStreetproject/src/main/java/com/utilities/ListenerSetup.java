package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test execution started");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test execution completed");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test execution failed");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test execution skipped");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
		
	}

	
	public void onFinish(ITestContext context) {
		
	}

}
