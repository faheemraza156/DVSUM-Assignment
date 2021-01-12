package serenity.dvsum.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestHooks {
    private Actor bjorn;

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void bjornCanBrowseTheWeb(){
        OnStage.setTheStage(new OnlineCast());
        bjorn = OnStage.theActorCalled("Bjorn");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Login.usingCredentials());
    }
}
