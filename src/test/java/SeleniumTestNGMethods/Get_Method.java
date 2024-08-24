package SeleniumTestNGMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Get Method
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

}
