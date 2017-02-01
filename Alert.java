import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Web_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath(""));
		driver.switchTo().alert().accept();  // Accept = ok done yes
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().getText();
		//driver.switchTo().alert().sendKeys("something");
	}

}
