package questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static components.SelectFavouriteView.FAVOURITE_BUTTON;

public class IsView implements Question<Boolean> {

    public IsView() {

    }

    public static IsView favourite() {
        return Instrumented.instanceOf(IsView.class).withProperties();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String favAttribute = Attribute.of(FAVOURITE_BUTTON).named("class").asAString().answeredBy(actor);
        return favAttribute.equals("fa fa-star blue fav-btn-icon");
    }
}
