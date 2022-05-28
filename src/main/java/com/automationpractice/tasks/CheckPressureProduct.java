package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.AddCart.*;
import static com.automationpractice.userinterfaces.CheckPressure.*;
import static com.automationpractice.userinterfaces.ColorChange.COLOR;
import static com.automationpractice.userinterfaces.ColorChange.MORE_PRINTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckPressureProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WOMAN),
                Click.on(PRINTED_CHIFFON_DRESS),
                Click.on(MORE_CHIFFON),
                Click.on(ADD_TO_CARY),
                Click.on(CHECKOUT),
                Click.on(WOMAN),
                Click.on(FADED_SHORT_SLEEVE),
                Click.on(MORE_SHORT),
                Click.on(ADD_TO_CARY),
                Click.on(CHECKOUT)

        );

    }
    public static CheckPressureProduct checkThePressure() {
        return instrumented(CheckPressureProduct.class);
    }
}
