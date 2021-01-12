package components;

import net.serenitybdd.screenplay.targets.Target;

public class ColumnDictionaryDropdown {
    public static final Target DATA_CATALOG = Target.the("data catalog")
            .locatedBy("//span[contains(text(),'Data Catalog')]");
    public static final Target COLUMN_DICTIONARY = Target.the("column dictionary")
            .locatedBy("//a[@href='/dictionary/column']/span");
}