package vallidation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed_class {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.air.irctc.co.in/IndianRailways/");
		driver.manage().window().maximize();
		
		WebElement returndate=driver.findElement(By.xpath("//input[@name='returnDate']"));
		
		if (returndate.isDisplayed()) 
		{
			System.out.println("returndate is displayed");
			
		} else {
			System.out.println("Returndate is not displayed");

		}
		//Click on roundtrip
		driver.findElement(By.xpath("//input[@value='Round trip']")).click();
		if (returndate.isDisplayed()) 
		{
			System.out.println("Returndate is displayed");
			
		} else {
			System.out.println("Returndate is not displayed");

		}
//Oneway is selected
		
	}

}
