package verification_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Verification {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Target Links
		WebElement lin=driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]"));
		//Target Textbox
		WebElement txt=driver.findElement(By.xpath("//input[@name='firstname']"));
		//Target Normal button
		WebElement but=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		//GetText
		String lintxt=lin.getText();
		System.out.println(lintxt);
		
		String txtname=txt.getText();
		System.out.println(txtname);
		
		String buttxt=but.getText();
		System.out.println(buttxt);
		
		//GetTagname
		String tag=lin.getTagName();
		System.out.println(tag);
		
		String tag1=txt.getTagName();
		System.out.println(tag1);
		
		String tag2=but.getTagName();
		System.out.println(tag2);
		
		//Getsize************
		Dimension sz=lin.getSize();
		System.out.println(sz);
		
		Dimension sz1=txt.getSize();
		System.out.println(sz1);
		
		Dimension sz2=but.getSize();
		System.out.println(sz2);
		
		//getLocation
	Point loc=lin.getLocation();
	System.out.println(loc);
	
	Point loc1=txt.getLocation();
	System.out.println(loc1);
	
	Point loc2=but.getLocation();
	System.out.println(loc2);
	
	//getAttribute
	String art=lin.getAttribute("href");
	System.out.println(art);
	
	String art1=txt.getAttribute("name");
	System.out.println(art1);
	driver.findElement(By.name(art1)).sendKeys("mindq");
	
	String art2=but.getAttribute("name");
	System.out.println(art2);
	driver.findElement(By.name(art2)).click();
	
	//getcss value
	String css=lin.getCssValue("font-size");
	System.out.println(css);
	
	String css1=txt.getCssValue("font-size");
	System.out.println(css1);
	
	String css2=but.getCssValue("font-size");
	System.out.println(css2);
	//Rectangle***********
	Rectangle rec=lin.getRect();
	System.out.println(rec.getX());
		
		

	}

}
