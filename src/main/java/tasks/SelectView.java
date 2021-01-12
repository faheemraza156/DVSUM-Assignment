package tasks;


import interactions.Refresh;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;
import static components.ColumnViewDropdown.VIEW_NAME;


public class SelectView {
    public static Task named(String viewName) {
        return Task.where("{0} selects a view",
                        Click.on(SELECTED_VIEW_DROPDOWN),
                        Click.on(VIEW_NAME.of(viewName)),
                        Refresh.currentPage()
            );
    }
}