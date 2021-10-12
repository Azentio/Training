	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HA {

		public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arshath.3300\\\\git\\\\repository2\\\\Arshath_\\\\driver\\\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("alert1")).click();
			
			Alert alert = driver.switchTo().alert();
			
			String textdisplayOnAlert = alert.getText();
			System.out.println(textdisplayOnAlert);
			
			
			driver.quit();
			
			

		}

	}
