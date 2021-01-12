package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.EditViewForm.SAVE_BUTTON;

public class Save {
    public static Task theEditedVersion() {
        return Task.where("{0} saves the edited form" ,
                Click.on(SAVE_BUTTON));
    }
}
