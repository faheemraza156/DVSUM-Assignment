package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.SettingsDropdown.EDIT_BUTTON;
import static components.SettingsDropdown.SETTINGS_BUTTON;

public class Open {
    public static Task editViewFormFromSettings() {
        return Task.where("{0} clicks on edit button and enters edit view" ,
                Click.on(SETTINGS_BUTTON),
                Click.on(EDIT_BUTTON));
    }
}
