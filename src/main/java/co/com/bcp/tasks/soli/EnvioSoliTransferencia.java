package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnvioSoliTransferencia implements Task {

    public EnvioSoliTransferencia() {
        //Task
    }
    public static EnvioSoliTransferencia withTheFollowingFields() {
        return instrumented(EnvioSoliTransferencia.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_ENVIO_SOLI));
    }
}
