package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		//Navigation Back Method
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Navigate Forward Method
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//Refresh Method
		
		driver.navigate().refresh();

	}

}
