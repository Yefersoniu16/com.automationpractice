package com.automationpractice.tasks;

import com.automationpractice.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.automationpractice.userinterfaces.AddCart.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WOMAN),
                Click.on(BLOUSE),
                Wait.theSeconds(3),
                Click.on(MORE),
                Click.on(ADD_TO_CARY),
                Wait.theSeconds(3),
               Click.on(CHECKOUT),
                Wait.theSeconds(3),
                Scroll.to(VERIFY_CHECKOUT)

        );
    }
    public static AddProductCart addToCart() {
        return instrumented(AddProductCart.class);
    }
}
