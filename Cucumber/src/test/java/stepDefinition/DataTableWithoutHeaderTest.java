package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderTest {

	WebDriver wd;

	@Given("^user can open the browser$")
	public void user_can_open_the_browser() throws Throwable {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@When("^user can enter  the url$")
	public void user_can_enter_the_url() throws Throwable {
		wd.get("https://phptravels.org/register.php");
	}

	@Then("^user can be enter the credentials$")
	public void user_can_be_enter_the_credentials(DataTable datatable) throws Throwable {

		List<String> credentials = datatable.asList(String.class);
		String firstname = credentials.get(0);
		String lastname = credentials.get(1);

		wd.findElement(By.id("inputFirstName")).sendKeys(firstname);
		wd.findElement(By.id("inputLastName")).sendKeys(lastname);
	}
}