package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationpractice.userinterfaces.AddCart.VERIFY_CHECKOUT;
import static com.automationpractice.userinterfaces.ColorChange.VERIFY_COLOR;

public class VerifyColorChange implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return VERIFY_COLOR.resolveFor(actor).getText().equals("Color : Black, Size : S");
    }
    public static Question <Boolean> verifyTheColor() {
        return new VerifyColorChange();
    }
}
