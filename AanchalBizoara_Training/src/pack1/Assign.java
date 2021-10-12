package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign 
{

		public static void main(String[] args)
		
		 {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\aanchal.bizoara\\\\git\\\\repository2\\\\AanchalBizoara_Training\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://omayo.blogspot.com/");	
		driver.manage().window().maximize();
			
		String title = driver.getTitle();
		System.out.println(title+": is the title of the page");
			
		driver.findElement(By.id("textbox1")).clear();
		driver.findElement(By.id("textbox1")).sendKeys("Robot");
			
		String attribute = driver.findElement(By.id("rotb")).getAttribute("value");
		System.out.println("Text: "+attribute);
	
		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println("Height: "+d.height);
		System.out.println("Width: "+d.width);
		
		
		boolean display = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(display);
					
		boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("Checkbox selected: "+selected);
			
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		}
	


}
