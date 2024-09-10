package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class HrmLogin01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(5000);
		//creat a fb account
		
		driver.findElement(By.id("email")).sendKeys("prakash.gujjarlamudi");
		
		// enter user name and password
	//	driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
		//driver.findElement(By.name("email")).sendKeys("8143655532");

		//driver.findElement(By.name("pass")).sendKeys("Basha@8143");

		// click login
		
	//	driver.findElement(By.name("login")).click();

		
	}
}