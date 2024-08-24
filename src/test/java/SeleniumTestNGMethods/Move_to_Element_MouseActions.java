package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_to_Element_MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(5000);
		
		//Move to Element
		
		WebElement veriable1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement veriable2 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act = new Actions(driver);
		act.moveToElement(veriable1).perform();
		Thread.sleep(3000);
		act.moveToElement(veriable2).click().perform();
	}

}
