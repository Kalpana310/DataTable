package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\USER\\eclipse-workspace\\DataTable\\"
		+ "featureFile\\DataTable.feature",
glue= "org.stepDefinitions",dryRun=false)

public class RunnerDataTable {

}
