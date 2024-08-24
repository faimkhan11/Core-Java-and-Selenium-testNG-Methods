package SeleniumTestNGMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_Current_Url_Method {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//getCurrent Url
		
		System.out.println(driver.getCurrentUrl());

	}

}
