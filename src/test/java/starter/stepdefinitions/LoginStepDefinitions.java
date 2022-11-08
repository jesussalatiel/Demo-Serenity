package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
import starter.haled.actions.Administrator;
import starter.navigation.Pages;

public class LoginStepDefinitions {

    @Given("{actor} is admin page")
    public void administrator_is_admin_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.HaledHomePage());
    }

    @When("{actor} login with credentials {string} and {string}")
    public void he_login_with_credentials_and(Actor actor, String user, String password) throws InterruptedException {
        actor.wasAbleTo ( Administrator.loginAsAdmin(user, password) );
    }
    @Then("{actor} verify {string}")
    public void he_verify(Actor actor, String string) throws InterruptedException {
        actor.wasAbleTo (
                NavigateTo.navigateTo ( Pages.DASHBOARD )
        );
    }
}
