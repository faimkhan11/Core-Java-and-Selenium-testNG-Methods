package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		Thread.sleep(3000);
		
		//isEnable Method
		
		boolean status = driver.findElement(By.id("travname")).isEnabled();
		System.out.println(status);

	}

}
