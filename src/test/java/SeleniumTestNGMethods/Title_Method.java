package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Method {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		
		//Title Method
		
		String title = driver.getTitle();
		
		if(title.equals("Register Account"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}

	}

}
