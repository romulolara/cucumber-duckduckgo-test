package br.gov.dataprev.test.duckduckgo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = { "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
	features = { "src/test/resources" }
)

public class RunCukesTest {

}