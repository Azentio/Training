package SeleniumTestTraining;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		String browser="chrome";
		WebDriver d=null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
			d=new ChromeDriver();
			//Thread.sleep(3000);
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\geckodriver.exe");
		d=new FirefoxDriver();  
		//Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\IEDriverServer.exe");
		d=new InternetExplorerDriver();  
		//Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver","C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\msedgedriver.exe");
		d=new EdgeDriver();  
		//Thread.sleep(3000);
		}
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		//Thread.sleep(2000);
		String t=d.getTitle();
		System.out.println("Web site's title is : "+t);
		String url=d.getCurrentUrl();
		System.out.println("Web site's curet URL is :"+url);
		//d.navigate().to("https://www.selenium.dev/");
		//d.navigate().back();
		//d.navigate().refresh();
	/*	
		List<WebElement> e=d.findElements(By.tagName("a"));
		
		
		for(WebElement j:e)
		{
			if((j.getText().length())>0)
			System.out.println(j.getText());
		}
		
		d.findElement(By.linkText("Open a popup window")).click();
		/*
		 //normal for loop
		 for(int i=0;i<e.size();i++)
		{
			if((e.get(i).getText()).length()>0)
			{
			System.out.println(e.get(i).getText());
			}	
			}*/
		//example of By.name
		//d.findElement(By.name("samename")).click();
		//sentKeys() example
		//ta1
		//d.findElement(By.id("ta1")).sendKeys("Anandh");
		//Example of isSelected() method
		/*boolean b=d.findElement(By.id("checkbox1")).isSelected();
		if(b==true)
		{
			System.out.println("check box selected");
		}
		else
		{
			System.out.println("check box not selected");
		}
		Thread.sleep(1000);
		boolean c=d.findElement(By.id("checkbox2")).isSelected();
		if(b==true)
		{
			System.out.println("check box selected");
		}
		else
		{
			System.out.println("check box not selected");
		}
		*/
		// Example program for isDisplayed() function
		/*
		boolean b=d.findElement(By.id("but1")).isDisplayed();
		if(b==true)
		{
			System.out.println("button displayed");
		}
		else
		{
			System.out.println("button not displayed");
		}
		*/
		// Example program for isEnabled() function
		/*boolean b=d.findElement(By.id("but1")).isEnabled();
		if(b==false)
		{
			System.out.println("button disabled");
		}
		else
		{
			System.out.println("button enabled");
		}*/
		
		
		
		Thread.sleep(3000);
		//d.close();
		d.quit();
	}

}
