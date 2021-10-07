import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {
	
	public static void main(String[] args) throws InterruptedException {


	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\chromedriver.exe");// depending on browser we have to change the path
		WebDriver d=new ChromeDriver();//depending on browser we have to chage the child class
		        d.get("http://omayo.blogspot.com/");
		        Thread.sleep(2000);
		        d.manage().window().maximize();
		        d.close();
		}
}


{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\geckodriver.exe");// depending on browser we have to change the path
	WebDriver d=new geckoDriver();//depending on browser we have to chage the child class
	        d.get("http://drive.blogspot.com/");
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        d.manage().window().maximize();
	        d.close();
	}
{
	System.setProperty("webdriver.IEDriver.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\IEDriverServer.exe");// depending on browser we have to change the path
	WebDriver d=new geckoDriver();//depending on browser we have to chage the child class
	        d.get("http://IEDriver.blogspot.com/");
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        d.manage().window().maximize();
	        d.close();
	}

{
	System.setProperty("webdriver.msgdgedriver.driver", "C:\\Users\\sobana.2352\\git\\repository\\JavaDemoProject\\drive\\msedgedriver.exe");// depending on browser we have to change the path
	WebDriver d=new geckoDriver();//depending on browser we have to chage the child class
	        d.get("http://msgdgedriver.blogspot.com/");
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        d.manage().window().maximize();
	        d.close();
	}
}
