package tasks;

import net.serenitybdd.screenplay.Task;


public class Delete {
    public static Task theViewNamed(String view) {
        return Task.where("{0} deletes the selected view",
                Select.viewNamed(view),
                ClickOn.deleteButton()
                );
    }
}
