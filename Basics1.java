import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*For Firefox
		System.setProperty("webdriver.gecko.driver","D:\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		
		
		//driver.quit();
	
		

	}

}
