package SeleniumTestTraining;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(d,30);
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.findElement(By.className("dropbtn")).click();
		d.findElement(By.linkText("Facebook")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Facebook"))).click();
		//d.findElement(By.linkText("Facebook")).click();
		d.quit();
		

	}

}
