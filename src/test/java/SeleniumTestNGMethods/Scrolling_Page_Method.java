package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Page_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=20");
		Thread.sleep(3000);
		
		
		//Scrolling Page Method
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//a[normalize-space()='About Us']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();

	}

}
