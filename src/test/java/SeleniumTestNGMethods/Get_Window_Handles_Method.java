package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Get_Window_Handles_Method {

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);

		//Open Element in New Window with the help of Keyboard Actions
		
		WebElement path = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(path).perform();
		
		//Get Window Handles Method
		
		System.out.println("IDs of the Windows are:"+" "+driver.getWindowHandles());
	}

}
