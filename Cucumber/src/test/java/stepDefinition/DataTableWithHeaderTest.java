package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderTest {

	WebDriver wd;

	@Given("^user should oepn browser$")
	public void user_should_oepn_browser() throws Throwable {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@Given("^user enter shoud url$")
	public void user_enter_shoud_url() throws Throwable {
		wd.get("https://phptravels.org/register.php");
	}

	@When("^user shound enter the credentials$")
	public void user_shound_enter_the_credentials(DataTable datatable) throws Throwable {
		List<Map<String, String>> keyandvaluepair = datatable.asMaps(String.class, String.class);
		String firstname = keyandvaluepair.get(0).get("firstname");
		String lastname = keyandvaluepair.get(0).get("lastname");

		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("firstname");
		wd.findElement(By
				.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]"))
				.sendKeys("lastname");
	}
}
