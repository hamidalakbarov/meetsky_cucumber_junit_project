package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (

        // providing path for feature file
        features="src/test/resources/features",
        // providing step definitions as a glue
        glue="com/cydeo/step_definitions",
        // dryRun for getting just running feature file to get code snippets
        dryRun=false,
        // tags to execute only scenarios with given tag
        tags="@wip",
        // plugin to get a reports and create a rerun.txt file
        plugin = {"html:target/cucumber-report.html",
                        "rerun:target/rerun.txt"},
        publish = true
)

public class CukesRunner {
}
