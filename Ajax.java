import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ajax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Web_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("http://www.amazon.in/");
		
		Actions abc = new Actions(driver);
		WebElement element = driver.findElement(By.id("nav-link-yourAccount"));
		abc.moveToElement(element).build().perform();
		WebElement xyz = driver.findElement(By.id("twotabsearchtextbox"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("smalltterrs").build().perform();
		// Right Click
		abc.contextClick(xyz).build().perform();
	}

}
