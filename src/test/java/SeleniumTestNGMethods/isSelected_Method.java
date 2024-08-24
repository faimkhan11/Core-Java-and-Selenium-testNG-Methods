package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		Thread.sleep(3000);
		
		//isSelected Method
		
		boolean status = driver.findElement(By.id("product_550")).isSelected();
		System.out.println(status);

	}

}
