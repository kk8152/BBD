package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExamplesTest {

	WebDriver wd;

	@Given("^user enter with open browser as \"([^\"]*)\"$")
	public void user_enter_with_open_browser_as(String Browser) throws Throwable {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@Then("^user enter with url as \"([^\"]*)\"$")
	public void user_enter_with_url_as(String url) throws Throwable {
		wd.get(url);
	}

	@And("^users enter with valides credentials as \"([^\"]*)\"$")
	public void users_enter_with_valides_credentials_as(String firstname) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys(firstname);
	}

	@When("^users enter  with valides lastname as \"([^\"]*)\"$")
	public void users_enter_with_valides_lastname_as(String lastname) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]"))
				.sendKeys(lastname);
	}

	@And("^user enter with emailid as \"([^\"]*)\"$")
	public void user_enter_with_emailid_as(String emailid) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/input[1]"))
				.sendKeys(emailid);
	}

	@Then("^user enter with mobileno as \"([^\"]*)\"$")
	public void user_enter_with_mobileno_as(String mobileno) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]"))
				.sendKeys(mobileno);
		Thread.sleep(1000);
		wd.close();
	}

}
