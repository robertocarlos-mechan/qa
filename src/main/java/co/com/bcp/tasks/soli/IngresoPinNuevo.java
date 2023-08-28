package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bcp.interactions.HideKeyboard.theActorHidesKeyboard;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresoPinNuevo implements Task {

    private final String pin_new;

    public IngresoPinNuevo(String pin_new) {
        this.pin_new = pin_new;
    }
    public static IngresoPinNuevo withTheFollowingFields(String pin_new) {
        return instrumented(IngresoPinNuevo.class, pin_new);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaSoliPage.TXT_NUEVO_PIN, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaSoliPage.TXT_NUEVO_PIN),
                Enter.theValue(pin_new).into(TransferenciaSoliPage.TXT_NUEVO_PIN),
                theActorHidesKeyboard());
    }
}
