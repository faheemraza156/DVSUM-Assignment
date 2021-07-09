package serenity.dvsum.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.DataOf;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteView {

    @When("User deletes the selected {word}")
    public void user_clicks_the_delete_button(String view){
        theActorInTheSpotlight().attemptsTo(Delete.theViewNamed(view));
    }
    @Then("The {word} should be deleted")
    public void the_view_should_be_deleted(String deletedView){
        List<String> completeViewList = DataOf.viewDropdown().answeredBy(theActorInTheSpotlight());
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(completeViewList).doesNotContain(deletedView)
        );
    }
}