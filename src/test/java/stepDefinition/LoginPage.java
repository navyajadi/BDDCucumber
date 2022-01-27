package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;

	@Given("Launch the Browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("Enter URL")
	public void enter_url() {
		driver.get("http://localhost:8888");
	}

	@Then("Enter Username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("Enter Password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("123456");
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}
	
	@When("Enter URL {string}")
	public void enter_url(String URL) {
	    driver.get(URL);
	}

	@Then("Enter Username {string}")
	public void enter_username(String UN) {
		driver.findElement(By.name("user_name")).sendKeys(UN);
	    	}

	@Then("Enter Password {string}")
	public void enter_password(String PWD) {
		driver.findElement(By.name("user_password")).sendKeys(PWD);
	}

}
