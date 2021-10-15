package keysClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyChord {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
     WebElement textareaField = driver.findElement(By.id("ta1"));
		
		textareaField.sendKeys("ok");
		//Use Keys.chord for pressing multiple keys together
		textareaField.sendKeys(Keys.chord(Keys.CONTROL,"z"));

	}

}
