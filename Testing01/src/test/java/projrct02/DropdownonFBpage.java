package projrct02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownonFBpage {

    public static void main(String[] args) throws InterruptedException {
        // Use WebDriverManager to handle ChromeDriver versioning
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Click on create an account
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("prakash");
        driver.findElement(By.name("lastname")).sendKeys("gujjarlamudi");

        // Filling the dropdown list
        Select date = new Select(driver.findElement(By.name("birthday_day")));
        date.selectByVisibleText("20");

        new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Jul");
        new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1995");

        WebElement radioButton = driver.findElement(By.name("sex"));
        radioButton.click();
    }
}
