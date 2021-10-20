package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHadlingDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://demo.guru99.com/test/");
		driver.manage().window().maximize();
		//input[@name='bdaytime']
		driver.findElement(By.xpath("input[@name='bdaytime']")).click();
		driver.quit();

	}

}
