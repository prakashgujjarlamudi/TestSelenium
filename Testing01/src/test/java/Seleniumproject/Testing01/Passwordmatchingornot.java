package Seleniumproject.Testing01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Passwordmatchingornot {

	public static void main(String[] args) throws InterruptedException {
		
		  // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\prakash\\\\eclipse-workspace\\\\Testing01\\\\Drivers\\\\chromedriver.exe");

        // Initialize the ChromeDriver
         WebDriver driver = new ChromeDriver();

        try {
            // Open the webpage
        	Thread.sleep(5000);
            driver.get("https://collegeweeklive.com/go-signup/");

            // Locate the password and confirm password input fields
            WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]")); // Update the locator as needed
            WebElement confirmPasswordField = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")); // Update the locator as needed

            // Enter passwords
            String password = "yourPassword123";
            String confirmPassword = "yourPassword126";

            passwordField.sendKeys(password);
            confirmPasswordField.sendKeys(confirmPassword);

            // Retrieve the entered values
            String enteredPassword = passwordField.getAttribute("value");
            String enteredConfirmPassword = confirmPasswordField.getAttribute("value");

            // Check if the passwords match
            if (enteredPassword.equals(enteredConfirmPassword)) {
                System.out.println("Passwords match.");
            } else {
                System.out.println("Passwords do not match.");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
	}

}
