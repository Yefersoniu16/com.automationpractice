package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.automationpractice.userinterfaces.AddCart.VERIFY_CHECKOUT;

public class VerifyAddProductCart implements Question {
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {

        return VERIFY_CHECKOUT.resolveFor(actor).getText().equals("Proceed to checkout");
        }
    public static Question <Boolean> verifyProduct() {
        return new VerifyAddProductCart();
    }

}
