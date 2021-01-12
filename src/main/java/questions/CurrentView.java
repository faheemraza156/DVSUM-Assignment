package questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;

public class CurrentView implements Question<String> {

    public CurrentView(){}
    public static CurrentView getName(){
        return Instrumented.instanceOf(CurrentView.class).withProperties();
    }

    @Override
    public String answeredBy(Actor actor) {
       return Text.of(SELECTED_VIEW_DROPDOWN).asAString().answeredBy(actor);
    }
}