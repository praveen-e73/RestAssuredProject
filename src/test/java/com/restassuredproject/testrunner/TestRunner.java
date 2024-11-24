package com.restassuredproject.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
	        plugin = "html:target/reports.html",
	        features = "src/test/resources/features",
	        glue = "stepdefinition",
	        //dryRun = false,
	        tags = "@api"
	)

	public class TestRunner {
	}

