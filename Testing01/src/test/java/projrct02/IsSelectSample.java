package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//verify the webpage two check boxes are there
		// one check box is deafultly selected
		//second check box is not selected
		
		if(driver.findElement(By.id("checkbox1")).isSelected())
		{
			System.out.println("checkbox one is default selected");
		}else {
			System.out.println("checkbox one is not selected defaulty ");
		}
		
		System.out.println("*****************");
		
		if(driver.findElement(By.id("checkbox")).isSelected())
		{
			System.out.println("check box is select default");
			
		}else {
			System.out.println("check box is not select default");
		}
	}
}
