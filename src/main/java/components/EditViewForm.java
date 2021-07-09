package components;

import net.serenitybdd.screenplay.targets.Target;

public class EditViewForm {
    public static Target ENTER_VIEW_NAME_FIELD = Target.the("View name field")
            .locatedBy("//input[@id=\"viewName\"]");
    public static Target ENTER_DATABASE_TYPE_FIELD = Target.the("database type field")
            .locatedBy("//select[@id=\"filterColumns\"]");
    public static Target ENTER_DATABASE_TYPE = Target.the("database type")
            .locatedBy("//select[@id=\"filterColumns\"]/option[contains(text(),'{0}')]");
    public static Target ENTER_DATABASE_FILTER_FIELD = Target.the("database filter field")
            .locatedBy("//select[@id=\"filterOperator\"]");
    public static Target ENTER_DATABASE_FILTER = Target.the("database filter")
            .locatedBy("//select[@id=\"filterOperator\"]/option[contains(text(),'{0}')]");
    public static Target ENTER_DATABASE_NAME_FIELD = Target.the("database name field")
            .locatedBy("//div[@id='valueList_chosen']/ul");
    public static Target ENTER_DATABASE_NAME = Target.the("database name")
            .locatedBy("//div[@id='valueList_chosen']/div/ul/li[contains(text(),'{0}')]");

    public static Target AVAILABLE_COLUMN = Target.the("data available in column")
            .locatedBy("//ul[@id=\"availableColumns\"]/li/div/span[contains(text(),'{0}')]");
    public static Target SELECTED_COLUMN = Target.the("data moved to selected column")
            .locatedBy("//ul[@id='selectedColumns']");
    public static Target DESELECT_ALL_COLUMNS = Target.the("All columns deselected")
            .locatedBy("//div[@id=\"dbox_de_select_all\"]");

    public static Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("//button[@type='button']/span[contains(text(),'Save')]");
}
