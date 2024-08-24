package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		
		//sendKeys Method
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Mohammed");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Faim");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("faim@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("1234567");

	}

}
