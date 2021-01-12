package tasks;

import interactions.Clear;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static components.EditViewForm.*;

public class EnterValue {
    public static Task editedViewName(String editedName) {
        return Task.where("{0} edits view name",
                Enter.theValue(editedName).into(ENTER_VIEW_NAME_FIELD));
    }

    public static Task databaseType(String databaseType) {
        return Task.where("{0} enter database type",
                Click.on(ENTER_DATABASE_TYPE_FIELD),
                Click.on(ENTER_DATABASE_TYPE.of(databaseType)));
    }

    public static Task databaseFilter(String databaseFilter) {
        return Task.where("{0} enters database filter",
                Click.on(ENTER_DATABASE_FILTER_FIELD),
                Click.on(ENTER_DATABASE_FILTER.of(databaseFilter)));
    }

    public static Task databaseName(String databaseName) {
        return Task.where("{0} enters database name",
                Clear.databaseNameField(),
                Click.on(ENTER_DATABASE_NAME_FIELD),
                Click.on(ENTER_DATABASE_NAME.of(databaseName)));
    }
}