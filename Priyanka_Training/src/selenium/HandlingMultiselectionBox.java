package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectionBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	

		WebElement multiSelectionField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionField);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		Thread.sleep(5000);
		select.deselectByVisibleText("Audi");

	}

}
