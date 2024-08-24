package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Displayed_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		
		//isDisplayed Method
		boolean status = driver.findElement(By.xpath("(//i[@class='fa fa-home'])[1]")).isDisplayed();
		System.out.println("Status of Home Icon is:"+ status);
		
		
		

	}

}
