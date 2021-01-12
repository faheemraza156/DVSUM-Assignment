package components;

import net.serenitybdd.screenplay.targets.Target;

public class SettingsDropdown {
    public static final Target SETTINGS_BUTTON = Target.the("Settings dropdown")
            .locatedBy("//button[@class='btn btn-info btn-white dropdown-toggle menu-btn uv-ellipses-btn']");
    public static final Target EDIT_BUTTON = Target.the("Edit button")
            .locatedBy("//ul[@class='dropdown-menu dropdown-info dropdown-menu-right']/li[1]");
    public static final Target DELETE_BUTTON = Target.the("delete button")
            .locatedBy("//*[@id=\"deleteViewBtn\"]");
}
