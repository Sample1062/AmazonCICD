package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.ReusableMethods;

public class HomePage extends ReusableMethods{
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//to give knowledge about driver--
		
	}
	
//	WebElement serachBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//	WebElement searchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	static WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	static WebElement searchBtn;
	
	public static void searchProduct(String product) {
		searchBox.sendKeys(product);
		searchBtn.click();
	}
	
	public static void goTo() {
		driver.get("https://www.amazon.in/");
	}
	

}
