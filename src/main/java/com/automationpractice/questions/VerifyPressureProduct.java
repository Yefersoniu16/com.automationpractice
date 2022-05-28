package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.automationpractice.userinterfaces.CheckPressure.VERIFY_PRODUCT_TWO;
import static com.automationpractice.userinterfaces.CheckPressure.VERIFY_PRODUCT_UNE;

public class VerifyPressureProduct implements Question <Boolean> {
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(VERIFY_PRODUCT_UNE.resolveFor(actor).getText()).contains("16.40");
        validate.assertThat(VERIFY_PRODUCT_TWO.resolveFor(actor).getText()).contains("16.51");
        validate.assertAll();

        return true;

    }

    public static Question<Boolean> verifyinformation() {
        return new VerifyPressureProduct();
    }
}
