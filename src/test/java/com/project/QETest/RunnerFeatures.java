package com.project.QETest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/userCreates.feature", "src/test/resources/features/userLogin.feature"})
public class RunnerFeatures {

}