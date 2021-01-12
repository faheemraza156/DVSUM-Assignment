package components;

import net.serenitybdd.screenplay.targets.Target;

public class SelectedViewDatatable {
    public static Target SELECTED_COLUMN_DATA = Target.the("Data of selected column")
            .locatedBy("//div[@class='ag-center-cols-container']/div/div[@col-id='Source']");

    public static Target SELECTED_COLUMNS = Target.the("Selected Columns ")
            .locatedBy("//div[@class='ag-header-container']/div[1]/div/div[@class='ag-cell-label-container ag-header-cell-sorted-none']/div[@class='ag-header-cell-label']/span[@ref='eText']");

}