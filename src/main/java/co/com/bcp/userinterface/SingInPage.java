package co.com.bcp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInPage {
    public static final Target BTN_CLOSE_WINDOW =
            Target.the("button that closes the login window")
                    .located(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));

    private SingInPage() {
        //Nothing
    }
}
