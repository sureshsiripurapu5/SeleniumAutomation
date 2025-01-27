package BddFramework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "BddFramework",
       tags = "@Lt3",
       plugin = "pretty")
public class TestRunner {


}
