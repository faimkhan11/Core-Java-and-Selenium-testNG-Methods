package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_Up_and_Down_Method_KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		
			ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputText1")).sendKeys("Hello");
		
		//KeyUp and keyDown Method
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.id("inputText2")).click();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		

	}

}
