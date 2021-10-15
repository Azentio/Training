package selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//1st child window
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);
		
		/*String s=driver.findElement(By.id("para1")).getText();
		  System.out.println(s);*/
		
		//getWindowHandles() it will capture all the open windows ID and store in
		Set<String> windowids=driver.getWindowHandles();
		
		Iterator<String> itr = windowids.iterator();
		
		//Initializing variable of while loop 
		String paraTextOnPopupWindow = null;
		while(itr.hasNext())
		{   String windowid =itr.next();
			//switching one window to another
			driver.switchTo().window(windowid);
			Thread.sleep(5000);
			
			//in this if condition we are just checking whether child window is accessible
			if(driver.getTitle().equals("Basic Web Page Title"))
			{
				paraTextOnPopupWindow = driver.findElement(By.id("para1")).getText();		
				Thread.sleep(5000);
			}
		
				
		}
		 
		System.out.println(paraTextOnPopupWindow);
		//driver.quit();		
		
	}	

}


