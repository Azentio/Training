package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://omayo.blogspot.com/");
		drive.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(drive, 30);
		drive.findElement(By.xpath("//button[@class='dropbtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		drive.findElement(By.xpath("//a[(text()='Facebook')]")).click();
		drive.quit();
	}

}
