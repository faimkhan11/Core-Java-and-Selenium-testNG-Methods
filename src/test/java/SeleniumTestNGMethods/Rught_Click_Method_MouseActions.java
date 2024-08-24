package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rught_Click_Method_MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		//Right Click Method
		
		WebElement click = driver.findElement(By.linkText("Continue"));
		
		Actions act = new Actions(driver);
		act.contextClick(click).perform();
		

	}

}
