package com.Practice.FailureScreenShots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		captureScreenshot(result.getTestContext().getName()+"  "+result.getMethod().getMethodName()+".jpg");
		//captureScreenshot(result.getMethod().getMethodName());
	}
	
	

}
