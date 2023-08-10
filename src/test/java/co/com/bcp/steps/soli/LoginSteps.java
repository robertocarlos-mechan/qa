package co.com.bcp.steps.soli;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.tasks.soli.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Screenshots;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.userinterface.soli.TransferenciaSoliPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    @Screenshots()
    @Dado("Ingreso a soli")
    public void ingresoASoli() {
    }
    @Screenshots()
    @Y("valido que estoy dentro de soli")
    public void validoQueEstoyDentroDeSoli() {
       TESTER.should(seeThat(IsEnabled.theTarget(BTN_TENGO_CUENTA),equalTo(true)));
    }
    @Screenshots()
    @Cuando("ingreso opcion ya tengo cuenta")
    public void ingresoOpcionYaTengoCuenta() {
        TESTER.attemptsTo(PantallaTengoCuenta.withTheFollowingFields());
    }
    @Screenshots()
    @Y("ingreso mi celular {string}")
    public void ingresoMiCelular(String celular) {
        TESTER.attemptsTo(IngresoCelularRegistrado.withTheFollowingFields(celular));
    }
    @Screenshots()
    @Y("ingreso mi password {string}")
    public void ingresoMiPassword(String password) {
        TESTER.attemptsTo(IngresoPassword.withTheFollowingFields(password));
    }
    @Screenshots()
    @Y("doy clic al boton ingresar")
    public void doyClicAlBotonIngresar() {
        TESTER.attemptsTo(IngresoSoli.withTheFollowingFields());
    }
    @Screenshots()
    @Entonces("valido que inicie sesion")
    public void validoQueInicieSesion() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_SALDO), equalTo(true)));
    }
}
