package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop implements Interaction {
    private Target source;
    private Target target;

    public DragAndDrop(Target source) {
        this.source = source;
    }

    public static DragAndDrop fromSource(Target source){
        return new DragAndDrop(source);
    }

    public DragAndDrop toTarget(Target target) {
        this.target = target;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(BrowseTheWeb.as(actor).getDriver());
        action.dragAndDrop(source.resolveFor(actor), target.resolveFor(actor)).build().perform();
    }
}