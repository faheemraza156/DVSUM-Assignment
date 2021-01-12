package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.ClearDatabaseNameField.CLEAR_DATABASE_NAME;


public class Clear {

    public Clear(){}

    public static Performable databaseNameField() {
        return Task.where("[0} clears all databases entered in database name field", actor -> {

            CLEAR_DATABASE_NAME.resolveAllFor(actor).forEach(crossButton ->{
                actor.attemptsTo(Click.on(CLEAR_DATABASE_NAME));
            });
        });
    }
}