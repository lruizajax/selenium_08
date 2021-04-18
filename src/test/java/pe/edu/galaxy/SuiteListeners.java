package pe.edu.galaxy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SuiteListeners implements ITestListener {

	public void onStart(ITestContext context) {

		System.out.println("New Test Start: " + context.getName());

	}
	
	public void onTestStart(ITestResult result) {

		System.out.println("New Test Started: " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("New Test Success: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("New Test Failure: " + result.getName());

	}


	public void onTestSkipped(ITestResult result) {

		System.out.println("New Test Skipped: " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("New Test FailedButWithinSuccessPercentage: " + result.getName());

	}

	public void onTestFailedWithTimeout(ITestResult result) {

		System.out.println("New Test FailedWithTimeout: " + result.getName());

	}

	public void onFinish(ITestContext context) {

		System.out.println("New Test Finish: " + context.getName());

	}

}
