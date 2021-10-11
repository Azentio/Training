package SeleniumTestTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// //div[@id='LinkList1']/div/ul/li/a[1]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://omayo.blogspot.com/");
		WebElement dropdown=d.findElement(By.id("drop1"));
		Select select=new Select(dropdown);
		Thread.sleep(2000);
		select.selectByVisibleText("doc 1");
		Thread.sleep(3000);
		d.quit();

	}

}