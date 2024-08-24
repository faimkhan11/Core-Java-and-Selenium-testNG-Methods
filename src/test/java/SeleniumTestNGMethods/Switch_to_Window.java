package SeleniumTestNGMethods;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Window {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		//Switch to Window Method
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

	}

}
