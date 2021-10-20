package SeleniumTestTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlogDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,30);
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.findElement(By.id("text1")).sendKeys("Anandh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));
        driver.findElement(By.id("text3")).sendKeys("Anandh");
	}

}
