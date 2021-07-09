package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;
import static components.EditViewForm.SAVE_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Save {
    public static Task theEditedVersion() {
        return Task.where("{0} saves the edited form" ,
                Click.on(SAVE_BUTTON),
                Wait.until(the(SELECTED_VIEW_DROPDOWN) , isClickable()).forNoLongerThan(10).seconds());
    }
}