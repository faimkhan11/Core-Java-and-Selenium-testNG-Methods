package SeleniumTestNGMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Screen_Handling_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
		
		//Accept Method
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
				
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
		
		//Dismiss Method
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
		
		//Send Keys on the alert popup
		
		Thread.sleep(2000);
		Alert input = driver.switchTo().alert();
		input.sendKeys("Hello");
		Thread.sleep(2000);
		input.accept();
		
		
		
		
		
		

	}

}
