package stepdefitn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	static WebDriver driver;
	
	@Given("User navigates to Url {string}")
	public void user_navigates_to_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		   driver = WebDriverManager.chromedriver().create();
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	       driver.manage().window().maximize();
	       driver.get(url);
	}

	@When("User click on element")
	public void user_click_on_element() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Phones & PDAs")).click();
	}

	@Then("User validate new page opens")
	public void user_validate_new_page_opens() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String acl = driver.getCurrentUrl();
		Assert.assertEquals("https://tutorialsninja.com/demo/index.php?route=product/category&path=24", acl);
		      System.out.println("User Logged in.....");
		     Thread.sleep(2000);
	}	
}
