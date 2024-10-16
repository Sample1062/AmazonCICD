package testCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import abstractComponents.ReusableMethods;
import pageObjects.HomePage;


public class TC01_SearchProduct{

	@Test
	public static void search() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreya Dhamane\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		String testData="Pen";
		HomePage home=new HomePage(driver);
		home.goTo();
		home.searchProduct(testData);
		ReusableMethods.takeScreenshot("TC01_SearchProduct");
		
			
	
	}

}
