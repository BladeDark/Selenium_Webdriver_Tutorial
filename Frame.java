import java.util.concurrent.TimeUnit;

import org.apache.http.annotation.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://119.81.52.162/travpax_dev/travpax_dev/");	
		
		//WebdriverWait
	
		
		
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("html/body/div[3]/form[1]/div[4]/button")).click();
	
		
		WaitAndClickByXpath(wait,driver,".//*[@id='mainbody']/div[3]/div[1]/div/ul/li[4]/a/span[1]");
		WaitAndClickByXpath(wait,driver,".//*[@id='mainbody']/div[3]/div[1]/div/ul/li[4]/ul/li[5]/a/span");
		WaitAndClickByID(wait,driver,"sample_editable_1_new");

	
		Thread.sleep(5000);
		//select frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='Rich Text Editor, Desc-en_US']")));
		driver.findElement(By.tagName("body")).sendKeys("1234");
		
		//unselect frame
		driver.switchTo().defaultContent();
		
	}

	public static void WaitAndClickByXpath(WebDriverWait wait, WebDriver driver, String element) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
		driver.findElement(By.xpath(element)).click();
	}
	
	public static void WaitAndClickByID(WebDriverWait wait, WebDriver driver, String element) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
		driver.findElement(By.id(element)).click();
	}

}
