package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;

public class FavouriteThe {
    public static Task viewNamed(String viewName) {
        return Task.where("{0} favourites the selected view",
                SelectView.named(viewName),
                ClickFavourite.button(),
                Click.on(SELECTED_VIEW_DROPDOWN)
        );
    }
}
