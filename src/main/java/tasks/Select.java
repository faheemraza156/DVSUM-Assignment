package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static components.ColumnViewDropdown.VIEW_NAME;
import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;

public class Select {
    public static Task viewNamed(String viewData) {
        return Task.where("{0} Selects a view" ,
                Click.on(SELECTED_VIEW_DROPDOWN),
                Click.on(VIEW_NAME.of(viewData)));
    }
}
