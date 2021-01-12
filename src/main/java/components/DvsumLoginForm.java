package components;

import net.serenitybdd.screenplay.targets.Target;

public class DvsumLoginForm {
    public static final Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("//input[@id=\"emailAddress\"]");

    public static final Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("//input[@id='password']");

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//button[@id=\"loginButton\"]");
}
