package co.com.bcp.steps.conf;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static final Actor TESTER = Actor.named("TESTER");
    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Before
    public void setup(Scenario scenario) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "AutomationTesting");
        capabilities.setCapability("appium:app", "C:\\\\Users\\\\BC2834\\\\AndroidStudioProjects\\\\proyecto_soli\\\\SWBIL_SOLI_ANDROID_APP\\\\app\\\\build\\\\intermediates\\\\apk\\\\wallet\\\\debug\\\\app-wallet-debug.apk");
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium.newCommandTimeout", 10000);

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        sharedComponents.setDriver(driver);

        OnStage.setTheStage(new OnlineCast());
        TESTER.whoCan(BrowseTheWeb.with(driver));
    }
}
