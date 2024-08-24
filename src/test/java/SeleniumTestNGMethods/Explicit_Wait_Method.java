package SeleniumTestNGMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Method {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//Explicit Method
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Click Method
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		driver.findElement(By.linkText("Register")).click();

	}

}
