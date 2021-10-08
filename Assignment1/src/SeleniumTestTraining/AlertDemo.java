package SeleniumTestTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
		drive.get("http://omayo.blogspot.com/");
		drive.manage().window().maximize();
		drive.findElement(By.id("")).click();
		Alert a= drive.switchTo().alert();
	    String s=a.getText();
	    a.accept();
		System.out.println(s);
		drive.quit();
		
		
		// TODO Auto-generated method stub

	}

}
