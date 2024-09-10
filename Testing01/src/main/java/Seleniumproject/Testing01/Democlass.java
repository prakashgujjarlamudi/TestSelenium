package Seleniumproject.Testing01;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Democlass {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\prakash\\Downloads\\edgedriver_win64.exe");	
		WebDriver driver;
  driver=new EdgeDriver();
  driver.get("https://www.browserstack.com/guide/launch-edge-browser-in-selenium");
  driver.manage().window().maximize();

	}

}
