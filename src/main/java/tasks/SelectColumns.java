package tasks;

import interactions.DragAndDrop;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import utility.SplitString;

import java.util.List;

import static components.EditViewForm.*;

public class SelectColumns {
    public static Performable givenIn(String availableColumns) {
        return Task.where("{0} selects columns provided in the datatable", actor -> {
            actor.attemptsTo(
                    Click.on(DESELECT_ALL_COLUMNS)
            );
            List<String> availableColumnsList = SplitString.asList(availableColumns , ",");
            availableColumnsList.forEach((column) -> {
                actor.attemptsTo(
                        DragAndDrop.fromSource(AVAILABLE_COLUMN.of(column)).toTarget(SELECTED_COLUMN)
                );
            });
        });
    }
}
