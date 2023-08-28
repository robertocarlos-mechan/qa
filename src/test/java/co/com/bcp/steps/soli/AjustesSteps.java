package co.com.bcp.steps.soli;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.tasks.soli.*;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Screenshots;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.userinterface.soli.TransferenciaSoliPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AjustesSteps {

    @Screenshots()
    @Y("doy clic al boton Mas")
    public void doyClicAlBotonMas() {
        TESTER.attemptsTo(OpcionAjustes.element());
    }

    @Y("valido que estoy en la opcion ajustes")
    public void validoQueEstoyEnLaOpcionAjustes() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_AJUSTES), equalTo(true)));
    }

    @Y("doy clic a la opcion cambiar pin")
    public void doyClicALaOpcionCambiarPin() {
        TESTER.attemptsTo(OpcionCambiarPin.element());
    }

    @Y("ingreso pin actual {string}")
    public void ingresoPinActual(String pin_actual) {
        TESTER.attemptsTo(IngresoPinActual.withTheFollowingFields(pin_actual));
    }

    @Y("ingreso nuevo pin {string}")
    public void ingresoNuevoPin(String pin_new) {
        TESTER.attemptsTo(IngresoPinNuevo.withTheFollowingFields(pin_new));
    }

    @Y("confirmo nuevo pin {string}")
    public void confirmoNuevoPin(String pin_new) {
        TESTER.attemptsTo(IngresoConfirmaPinNuevo.withTheFollowingFields(pin_new));
    }

    @Y("doy clic a cambio de pin")
    public void doyClicACambioDePin() {
        TESTER.attemptsTo(CambioPin.element());
    }

    @Entonces("se valida el cambio de pin exitoso")
    public void seValidaElCambioDePinExitoso() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_CAMBIO_PIN_EXITOSO), equalTo(true)));
    }
}
