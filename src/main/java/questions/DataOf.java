package questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static components.ColumnViewDropdown.SELECTED_VIEW_DROPDOWN;
import static components.ColumnViewDropdown.VIEW_DROPDOWN_DATA;

public class DataOf implements Question<List<String>> {

    public DataOf(){}
    public static DataOf viewDropdown() {
        return Instrumented.instanceOf(DataOf.class).withProperties();
    }


    @Override
    public List<String> answeredBy(Actor actor) {
        List<String> dropdownDataList = new ArrayList<>();
        actor.attemptsTo(Click.on(SELECTED_VIEW_DROPDOWN));
        VIEW_DROPDOWN_DATA.resolveAllFor(actor).forEach(item-> {
            dropdownDataList.add(item.getTextValue());
        });
        return dropdownDataList;
    }
}
