package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Home;

public class Login {


    Home home;
    WebDriver driver;

    @Given("the user is on Login tab")
    public void the_user_is_on_login_tab() {
        home = new Home(driver);
        home.clickOnLoginTab();
    }

    @When("the user enters the {string} and the {string}")
    public void the_user_enters_the_and_the(String string, String string2) {

    }

    @When("the user Clicks on Login button")
    public void the_user_clicks_on_login_button() {

    }

    @Then("Profile page loads successfully")
    public void profile_page_loads_successfully() {

    }

}
