import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For Firefox System.setProperty("webdriver.gecko.driver",
		 * "D:\\Webdriver\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Web_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("http://www.qaclickacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath(".//*[@id='newsletter']/div[2]/div[3]/a")).click();
		
		driver.findElement(By.id("user_name")).sendKeys("Narongsak Sakulchaikaew");
		driver.findElement(By.name("user[email]")).sendKeys("123456");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
		driver.findElement(By.id("user_agreed_to_terms")).click();
		// driver.quit();

	}

}
