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

public class MovimientosSteps {
    @Screenshots()
    @Y("ingreso a movimientos")
    public void ingresaAMovimientos() {
        TESTER.attemptsTo(PantallaMovimientos.element());
    }
    @Screenshots()
    @Y("valido que estoy en la opcion movimientos")
    public void validoQueEstoyEnLaOpcionMovimientos() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_MOVIMIENTOS), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso a mi saldo y movimientos")
    public void ingresoAMiSaldoYMovimientos() {
        TESTER.attemptsTo(OpcionSaldosMovimientos.element());
    }
    @Screenshots()
    @Entonces("valido el saldo disponible")
    public void validoElSaldoDisponible() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_SALDO_DISPONIBLE), equalTo(true)));
    }
}
