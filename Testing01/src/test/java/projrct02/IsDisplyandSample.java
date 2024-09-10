package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



;

public class IsDisplyandSample {

	public static void main(String[] args) throws InterruptedException {
		  
		        System.setProperty("webdriver.chrome.driver",
		                "C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        driver.manage().window().maximize();
		        Thread.sleep(10000);
		      WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		      
		      //check login button enable or not
		      
		    if(loginbutton.isEnabled()) {
		    	System.out.println("given locater is enable state");
		    	
		    }else {
		    	System.out.println("given locator is disable state");
		    }
		    
		    //try to login invalid/valid crediential -valid credental
		    //screem
		    //or nor
		    Thread.sleep(5000);
		    driver.findElement(By.name("username")).sendKeys("praaksh");
		    Thread.sleep(5000);
		    
		    //clear()-before typing any data in the edit box -user clear the data and new date
		    //driver.findElement(By.name("username")).clear();
		         //or
		    String dele = Keys.chord(Keys.CONTROL, "a")+Keys.DELETE;
		    driver.findElement(By.name("username")).sendKeys(dele);
		    
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    
		    loginbutton.click();
		     Thread.sleep(3000);
		    // Check if the dashboard is displayed
	        try {
	            WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
	            if (dashboard.isDisplayed()) {
	                System.out.println("Login is successful.");
	            } else {
	                System.out.println("Login is unsuccessful.");
	            }
	        } catch (Exception e) {
	            System.out.println("Login is unsuccessful. Dashboard element not found.");
	        }
	        
	        // Close the browser
	        driver.quit();
		    
		     
	}

}
