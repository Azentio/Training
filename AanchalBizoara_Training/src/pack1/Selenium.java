package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium

{
	public static void main(String[] args)
	
	{
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aanchal.bizoara\\eclipse-workspace\\Day11\\Driver\\chromedriver.exe");
	
	
	driver.get("https://omayo.blogspot.com");
	driver.manage().window().maximize();

	WebElement userid = driver.findElement(By.name("userid"));
	userid.sendKeys("qwerty");
	Actions a = new Actions(driver);
	a.sendKeys(Keys.TAB).perform();

	WebElement password = driver.findElement(By.name("pswrd"));
	password.sendKeys("poiuy");
	a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	driver.quit();
	
	}

	/*
	sendKeys(): https://omayo.blogspot.com
	WebElement userid = driver.findElement(By.name("userid"));
	userid.sendKeys("qwerty");
	Actions a = new Actions(driver);
	a.sendKeys(Keys.TAB).perform();
	WebElement password = driver.findElement(By.name("pswrd"));
	password.sendKeys("poiuy");
	a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	keyUp & keyDown: https://omayo.blogspot.com
	WebElement jquery = driver.findElement(By.linkText("jqueryui"));
	Actions a = new Actions(driver);
	a.keyDown(Keys.CONTROL).click(jquery).keyUp(Keys.CONTROL).build().perform();
	dragAndDrop(): http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
	WebElement washington = driver.findElement(By.id("box3"));
	WebElement UnitedStates = driver.findElement(By.id("box103"));
	Actions a = new Actions(driver);
	a.dragAndDrop(washington, UnitedStates).perform();
	dragAndDropBy(): https://omayo.blogspot.com/p/page3.html
	WebElement minSlide =
	driver.findElement(By.xpath("//a[@aria-labelledby=\"price-min-label\"]"));
	Actions a = new Actions(driver);
	a.dragAndDropBy(minSlide, 100, 0).perform();
	a.dragAndDropBy(minSlide,-200, 0).perform();
	moveToElement(), click(), perform(), build(): https://omayo.blogspot.com/
	WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
	WebElement selenium143 = driver.findElement(By.xpath("//a/span[text()=\"Selenium143\"]"));
	Actions a = new Actions(driver);
	a.moveToElement(blogsmenu).perform();
	a.moveToElement(selenium143).click(selenium143).build().perform();
	Lighthouse: https://omayo.blogspot.com/p/
	driver.findElement(By.id("lightbox1")).click();
	driver.findElement(By.xpath("//span[@class=\"close cursor\"]")).click();
	Frames: https://omayo.blogspot.com/
	WebElement iframe1 = driver.findElement(By.id("iframe1"));
	driver.switchTo().frame(iframe1);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("ta1")).sendKeys("Automation");
	System.out.println(driver.findElements(By.tagName("iframe")).size());*/
}


