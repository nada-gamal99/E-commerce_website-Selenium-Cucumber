package Runners;

import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"StepDefenitions/Steps.java", "StepDefenitions/Steps2.java"},
        features = {"src/test/resources/Features/CreateNewAccount.feature","Features/E2E_Scenario.feature" },
        plugin = { "pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"}
)
public class Run{

}
