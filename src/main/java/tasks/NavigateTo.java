package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static components.ColumnDictionaryDropdown.COLUMN_DICTIONARY;
import static components.ColumnDictionaryDropdown.DATA_CATALOG;


public class NavigateTo {

    public static Task columnViewDictionaryPage() {

        return Task.where("{0} lands on column dictionary page" ,
                Click.on(DATA_CATALOG),
                Click.on(COLUMN_DICTIONARY));
    }
}