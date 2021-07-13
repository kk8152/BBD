package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhpTest{
      WebDriver wd;
	
      @Given("^user open browser as chromdriver$")
      public void user_open_browser_as_chromdriver() throws Throwable {
         wd = new ChromeDriver();
         wd.manage().window().maximize();
      }

      @Then("^user enter url$")
      public void user_enter_enter_url() throws Throwable {
          wd.get("https://phptravels.org/register.php");
      }

      @Then("^user enter firstname$")
      public void user_enter_firstname() throws Throwable {
          wd.findElement(By.xpath("//*[@id='inputFirstName']")).sendKeys("Karuna");
      }

      @When("^user enter lastname$")
      public void user_enter_lastname() throws Throwable {
         wd.findElement(By.xpath("//*[@id='inputLastName']")).sendKeys("karan");
      }

      @When("^user enter emailid$")
      public void user_enter_emailid() throws Throwable {
        wd.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("karunaeee");
      }

      @Then("^user enter mobileno$")
      public void user_enter_mobileno() throws Throwable {
         wd.findElement(By.xpath("//*[@id='inputPhone']")).sendKeys("9500");
      }
}