import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH {

	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arshath.3300\\git\\repository2\\Arshath_\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
	   Set<String> windowids = driver.getWindowHandles();
	    
	    Iterator<String> itr = windowids.iterator() ;
	    while(itr.hasNext()) {
	    	
	    	String windowid = itr.next();
	    	System.out.println(windowid);
	    	
	    }
	    
		Thread.sleep(2000);
		
		driver.quit();		
		
	}	

}