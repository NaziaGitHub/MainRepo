package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue={"StepsDefinition"})
public class Runner 
{

}
