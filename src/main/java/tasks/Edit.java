package tasks;
import interactions.Refresh;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.List;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;


public class Edit {

    public static Task columnViewUsing(List<String> editViewData) {
        return Task.where("{0} Edits column view",
                Select.viewNamed(editViewData.get(0)),
                Open.editViewFormFromSettings(),
                EnterValue.editedViewName(editViewData.get(1)),
                EnterValue.databaseType(editViewData.get(2)),
                EnterValue.databaseFilter(editViewData.get(3)),
                EnterValue.databaseName(editViewData.get(4)),
                SelectColumns.givenIn(editViewData.get(5)),
                Save.theEditedVersion(),
                Refresh.currentPage());
    }
}
