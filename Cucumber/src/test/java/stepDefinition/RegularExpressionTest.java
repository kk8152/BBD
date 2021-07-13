package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegularExpressionTest {
   WebDriver wd;
   
	
	@Given("^user was enter the browser \"(.*?)\"$")
	public void user_was_enter_the_browser(String arg1) throws Throwable {
	   wd = new ChromeDriver();
	   wd.manage().window().maximize();
	}

	@Given("^user was enter the url \"(.*?)\"$")
	public void user_was_enter_the_url(String url) throws Throwable {
	   wd.get(url);
	}

	@When("^user was enter the companyname \"(.*?)\"$")
	public void user_was_enter_the_companyname(String companyname) throws Throwable {
	   wd.findElement(By.id("inputCompanyName")).sendKeys(companyname);
	}

	@When("^user was enter the postcode \"(.*?)\"$")
	public void user_was_enter_the_pincode(String postcode) throws Throwable {
	   wd.findElement(By.id("inputPostcode")).sendKeys(postcode);
	}

	@When("^user was enter the streetaddress \"(.*?)\"$")
	public void user_was_enter_the_address(String streetaddress) throws Throwable {
	    wd.findElement(By.id("inputAddress1")).sendKeys(streetaddress);
	}
}