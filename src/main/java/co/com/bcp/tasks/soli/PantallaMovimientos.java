package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PantallaMovimientos implements Task {

    public PantallaMovimientos() {
        //Task
    }
    public static PantallaMovimientos element() {
        return instrumented(PantallaMovimientos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_OPCION_MOVIMIENTOS));
    }
}
