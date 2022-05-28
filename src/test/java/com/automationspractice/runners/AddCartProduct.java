package com.automationspractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/add_cart.feature"},
        glue = {"com.automationspractice.stepdefinitions"},
        tags = "@CheckPressure",
        snippets = SnippetType.CAMELCASE)
public class AddCartProduct {
}
