package questions;

import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static components.SelectedViewDatatable.SELECTED_COLUMN_DATA;

public class Data {

    public static Question<List<String>> ofSelectedView() {
        return Question.about("Data present in selected column").answeredBy(
                Text.of(SELECTED_COLUMN_DATA).asAList()
        );
    }
}