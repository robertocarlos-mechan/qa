package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresoCelularSoli implements Task {

    private final String celular_soli;

    public IngresoCelularSoli( String celular_soli) {
        this.celular_soli = celular_soli;
    }
    public static IngresoCelularSoli withTheFollowingFields(String celular_soli) {
        return instrumented(IngresoCelularSoli.class,celular_soli);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaSoliPage.TXT_CELULAR_SOLI, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaSoliPage.TXT_CELULAR_SOLI),
                Enter.theValue(celular_soli).into(TransferenciaSoliPage.TXT_CELULAR_SOLI));
    }
}
