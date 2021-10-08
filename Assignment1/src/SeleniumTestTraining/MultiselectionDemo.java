package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
        drive.get("http://omayo.blogspot.com/");
        WebElement element = drive.findElement(By.id("multiselect1"));
        
        //WebElement element = drive.findElement(By.id("drop1"));
       Select s=new Select(element);
       
       //select drop down text
       //s.selectByVisibleText("doc 1");
	   //select multi slelection box
       Thread.sleep(3000);
       s.selectByVisibleText("Volvo");
	   s.selectByVisibleText("Swift");
	   s.selectByVisibleText("Audi");
	   drive.quit();
	}

}
