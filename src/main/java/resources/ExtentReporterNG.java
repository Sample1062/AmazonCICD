package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	public static ExtentReports getReport() {
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Automation Report");
		report.config().setDocumentTitle("Test Case Report");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		//extent.setSystemInfo(path, path);
		return extent;
		
		
	}

}
