package abstractComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	
	static WebDriver driver;
	public ReusableMethods(WebDriver driver) {
		this.driver=driver;
	}

	public static void waitForElementToVisible(By locate) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locate));
	}
	

	
	public static String takeScreenshot(String testCaseName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+ testCaseName+".png");
		FileUtils.copyFile(src, file);
		return System.getProperty("user.dir")+"//reports//"+ testCaseName+".png";

	}

}
