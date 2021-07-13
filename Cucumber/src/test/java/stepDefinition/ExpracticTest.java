package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpracticTest {

	WebDriver wd;

	@Given("^user open her there Browser as us \"([^\"]*)\"$")
	public void user_open_her_there_Browser_as_us(String Browser) throws Throwable {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@When("^user enter her the url as us \"([^\"]*)\"$")
	public void user_enter_her_the_url_as_us(String url) throws Throwable {
		wd.get(url);
	}

	@When("^user enter her firstname as us \"([^\"]*)\"$")
	public void user_enter_her_firstname_as_us(String firstname) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys(firstname);
	}

	@When("^user enter the lastname as us \"([^\"]*)\"$")
	public void user_enter_the_lastname_as_us(String lastname) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]"))
				.sendKeys(lastname);
	}

	@Then("^user enter the emailId as us \"([^\"]*)\"$")
	public void user_enter_the_emailId_as_us(String emailId) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/input[1]"))
				.sendKeys(emailId);
	}

	@Then("^user enter the mobileno as us \"([^\"]*)\"$")
	public void user_enter_the_mobileno_as_us(String mobileno) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]"))
				.sendKeys(mobileno);
	}

	@Then("^user enter the companyname as us \"([^\"]*)\"$")
	public void user_enter_the_companyname_as_us(String companyname) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"))
				.sendKeys(companyname);
	}

	@Then("^user enter the address as us \"([^\"]*)\"$")
	public void user_enter_the_address_as_us(String address) throws Throwable {
		wd.findElement(By.id("inputAddress1")).sendKeys(address);
	}

	@When("^user enter the streetaddress as us \"([^\"]*)\"$")
	public void user_enter_the_streetaddress_as_us(String streetaddress) throws Throwable {
		wd.findElement(By.name("address2")).sendKeys(streetaddress);
	}

	@When("^user enter the cityname as us \"([^\"]*)\"$")
	public void user_enter_the_cityname_as_us(String cityname) throws Throwable {
		wd.findElement(By.id("inputCity")).sendKeys(cityname);
	}

	@Then("^user enter the statename as us \"([^\"]*)\"$")
	public void user_enter_the_statename_as_us(String statename) throws Throwable {
		wd.findElement(By.name("state")).sendKeys(statename);
	}

	@Then("^user enter the postcode as us \"([^\"]*)\"$")
	public void user_enter_the_postcode_as_us(String postcode) throws Throwable {
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[6]/div[1]/input[1]"))
				.sendKeys(postcode);
	}

	@Then("^user click how to select as us \"([^\"]*)\"$")
	public void user_click_how_to_select_as_us(String select) throws Throwable {
		WebElement input = wd.findElement(By.xpath(
				"/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/select[1]"));
		Select s = new Select(input);
		s.selectByVisibleText(select);
		Thread.sleep(1000);
		wd.close();
	}

}