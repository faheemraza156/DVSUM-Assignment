package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class EditWebElementAttribute implements Interaction {

    public EditWebElementAttribute(){}
    public static EditWebElementAttribute ofWebElement(){
        return Instrumented.instanceOf(EditWebElementAttribute.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('columnDictionaryGrid').setAttribute('style' , 'height: 10000px; width: 5000px;');");
    }
}