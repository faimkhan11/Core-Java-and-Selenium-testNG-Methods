package SeleniumTestNGMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Method {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Implicit Wait Method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.linkText("Register")).click();

	}

}
