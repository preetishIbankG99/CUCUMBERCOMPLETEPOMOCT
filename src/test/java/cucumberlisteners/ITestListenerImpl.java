package cucumberlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImpl implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASSED");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIPPED");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started on UAT Environment");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Completed on UAT Environment");
		
	}

}
