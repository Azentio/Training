import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class path {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arshath.3300\\\\git\\\\repository2\\\\Arshath_\\\\driver\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(null));
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
