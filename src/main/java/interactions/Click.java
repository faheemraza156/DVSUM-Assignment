package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click implements Interaction {

    private WebElement element;
    public Click(WebElement element){
        this.element = element;
    }

    public static Click onElement(WebElement element) {
        return Instrumented.instanceOf(Click.class).withProperties(element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom = '.5'");
        js.executeScript("arguments[0].click();" , element);
//        js.executeScript("return arguments[0].innerText" , element);
    }
}
