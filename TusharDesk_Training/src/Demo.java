import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//ChromeDriver is a predefined class of selenium WebDriver library
		//Create an object for ChromeDriver class
		//WebDriver is interface in selenium
		//ChromeDriver() is constructer

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushar.maheshkar\\eclipse-workspace\\TusharDesk_Training\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		
		

	}

}
