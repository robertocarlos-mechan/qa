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

public class IngresoPinActual implements Task {

    private final String pin_actual;

    public IngresoPinActual(String pin_actual) {
        this.pin_actual = pin_actual;
    }
    public static IngresoPinActual withTheFollowingFields(String pin_actual) {
        return instrumented(IngresoPinActual.class, pin_actual);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaSoliPage.TXT_PIN_ACTUAL, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaSoliPage.TXT_PIN_ACTUAL),
                Enter.theValue(pin_actual).into(TransferenciaSoliPage.TXT_PIN_ACTUAL),
                theActorHidesKeyboard());
    }
}
