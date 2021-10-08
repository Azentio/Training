import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException
	{	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("chrome")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}