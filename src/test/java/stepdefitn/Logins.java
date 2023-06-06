package stepdefitn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

     

public class Logins {
	static WebDriver driver;
	
	@Given("user should logged in website {string}")
	public void user_should_logged_in_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
	       driver = WebDriverManager.chromedriver().create();
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	       driver.manage().window().maximize();
	       driver.get(string);
	}
	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("login-button")).click();
	}
	@Then("user validate new webpage")
	public void user_validate_new_webpage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String actual = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", actual);
		      System.out.println("User Logged in.....");
		     Thread.sleep(2000);
	}}
