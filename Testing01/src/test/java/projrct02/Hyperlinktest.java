package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinktest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click the link text
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.findElement(By.partialLinkText("en a")).click();
		
		driver.findElement(By.linkText("Create new account")).click();

	}

}
