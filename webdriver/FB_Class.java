package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Class {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("MindQ");
		driver.findElement(By.name("lastname")).sendKeys("Systems");
		driver.findElement(By.name("reg_email__")).sendKeys("9985049983");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sand@#23");
		
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.partialLinkText("Fo")).click();
		

	}

}
