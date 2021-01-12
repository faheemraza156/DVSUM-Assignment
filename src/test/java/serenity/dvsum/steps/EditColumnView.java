package serenity.dvsum.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.CriteriaApplied;
import questions.CurrentView;
import questions.SelectedColumns;
import tasks.NavigateTo;
import tasks.Edit;
import utility.SplitString;

import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EditColumnView {
    @Given("User is on the column dictionary page")
    public void user_is_on_the_column_dictionary_page() {
        theActorInTheSpotlight().wasAbleTo(NavigateTo.columnViewDictionaryPage());
    }

    @When("User edits the column view")
    public void user_edits_the_column_view(DataTable table) {
        List<String> editViewData = table.asList();
        theActorInTheSpotlight().attemptsTo(Edit.columnViewUsing(editViewData));
    }

    @Then("The view name should be {word}")
    public void the_new_version_should_be_saved(String newViewName) {
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(CurrentView.getName().answeredBy(theActorInTheSpotlight())).isEqualTo(newViewName)
        );
    }

    @And("The criteria should be equal to {string}")
    public void theCriteriaShouldBeEqualToSelectedCriteria(String criteria) {
        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(CriteriaApplied.onCurrentView().answeredBy(theActorInTheSpotlight())).containsOnly(criteria)
        );
    }

    @And("The columns should be equal to selectedColumns")
    public void theColumnsShouldBeEqualToSelectedColumns(DataTable table) {
        List<String> editViewData = table.asList();
        List<String> selectedColumns = SelectedColumns.ofCurrentView().answeredBy(theActorInTheSpotlight());
        String[] givenColumns = SplitString.asArray(editViewData.get(0), ",");

        theActorInTheSpotlight().wasAbleTo(
                Ensure.that(selectedColumns).containsExactlyInAnyOrder(givenColumns)
        );
    }
}