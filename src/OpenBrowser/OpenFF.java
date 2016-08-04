package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFF {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		driver.findElement(By.linkText("Selenium Tutorial in Java")).click();
		
		driver.quit();
		
		
	}

}
