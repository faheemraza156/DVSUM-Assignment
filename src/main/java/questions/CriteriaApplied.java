package questions;

import interactions.EditWebElementAttribute;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static components.SelectedViewDatatable.SELECTED_COLUMN_DATA;

public class CriteriaApplied implements Question<List<String>> {

    public CriteriaApplied(){}
    public static CriteriaApplied onCurrentView() {
        return Instrumented.instanceOf(CriteriaApplied.class).withProperties();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        actor.attemptsTo(EditWebElementAttribute.ofWebElement());
        return Text.of(SELECTED_COLUMN_DATA).asAList().answeredBy(actor);
    }
}