package com.bdd.aws;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/aws_testing",
		glue = "com.bdd.aws"
)
public class TestSuite {}
