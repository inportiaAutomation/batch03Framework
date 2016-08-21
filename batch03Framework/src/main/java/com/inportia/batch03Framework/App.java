package com.inportia.batch03Framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
(
		features = "Feature",
		glue = "com/inportia/batch03Framework/stepDefs",
		tags = "@chk_01"
)
public class App 
{
   
   
}
