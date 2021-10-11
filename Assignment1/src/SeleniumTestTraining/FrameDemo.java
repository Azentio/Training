package SeleniumTestTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.automationtesting.in/Frames.html");
		drive.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(drive,30);
		drive.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		WebElement frame = drive.findElement(By.id("singleframe"));
		drive.switchTo().frame(frame);
		drive.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Anandh_018");
		drive.close();

	}

}
