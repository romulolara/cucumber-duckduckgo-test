package br.gov.dataprev.duckduckgo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = { "pretty" },
	features = { "src/test/resources" }
	//,tags= {"@done"}
)

public class DuckDuckGoTest {
}