package co.com.bcp.userinterface.soli;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferenciaSoliPage {
    public static Target BTN_CREAR_CUENTA = Target.the("Ingreso Onboarding")
            .located(By.id("com.bcp.bo.wallet:id/buttonCreate"));
    public static Target BTN_TENGO_CUENTA = Target.the("Ingreso a loguearme")
            .located(By.id("com.bcp.bo.wallet:id/buttonLogin"));
    public static Target TXT_CELULAR = Target.the("Ingreso celular")
            .located(By.id("com.bcp.bo.wallet:id/textCelular"));
    public static Target TXT_PIN1 = Target.the("Ingreso pin1")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin1"));
    public static Target TXT_PIN2 = Target.the("Ingreso pin2")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin2"));
    public static Target TXT_PIN3 = Target.the("Ingreso pin3")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin3"));
    public static Target TXT_PIN4 = Target.the("Ingreso pin4")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin4"));
    public static Target BTN_LOGIN = Target.the("Boton de Logueo Usuario")
            .located(By.id("com.bcp.bo.wallet:id/buttonLogin"));
    public static Target LBL_SALDO = Target.the("Valido inicio sesion")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Saldo')]"));
    public static Target LBL_CONSULTAS = Target.the("Valido inicio sesion")
            .located(By.id("com.bcp.bo.wallet:id/textView_contacts_results"));
    public static Target BTN_OPCION_MOVIMIENTOS = Target.the("Ingreso a opcion Movimientos")
            .located(By.xpath("//android.widget.FrameLayout[@content-desc=\"Movimientos\"]/android.widget.ImageView"));
    public static Target LBL_MOVIMIENTOS = Target.the("Valido inicio sesion")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Consultas')]"));
    public static Target BTN_SALDOS_MOVIMIENTOS = Target.the("Boton Saldo y Movimientos")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Mi Saldo y Movimientos')]"));
    public static Target LBL_SALDO_DISPONIBLE = Target.the("Boton Saldo y Movimientos")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Saldo disponible')]"));
    public static Target BTN_ENVIO_SOLI = Target.the("Boton Envio a Otro soli")
            .located(By.xpath("(//android.widget.ImageView[@content-desc=\"RestClient\"])[2]"));
    public static Target LBL_SELECCIONA_CONTACTO = Target.the("Pantalla Envio a Otro Soli")
            .located(By.id("com.bcp.bo.wallet:id/textView_contacts_results"));
    public static Target TXT_CELULAR_SOLI = Target.the("Ingreso numero celular soli")
            .located(By.id("com.bcp.bo.wallet:id/search_src_text"));
    public static Target LBL_ENVIO_OTRO_SOLI = Target.the("Pantalla Envio a Otro Soli")
            .located(By.id("com.bcp.bo.wallet:id/textView_no_results"));
    public static Target SELECT_PERSONA_SOLI = Target.the("Persona a Enviar Soli")
            .located(By.id("com.bcp.bo.wallet:id/textViewAction"));
    public static Target BTN_ACCESO_CONTACTOS = Target.the("Boton Permiso acceso contactos")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public static Target TXT_MONTO = Target.the("Envio monto")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_ENVIO_TRANSFERENCIA = Target.the("Boton Enviar")
            .located(By.id("com.bcp.bo.wallet:id/buttonExecute"));
    public static Target LBL_TRANSFERENCIA_EXITOSA = Target.the("Transferencia Exitosa")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Nro')]"));
    public static Target TXT_OPCIONAL = Target.the("Optional")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_REGRESO = Target.the("Optional")
            .located(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));

    private TransferenciaSoliPage() {
        //Nothing
    }
}
