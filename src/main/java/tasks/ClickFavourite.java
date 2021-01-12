package tasks;

import interactions.Refresh;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.IsView;

import static components.SelectFavouriteView.FAVOURITE_BUTTON;

public class ClickFavourite {
    public static Performable button() {
        return Task.where("{0} clicks on favourite button", actor -> {
            if(!IsView.favourite().answeredBy(actor)) {
                actor.attemptsTo(
                        Click.on(FAVOURITE_BUTTON),
                        Refresh.currentPage()
                );
            }
        });
    }
}