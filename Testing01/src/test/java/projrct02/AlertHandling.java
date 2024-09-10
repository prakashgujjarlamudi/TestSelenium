package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//click on the first click me operation
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Click on the "Click Me" button for the delayed alert
        Thread.sleep(2000);  // Short wait before clicking the button
        driver.findElement(By.id("timerAlertButton")).click();
        
        
        
       
	}

}
