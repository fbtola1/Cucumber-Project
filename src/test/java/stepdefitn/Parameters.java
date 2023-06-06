package stepdefitn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	static WebDriver driver;
	
	@Given("I have opened site   {string}")
	public void i_have_opened_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
		   driver = WebDriverManager.chromedriver().create();
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	       driver.manage().window().maximize();
	       driver.get(string);
	}
	@When("^I  enter (.*)$")
	public void i_enter_standard_user1(String urnm) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("user-name")).sendKeys(urnm);
	}
	@When("^I enter (.*)$")
	public void i_enter_secret_sauce1(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("I click the login button")
	public void i_click_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Then("I validate new url is launched")
	public void i_validate_new_url_is_launched() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String orignal = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", orignal);
		      System.out.println("User Logged in.....");
		     Thread.sleep(2000);
	}	
}
