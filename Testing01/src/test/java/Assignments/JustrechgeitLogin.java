package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustrechgeitLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("jriTop_signin9")).click();
		
		//invalid field login
		
		driver.findElement(By.id("txtUserName")).sendKeys("8143655532");
		driver.findElement(By.id("txtPasswd")).sendKeys("Basha@8143");
		driver.findElement(By.id("txtCaptcha")).sendKeys("45");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.navigate().back();
	    
	    driver.navigate().refresh();
	    driver.navigate().forward();
		

	}

}
