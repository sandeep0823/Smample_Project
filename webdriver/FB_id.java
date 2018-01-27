package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_id {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("sandeepreddy122@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9703834482");
		
		driver.findElement(By.id("loginbutton")).click();

	}

}
