package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;


public class Delete {
    public static Task theViewNamed(String view) {
        return Task.where("{0} deletes the selected view",
                Select.viewNamed(view),
                ClickOn.deleteButton(),
                Click.on(SELECTED_VIEW_DROPDOWN)
                );
    }
}
