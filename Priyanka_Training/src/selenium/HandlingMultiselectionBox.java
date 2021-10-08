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
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		WebElement multiSelectionField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionField);
		select.selectByVisibleText("Volve");
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);
		select.deselectByVisibleText("Audi");

	}

}
