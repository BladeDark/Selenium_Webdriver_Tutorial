package testngFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	public WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void Configuration() {
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void main() {

		driver.manage().window().maximize();
		driver.get("http://119.81.52.162/travpax_dev/travpax_dev/");
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
	}
	
	@AfterMethod
	
	public void afterMethod(){
		 driver.quit();
	}
	


}
