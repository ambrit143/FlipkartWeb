package com.flipkart.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementationClass implements ITestListener {
	@Override //@AfterMethod
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"Success");
	}

	@Override //@AfterMethod
	public void onTestFailure(ITestResult result) {
		DriverClass.getWebDriverUtility().takeScreenshot(result.getMethod().getMethodName(),DriverClass.getJavaUtility(),DriverClass.getDriver());
		Reporter.log(result.getMethod().getMethodName()+"Fail");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	}


