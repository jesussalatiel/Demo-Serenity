package starter.haled.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.haled.locators.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Administrator {
    public static Performable loginAsAdmin(String user, String password) {
       return Task.where("{0} login for '" + user + "'",
                Enter.theValue(user).into( LoginForm.USER_FIELD),
                Enter.theValue ( password ).into ( LoginForm.PASSWORD_FIELD ),
                Click.on ( LoginForm.LOGIN_BUTTON),
                WaitUntil.the ( By.xpath ( ".//a[contains(text(), 'Registered')]" ), isVisible() ).forNoMoreThan ( 30 ).seconds ()
       );

    }
}
