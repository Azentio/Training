import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowDemo {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	
	d.manage().window().maximize();
	d.findElement(By.linkText("Open a popup window")).click();
	d.findElement(By.linkText("Blogger")).click();
	Thread.sleep(3000);
	Set<String> win_id =d.getWindowHandles();
	Iterator<String> s=win_id.iterator();
		//String parent_win=s.next();
		//String child_win=s.next();
		//String child_win2=s.next();
		
		/*for(String j:win_id)
	            {
	            	System.out.println(j);
	            	d.switchTo().window(j);
	            }*/
		while(s.hasNext())
		{
			String window_id=s.next();
			d.switchTo().window(window_id);
			if(d.getTitle().equals("Basic Web Page Title"))
			{
				String k=d.findElement(By.id("para1")).getText();
				System.out.println("The string is: "+k);
	
			}
		}
		
	//String k=d.findElement(By.id("para1")).getText();
	//System.out.println("The string is: "+k);
	d.quit();
}
}
	