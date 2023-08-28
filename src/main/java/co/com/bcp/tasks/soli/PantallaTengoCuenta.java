package co.com.bcp.tasks.soli;

import co.com.bcp.userinterface.soli.TransferenciaSoliPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PantallaTengoCuenta implements Task {

    public PantallaTengoCuenta() {
        //Task
    }
    public static PantallaTengoCuenta withTheFollowingFields() {
        return instrumented(PantallaTengoCuenta.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaSoliPage.BTN_TENGO_CUENTA));
    }
}
