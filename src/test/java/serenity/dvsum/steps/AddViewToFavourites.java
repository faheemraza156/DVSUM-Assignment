package serenity.dvsum.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import questions.DataOf;
import questions.FavouriteView;
import tasks.*;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AddViewToFavourites {

    @When("User favourites the selected {word}")
    public void user_favourites_the_selected_view(String viewName) {
        theActorInTheSpotlight().attemptsTo(
                FavouriteThe.viewNamed(viewName)
        );
    }

    @Then("The {word} should be added to favourites")
    public void the_selected_view_should_be_added_to_favourites(String favouriteView){
        List<String> favList = FavouriteView.inFavouritesList().answeredBy(theActorInTheSpotlight());
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(favList).contains(favouriteView)
        );
    }
}