package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.AddCart.*;
import static com.automationpractice.userinterfaces.CheckPressure.VERIFY_PRODUCT_UNE;
import static com.automationpractice.userinterfaces.ColorChange.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ColorChangeProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WOMAN),
                Click.on(PRINTED_SUMMER_DRESS),
                Click.on(MORE_PRINTED),
                Click.on(COLOR),
                Click.on(ADD_TO_CARY),
                Click.on(CHECKOUT)


        );


    }
    public static ColorChangeProduct changeColor() {
        return instrumented(ColorChangeProduct.class);
    }
}
