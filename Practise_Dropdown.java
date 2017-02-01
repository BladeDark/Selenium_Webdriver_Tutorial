import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Web_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");

		// Dynamic Dropdown
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		//Select Dropdown value
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);
		//dropdown.selectByVisibleText("9 Adults");
		//dropdown.selectByValue("8");*/
		
		//Checkbox
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		
	}

}
