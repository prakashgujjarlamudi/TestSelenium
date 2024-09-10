package projrct02;


		

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import java.time.Duration;

		public class DisplayMethod {

		    public static void main(String[] args) {
		        System.setProperty("webdriver.chrome.driver",
		                "C:\\Users\\prakash\\eclipse-workspace\\Testing01\\Drivers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        driver.manage().window().maximize();
		        
		        // Initialize WebDriverWait with a timeout of 10 seconds
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Try to login with invalid credentials - validate if it has moved to the next screen or not
		        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		        usernameField.sendKeys("Admin");
		        
		        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		        passwordField.sendKeys("prakash@@");
		        
		        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		        loginButton.click();
		        
		        // Define the XPath for the error message
		        String errormesgXpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p";
		        
		        // Wait for the error message to be visible
		        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errormesgXpath)));
		        
		        if (errorMessage.isDisplayed()) {
		            System.out.println("Given credentials are invalid");
		        } else {
		            System.out.println("Given credentials are valid");
		        }
		        
		        // Close the browser
		        driver.quit();
		    }
		
	
	}


