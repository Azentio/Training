package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		WebElement osloBox = driver.findElement(By.id("box1"));
		
		WebElement norWayBox = driver.findElement(By.id("box101"));
		
		Actions actions = new Actions(driver);
		Thread.sleep(3000);

		actions.dragAndDrop(osloBox,norWayBox).perform();
	}

}
