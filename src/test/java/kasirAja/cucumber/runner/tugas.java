package kasirAja.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/kasirAja/cucumber/features",
        glue = "kasirAja.cucumber.step",
//        tags = "@tugas",
//        monochrome = true,
        plugin = {"html:target/HTML_report.html"}
)
public class tugas {

}
