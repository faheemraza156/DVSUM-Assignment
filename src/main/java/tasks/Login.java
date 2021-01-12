package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static components.DvsumLoginForm.*;

public class Login {
    public static Task usingCredentials() {
        return Task.where("{0} logins with valid credentials" ,
                Open.url("https://devqa.dvsum.com/login"),
                Enter.theValue("testautomation@dvsum.com").into(USERNAME_FIELD),
                Enter.theValue("1@Qwerty").into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON));
    }
}
