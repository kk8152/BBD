package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParametrationTest {
	WebDriver wd;

	@Given("^user open browser as \"(.*?)\"$")
	public void user_open_browser_as(String Chromdriver) throws Throwable {
	    wd = new ChromeDriver();
	    wd.manage().window().maximize();
	}

	@Then("^user enter the url as \"(.*?)\"$")
	public void user_enter_the_url_as(String url) throws Throwable {
	    wd.get(url);
	}

	@Then("^users enter the valide credentials as \"(.*?)\"$")
	public void users_enter_the_valide_credentials_as(String firstname) throws Throwable {
	    wd.findElement(By.xpath("//*[@id='inputFirstName']")).sendKeys(firstname);
	}

	@When("^users enter the valide lastname as \"(.*?)\"$")
	public void users_enter_the_valide_lastname_as(String lastname) throws Throwable {
	    wd.findElement(By.xpath("//*[@id='inputLastName']")).sendKeys(lastname);
	}
	@When("^enter emailid as \"(.*?)\"$")
	public void enter_emailid_as(String emailid) throws Throwable {
	    wd.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys(emailid);
	}

	@Then("^user enter mobileno as \"(.*?)\"$")
	public void user_enter_mobileno_as(String mobileno) throws Throwable {
	    wd.findElement(By.xpath("//*[@id='inputPhone']")).sendKeys(mobileno);
	}
}