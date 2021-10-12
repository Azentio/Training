package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aanchal.bizoara\\git\\repository2\\AanchalBizoara_Training\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		
		driver.manage().window().maximize();
		String t=driver.getTitle();
		System.out.println("Title of the page is "+t);
		String url=driver.getCurrentUrl();
		
		
	}

}


