package SeleniumTestTraining;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Menu_HandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		drive.get("http://demo.automationtesting.in/Frames.html");
		Actions a=new Actions(drive);
		WebElement menu = drive.findElement(By.xpath("//a[contains(text(),'Widgets')]"));
		a.click(menu).perform();
	    /*
		Menu Handling function 
		drive.findElement(By.linkText("Accordion")).click();
        
        */
		/*
		 * Drag element Example
		 * 
		WebElement drag = drive.findElement(By.xpath("//a[contains(text(), 'Slider') ]"));
		drag.click();
		WebElement drag_locate = drive.findElement(By.xpath("//div[@id='slider']"));
		Thread.sleep(3000);
		a.dragAndDropBy(drag_locate,80, 0).perform();
        */
        Thread.sleep(5000);
		drive.quit();

	}

}
