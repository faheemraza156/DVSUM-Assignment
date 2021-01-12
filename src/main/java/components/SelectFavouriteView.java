package components;

import net.serenitybdd.screenplay.targets.Target;

public class SelectFavouriteView {
    public static Target FAVOURITES_DATA = Target.the("columns in favourites")
            .locatedBy("//div[@id=\"favouriteViews\"]/li");

    public static Target FAVOURITE_BUTTON = Target.the("favourite button")
            .locatedBy("//button[@id='favoriteViewBtn']//i");

}
