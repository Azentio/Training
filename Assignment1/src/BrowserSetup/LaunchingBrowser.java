package BrowserSetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {
	public Properties p;
	public  WebDriver setBrowser() throws IOException
	{
		WebDriver drive = null;
		p=new Properties();
		String path= System.getProperty("user.dir")+"\\src\\BrowserSetup\\dataCenter.properties";
		FileInputStream fis=new FileInputStream(path);
		
		p.load(fis);
		String browser=p.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			drive=new ChromeDriver();
		}
		drive.manage().window().maximize();
		return drive;
	}

}
