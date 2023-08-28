package co.com.bcp.tasks.soli;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresoCelularRegistrado implements Task {

    private final String celular;

    public IngresoCelularRegistrado(String celular) {
        this.celular = celular;
    }
    public static IngresoCelularRegistrado withTheFollowingFields(String celular) {
        return instrumented(IngresoCelularRegistrado.class, celular);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaSoliPage.TXT_CELULAR, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaSoliPage.TXT_CELULAR),
                Enter.theValue(celular).into(TransferenciaSoliPage.TXT_CELULAR));
    }
}
