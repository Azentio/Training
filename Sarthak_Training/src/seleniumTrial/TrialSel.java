package seleniumTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialSel {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarthak.gaidhani\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title+": is the title of the page");
		
		driver.findElement(By.id("textbox1")).clear();
		driver.findElement(By.id("textbox1")).sendKeys("Automation with SELENIUM");
		
		String attr = driver.findElement(By.id("rotb")).getAttribute("value");
		System.out.println("this is the text: "+attr);
		
		boolean display = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(display);
		
		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println("Height is: "+d.height);
		System.out.println("Width is:"+d.width);
		
		boolean display1 = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println("Is hidden button displayed?: "+display1);
		
		boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("Is checkbox selected?: "+selected);
		
		driver.navigate().to("http://testwisely.com/demo");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}