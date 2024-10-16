package resources;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import abstractComponents.ReusableMethods;

public class Listener implements ITestListener {

	ExtentReports extent=ExtentReporterNG.getReport();
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS,"Test case is successfully executed");
	}

	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable()); //to print error message
		String filePath=null;
		try 
		{
			 filePath=ReusableMethods.takeScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}
