package SeleniumTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Method_MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(3000);
		
		//Switch to iFrame Method
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame);
		
	    //Double Click Action Method
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
	}

}
