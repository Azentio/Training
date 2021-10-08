import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		String browser="chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
						
		Thread.sleep(3000);
						
		
		driver.close();
		
	}

}