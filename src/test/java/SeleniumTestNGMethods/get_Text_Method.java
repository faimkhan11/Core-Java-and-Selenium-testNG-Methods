package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Text_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		
		//getText Method
		
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Register Account']")).getText();
		
		System.out.println(text);

	}

}
