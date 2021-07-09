package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;

public class CurrentView {
    public static Question<String> name(){
        return Question.about("Name of current view").answeredBy(
                Text.of(SELECTED_VIEW_DROPDOWN).asAString()
        );
    }
}