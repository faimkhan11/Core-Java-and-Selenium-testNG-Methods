package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_iFrame_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(3000);
		
		//Switch to iFrame Method
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame);
		
	    Thread.sleep(2000);
		driver.findElement(By.id("field2")).sendKeys("World");
		

	}

}
