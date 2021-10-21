import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcucu {
	WebDriver driver;

	@Given("^Navigate the Website$")
	public void navigate_the_website() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

	}

	@Given("^Input any steps to first name and hidden textbox$")
	public void input_any_steps_to_first_name_and_hidden_textbox() throws InterruptedException {

		driver.findElement(By.id("text1")).sendKeys("Arshath");
		Thread.sleep(2000);
	}

	@And("^I have a boat in checkbox$")
	public void i_have_a_boat_in_checkbox() throws InterruptedException {

		driver.findElement(By.id("check3")).click();
		Thread.sleep(2000);
	}

	@And("^Select Female radio button$")
	public void select_female_radio_button() throws InterruptedException {

		driver.findElement(By.id("radio2")).click();
		Thread.sleep(2000);
	}

	@And("^Choose Audi from Select box$")
	public void choose_audi_from_select_box() throws InterruptedException {

		WebElement vehicle=driver.findElement(By.id("Carlist"));
		 Select choose=new Select(vehicle);
		 choose.selectByVisibleText("Audi");
		Thread.sleep(2000);
	}

	@And("^Handle alert by clicking show me alert button$")
	public void handle_alert_by_clicking_show_me_alert_button() throws InterruptedException {
		driver.findElement(By.cssSelector("input[value='Show Me Alert']")).click();
		Thread.sleep(2000);
		Alert popup = driver.switchTo().alert();
		popup.accept();
	}

	@Then("^Click on Open new page link and handle windows$")
	public void click_on_open_new_page_link_and_handle_windows() throws InterruptedException {
		 
		 driver.findElement(By.linkText("Open New Page")).click();
		 Thread.sleep(2000);
		 driver.close();
		 driver.quit();
	}

}
