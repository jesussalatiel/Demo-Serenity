package starter.haled.locators;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {
    public static Target USER_FIELD = Target.the("email field").located( By.name ( "email"));
    public static Target PASSWORD_FIELD = Target.the("password field").located( By.name ( "password"));
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy(".//button[contains(., 'Login')]");
}
