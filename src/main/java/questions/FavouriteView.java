package questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;
import static components.SelectFavouriteView.FAVOURITES_DATA;

public class FavouriteView implements Question<List<String>> {

    public FavouriteView(){}
    public static FavouriteView inFavouritesList() {
        return Instrumented.instanceOf(FavouriteView.class).withProperties();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        List<String> favoriteList = new ArrayList<>();
        actor.attemptsTo(Click.on(SELECTED_VIEW_DROPDOWN));
        FAVOURITES_DATA.resolveAllFor(actor).forEach(item-> {
            favoriteList.add(item.getTextValue());
        });
        return favoriteList;
    }
}