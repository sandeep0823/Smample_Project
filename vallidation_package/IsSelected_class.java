package vallidation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected_class {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.air.irctc.co.in/IndianRailways/");
		driver.manage().window().maximize();
		//Iselected
		WebElement  oneway=driver.findElement(By.xpath("//input[@checked='checked']"));
		
		if (oneway.isSelected()) 
		{
			System.out.println("oneway is selected");
			
		} else {
			System.out.println("oneway is notselected");

		}
		//Round trip is class
		driver.findElement(By.xpath("//input[@value='Round trip']")).click();
		if (oneway.isSelected()) 
		{
			System.out.println("oneway is selected");
			
		} else {
			System.out.println("oneway is not selected");

		}

	}

}
