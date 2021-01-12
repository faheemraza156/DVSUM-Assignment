package tasks;

import net.serenitybdd.screenplay.Task;

public class FavouriteThe {
    public static Task viewNamed(String viewName) {
        return Task.where("{0} favourites the selected view",
                SelectView.named(viewName),
                ClickFavourite.button()
        );
    }
}