package components;

import net.serenitybdd.screenplay.targets.Target;

public class DeleteViewModal {
    public static final Target CONFIRM_DELETION_BUTTON = Target.the("ok button")
            .locatedBy("//div[@class='bootstrap-dialog-footer-buttons']/button[contains(text(),'OK')]");
}