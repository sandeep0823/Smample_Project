package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.phptravels.net/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
		//driver.manage().wait(2);
		
		//driver.manage().wait();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.cssSelector("a[href='#ACCOUNTS']")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Customers")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.name("fname")).sendKeys("sandeep");
		driver.findElement(By.name("lname")).sendKeys("reddy");
		driver.findElement(By.name("email")).sendKeys("mindqsystem@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test1234");
		
		driver.findElement(By.name("mobile")).sendKeys("9493234836");
		
		driver.findElement(By.linkText("Please Select")).click();
		//driver.findElement(By.className("select2-input")).sendKeys("India");
		
		//new Select(driver.findElement(By.))
		driver.findElement(By.name("address1")).sendKeys("hyd");
		driver.findElement(By.name("address2")).sendKeys("ameerpate");
		new Select(driver.findElement(By.name("status"))).selectByValue("no");
		
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		
		
		
		
		
	}

}
