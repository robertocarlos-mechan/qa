package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CelularTransferir implements Task {

    public CelularTransferir() {
        //Task
    }
    public static CelularTransferir withTheFollowingFields() {
        return instrumented(CelularTransferir.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.SELECT_PERSONA_SOLI));
    }
}
