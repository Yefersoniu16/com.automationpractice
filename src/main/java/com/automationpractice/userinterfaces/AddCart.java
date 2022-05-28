package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCart {
    public static final Target WOMAN =Target.the("Woman").
            located(By.xpath("//a[contains(text(),'Women')]"));
    public static final Target BLOUSE =Target.the("Blouse").
            located(By.xpath("(//span[@class='available-now'])[2]"));
    public static final Target MORE =Target.the("More").
            located(By.xpath("(//span[contains(text(),'More')])[2]"));
    public static final Target ADD_TO_CARY =Target.the("Add to cart").
            located(By.xpath("//span[contains(text(),'Add to cart')]"));
    public static final Target CHECKOUT =Target.the("Checkout").
            located(By.xpath("//a[@class='btn btn-default button button-medium']"));
    public static final Target VERIFY_CHECKOUT =Target.the("Verify Checkout").
            located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));



}
