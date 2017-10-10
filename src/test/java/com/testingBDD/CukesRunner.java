/**
 * Created by disaputra on 26/07/2017.
 */
package com.testingBDD;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"}
)

public class CukesRunner { }
