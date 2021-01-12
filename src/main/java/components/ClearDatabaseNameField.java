package components;

import net.serenitybdd.screenplay.targets.Target;

public class ClearDatabaseNameField {
    public static Target CLEAR_DATABASE_NAME = Target.the("clear arrow")
            .locatedBy("//div[@id='valueList_chosen']/ul/li/a");
}
