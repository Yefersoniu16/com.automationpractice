package com.automationspractice.stepdefinitions;

import com.automationpractice.questions.VerifyAddProductCart;
import com.automationpractice.questions.VerifyColorChange;
import com.automationpractice.questions.VerifyPressureProduct;
import com.automationpractice.tasks.AddProductCart;
import com.automationpractice.tasks.CheckPressureProduct;
import com.automationpractice.tasks.ColorChangeProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCartProductStepdefinitions {
    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yeferson");
    }


    @Given("^the user is on the automation practice page$")
    public void theUserIsOnTheAutomationPracticePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));

    }

    @When("^Product selection and shipment to the cart$")
    public void productSelectionAndShipmentToTheCart() {
        theActorInTheSpotlight().attemptsTo(AddProductCart.addToCart());

    }

    @Then("^Verify that the product is in the cart$")
    public void verifyThatTheProductIsInTheCart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAddProductCart.verifyProduct()));

    }

    @When("^Product selection and color change$")
    public void productSelectionAndColorChange() {
        theActorInTheSpotlight().attemptsTo(ColorChangeProduct.changeColor());
    }

    @Then("^Verify that the product is in the cart with the color modified$")
    public void VerifyThatTheProductIsInTheCartWithTheColorModified() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyColorChange.verifyTheColor()));

    }


    @When("^Select products from the page$")
    public void selectProductsFromThePage() {
        theActorInTheSpotlight().attemptsTo(CheckPressureProduct.checkThePressure());
    }

    @Then("^Check the pressure$")
    public void checkThePressure() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyPressureProduct.verifyinformation()));
    }

}
