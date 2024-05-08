package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private static final String CONTEXT = "login volam truyen ky page";

    @Given("The user is on "+CONTEXT)
    public void the_user_is_on_login_volam_truyen_ky_page() {
        System.out.println("The user is on login volam truyen ky page test");
    }

    @When("The user enters name {string} and password {string} on "+CONTEXT)
    public void theUserEntersNameAndPassword(String user, String pass) {
        System.out.println("The user enter username and password Test");
    }

    @Then("The user clicks button login on "+CONTEXT)
    public void theUserClicksButtonLogin() {
        System.out.println("The user clicks button login");
    }

    @Then("The user is on home page")
    public void theUserIsOnHomePage() {
        System.out.println("The user is on home page");
    }
}
