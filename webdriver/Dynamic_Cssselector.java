package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Cssselector {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//BY Using CSS Selecter For Dynamic
		
		//Strting Charecter Change("^")
		
		driver.findElement(By.cssSelector("input[name^='firstname']")).sendKeys("MindQ");
		driver.findElement(By.cssSelector("input[aria-label^='Surname']")).sendKeys("Systems");
		
		//BY Using CSS Selecter For Dynamic
		
				//Ending Charecter Change("$")
		
		driver.findElement(By.cssSelector("input[name$='reg_email__']")).sendKeys("9985049983");
		
		//By Using Contines
		
		new Select(driver.findElement(By.cssSelector("Select[id*='day']"))).selectByIndex(2);
		new Select(driver.findElement(By.cssSelector("Select[id*='month']"))).selectByValue("5");
		new Select(driver.findElement(By.cssSelector("Select[id*='year']"))).selectByVisibleText("2015");
		
		
		// BY Using TagName
		
		driver.findElement(By.cssSelector("div#u_0_v>span>span>input")).click();
		
		driver.findElement(By.cssSelector("form#reg>div>div>button")).click();

	}

}
