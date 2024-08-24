package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27");
		Thread.sleep(3000);
		
		//DropDown Method
		WebElement dropdown = driver.findElement(By.id("input-sort"));
		Select value = new Select(dropdown);
		value.selectByIndex(5);
		

	}

}
