package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_SentKeys_demo {

	public static void main(String[] args) throws InterruptedException {
		int i=0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
		Actions action=new Actions(drive);
		drive.manage().window().maximize();
		drive.get("https://www.flipkart.com/");
		//drive.findElement(By.xpath("//img[@title='Flipkart']")).click();
		WebElement cancel = drive.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(2000);
		action.click(cancel).perform();
		Thread.sleep(3000);
		WebElement key_action = drive.findElement(By.xpath("//input[@name='q']"));
		key_action.sendKeys("vivo");
		while(i<4)
		{
			key_action.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);    
			i++	;
		}
		key_action.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		drive.quit();
		
	}

}
