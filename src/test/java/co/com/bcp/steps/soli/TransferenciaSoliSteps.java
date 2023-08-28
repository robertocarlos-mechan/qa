package co.com.bcp.steps.soli;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.tasks.soli.*;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.questions.Visibility;
import net.thucydides.core.annotations.Screenshots;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.userinterface.soli.TransferenciaSoliPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class TransferenciaSoliSteps {
    @Screenshots()
    @Y("ingreso a envio a otro soli")
    public void ingresoAEnvioAOtroSoli() {
        TESTER.attemptsTo(EnvioSoliTransferencia.withTheFollowingFields());
    }
    @Y("valido que estoy en la opcion envio a otro soli")
    public void validoQueEstoyEnLaOpcionEnvioAOtroSoli() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_CONSULTAS), equalTo(true)));
    }
    @Screenshots()
    @Y("doy permiso para ingresar a contactos")
    public void doyPermisoParaIngresarAContactos() {
        TESTER.attemptsTo(AccesoContactos.withTheFollowingFields());
    }
    @Screenshots()
    @Y("ingreso numero de soli {string}")
    public void ingresoNumeroDeSoli(String celular_soli) {
        TESTER.attemptsTo(IngresoCelularSoli.withTheFollowingFields(celular_soli));
    }
    @Screenshots()
    @Y("doy clic al numero a transferir")
    public void doyClicAlNumeroATransferir() {
        if (TESTER.asksFor( Visibility.of(LBL_ENVIO_OTRO_SOLI)))
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ENVIO_OTRO_SOLI), equalTo(true)));
        else {
            TESTER.attemptsTo(CelularTransferir.withTheFollowingFields());
        }
    }
    @Screenshots()
    @Y("ingreso el monto {string}")
    public void ingresoElMonto(String monto) {
        TESTER.attemptsTo(IngresoMonto.withTheFollowingFields(monto));
    }
    @Screenshots()
    @Y("ingreso un comentario")
    public void ingresoUnComentario() {
        TESTER.attemptsTo(IngresoMensajeOpcional.withTheFollowingFields());
    }
    @Screenshots()
    @Y("doy clic al boton para transferencia")
    public void doyClicAlBotonParaTransferencia() {
        TESTER.attemptsTo(EnvioTransferencia.element());
    }
    @Screenshots()
    @Entonces("valido que se haya realizado la transferencia")
    public void validoQueSeHayaRealizadoLaTransferencia() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_TRANSFERENCIA_EXITOSA), equalTo(true)));
    }
}
