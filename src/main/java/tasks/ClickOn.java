package tasks;

import interactions.Refresh;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.DeleteViewModal.CONFIRM_DELETION_BUTTON;
import static components.SettingsDropdown.DELETE_BUTTON;
import static components.SettingsDropdown.SETTINGS_BUTTON;

public class ClickOn {
    public static Performable deleteButton() {
        return Task.where("{0} clicks on delete button",
                Click.on(SETTINGS_BUTTON),
                Click.on(DELETE_BUTTON),
                Click.on(CONFIRM_DELETION_BUTTON),
                Refresh.currentPage()
        );
    }
}
