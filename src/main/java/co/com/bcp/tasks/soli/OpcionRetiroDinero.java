package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionRetiroDinero implements Task {

    public OpcionRetiroDinero() {
        //Task
    }
    public static OpcionRetiroDinero element() {
        return instrumented(OpcionRetiroDinero.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_CONSULTA_RETIRO_DINERO));
    }
}
