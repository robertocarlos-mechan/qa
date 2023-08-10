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

public class IngresoMensajeOpcional implements Task {

    public IngresoMensajeOpcional() {
        //Task
    }
    public static IngresoMensajeOpcional withTheFollowingFields() {
        return instrumented(IngresoMensajeOpcional.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaSoliPage.TXT_OPCIONAL, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaSoliPage.TXT_OPCIONAL),
                Enter.theValue("Transferencia QA").into(TransferenciaSoliPage.TXT_OPCIONAL),
                theActorHidesKeyboard());
    }
}
