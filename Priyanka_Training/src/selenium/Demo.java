package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();   
		driver.findElement(By.id("but2")) ;
		/*WebElement element1 = driver.findElement(By.id("confirm"));
				   element1.click();*/
		
		/*WebElement element2 = driver.findElement(By.name("q"));
				   element2.sendKeys("hello hey");*/
		
		WebElement element3 = driver.findElement(By.id("textbox1"));
					Thread.sleep(5000);
		           element3.clear(); 
		           
		/*WebElement element4 = driver.findElement(By.linkText("compendiumdev"));
					Thread.sleep(5000);
					element4.click();*/
		
		/*WebElement element5 = driver.findElement(By.partialLinkText("compendium"));
				Thread.sleep(5000);
				element5.click();*/
		
		/*WebElement element6 = driver.findElement(By.cssSelector("classone"));
					Thread.sleep(5000);
					element6.sendKeys("hello hey");*/
		
		/*WebElement element6 = driver.findElement(By.cssSelector("#confrim"));
					Thread.sleep(5000);
					element6.click();*/
		
		/*WebElement element6 = driver.findElement(By.cssSelector("//input[@id='confirm']"));
					Thread.sleep(5000);
					element6.click();*/
	}

}
