package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitOnQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigateTo {
    public static Performable HaledHomePage() {
        return Task.where("{0} opens the Haled login page",
                Open.browserOn().the(HaledHomePage.class));
    }

    public static Performable navigateTo(String page){
        return Task.where ( String.format ( "Go to: %s", page ),
                new OpenUrl (page),
                WaitUntil.angularRequestsHaveFinished ()
        );
    }
}
