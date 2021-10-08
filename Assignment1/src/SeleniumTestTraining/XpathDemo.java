package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// //div[@id='LinkList1']/div/ul/li/a[1]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.findElement(By.xpath("//div[@id='LinkList1']/div/ul/li/a[contains(text(),'compendiumdev')]")).click();
		Thread.sleep(3000);
		d.quit();

	}

}
