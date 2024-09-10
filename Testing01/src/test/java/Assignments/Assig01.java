package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assig01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		
		//fill the first six edit boxes
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("prakash");
		driver.findElement(By.id("lastName")).sendKeys("gujjarlamudi");
		driver.findElement(By.name("emailAddress")).sendKeys("prakash.gujjarlamudi@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("8143655532");
		driver.findElement(By.id("password")).sendKeys("gujjarlamudi@@");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("gujjarlamudi@@");
		
		//click on the three check boxes
		
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		
		// click submit button
		
		driver.findElement(By.id("submit")).click();
		
	
	
		
		
		

	}

}
