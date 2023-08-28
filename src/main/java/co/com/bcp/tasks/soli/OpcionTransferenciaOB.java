package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionTransferenciaOB implements Task {

    public OpcionTransferenciaOB() {
        //Task
    }
    public static OpcionTransferenciaOB element() {
        return instrumented(OpcionTransferenciaOB.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_CONSULTA_TRANSFERENCIA_OTROS_SOLI));
    }
}
