import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://119.81.52.162/travpax_dev/travpax_dev/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("aadmin");
		driver.findElement(By.xpath("html/body/div[3]/form[1]/div[4]/button")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(".//*[@id='divInvalidModel']/span/span"), "Login Failed. Invalid email id or password."));
	}

}
