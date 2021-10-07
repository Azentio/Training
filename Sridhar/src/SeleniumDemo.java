import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar.2010\\git\\repository\\Sridhar\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
        d.get("http://omayo.blogspot.com/");
        Thread.sleep(2000);
        d.manage().window().maximize();
        d.close();
	}

}
