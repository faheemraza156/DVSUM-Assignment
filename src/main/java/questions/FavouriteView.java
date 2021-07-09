package questions;

import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static components.SelectFavouriteView.FAVOURITES_DATA;

public class FavouriteView {

    public FavouriteView(){}
    public static Question<List<String>> inFavouritesList() {
        return Question.about("Is the selected view present in favourite or not").answeredBy(actor -> {
            List<String> favoriteList = new ArrayList<>();
            FAVOURITES_DATA.resolveAllFor(actor).forEach(item-> {
                favoriteList.add(item.getTextValue());
            });
            return favoriteList;
        });
    }
}