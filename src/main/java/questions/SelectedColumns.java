package questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import static components.SelectedViewDatatable.SELECTED_COLUMNS;



public class SelectedColumns implements Question<List<String>> {

    public SelectedColumns(){}
    public static SelectedColumns ofCurrentView() {
        return Instrumented.instanceOf(SelectedColumns.class).withProperties();
    }

    @Override
    public List<String> answeredBy(Actor actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        List<String> columnData = new ArrayList<>();

        SELECTED_COLUMNS.resolveAllFor(actor).forEach(item->{
            columnData.add(js.executeScript("return arguments[0].innerText" , item).toString());
        });

        return columnData;
    }
}