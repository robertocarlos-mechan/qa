package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionSaldosMovimientos implements Task {

    public OpcionSaldosMovimientos() {
        //Task
    }
    public static OpcionSaldosMovimientos element() {
        return instrumented(OpcionSaldosMovimientos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_CONSULTA_SALDOS_MOVIMIENTOS));
    }
}
