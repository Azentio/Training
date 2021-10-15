package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBY {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();

		WebElement searchBoxField = driver.findElement(By.name("q"));
				   searchBoxField.sendKeys("priyanka");
		
		Actions a = new Actions(driver);
		//doubleClick
		
		a.doubleClick(searchBoxField).perform();

	}

}
