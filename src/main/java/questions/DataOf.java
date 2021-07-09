package questions;

import net.serenitybdd.screenplay.Question;
import java.util.ArrayList;
import java.util.List;
import static components.ColumnViewDropdown.VIEW_DROPDOWN_DATA;

public class DataOf {

    public DataOf(){}
    public static Question<List<String>> viewDropdown() {
        return Question.about("Views present in view dropdown").answeredBy(actor -> {
            List<String> dropdownDataList = new ArrayList<>();
            VIEW_DROPDOWN_DATA.resolveAllFor(actor).forEach(item-> {
                dropdownDataList.add(item.getTextValue());
            });
            return dropdownDataList;
        });
    }
}