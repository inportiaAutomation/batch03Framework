package com.inportia.batch03Framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
(
		features = "Feature",
		glue = "com/nportia/batch03Framework/stepDefs"
)
public class App 
{

    
}
