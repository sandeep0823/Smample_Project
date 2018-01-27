package verification_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageverification_Class {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//getCurrenturl
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		
		String exp_url="https://www.facebook.com/";
		
		if (act_url.equals(exp_url)) 
		{
			System.out.println("URL is Present");
			
		} else {
			System.out.println("URL is not Present");

		}
		
		//GetTitle
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		String exp_title="Facebook – log in or sign up";
		
		if (act_title.equals(exp_title)) 
		{
			System.out.println("Title is Present");
			
		} else {
			System.out.println("Title is not present");

		}

		//GetPageSource
		String act_pagesource=driver.getPageSource();
		
		String exp_pagesource="F";
		
		if (act_pagesource.contains(exp_pagesource)) 
		{
			System.out.println("Pagesource is present");
			
		} else {
            System.out.println("pagesource is not present");
		}
	}

}
