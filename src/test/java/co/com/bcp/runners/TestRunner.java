package co.com.bcp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "co.com.bcp.steps",
        tags = "@login_soli",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
