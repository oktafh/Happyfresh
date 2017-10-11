/**
 * Created by disaputra on 26/07/2017.
 */
package com.testingBDD;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"}
)

public class CukesRunner { }
