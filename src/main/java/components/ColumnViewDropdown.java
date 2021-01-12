package components;

import net.serenitybdd.screenplay.targets.Target;

public class ColumnViewDropdown {
    public static final Target SELECTED_VIEW_DROPDOWN = Target.the("selected view dropdown")
            .locatedBy("//span[@id=\"selectedView\"]");
    public static final Target VIEW_NAME = Target.the("view")
            .locatedBy("//li[normalize-space()='{0}']");
    public static final Target VIEW_DROPDOWN_DATA = Target.the("selected view dropdown data")
            .locatedBy("//ul[@class=\"sub-list\"]//li[contains(@class,\"userView\")]");
}
