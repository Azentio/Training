package keysClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_sendkeyWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-email")).sendKeys("arun.motoori@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		//we can use sendkeys of webelement with keys class no need to use action class every time
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);

		//Actions a = new Actions(driver);
		//a.sendKeys(Keys.Enter).perform();
	}

}
