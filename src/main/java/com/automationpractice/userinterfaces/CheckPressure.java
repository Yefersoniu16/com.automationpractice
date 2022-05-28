package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckPressure {
    public static final Target PRINTED_CHIFFON_DRESS =Target.the("Printed Chiffon Dress").
            located(By.xpath("(//span[@class='available-now'])[7]"));
    public static final Target MORE_CHIFFON =Target.the("More Printed").
            located(By.xpath("(//span[contains(text(),'More')])[7]"));
    public static final Target FADED_SHORT_SLEEVE =Target.the("Printed Chiffon Dress").
            located(By.xpath("(//span[@class='available-now'])[1]"));
    public static final Target MORE_SHORT =Target.the("More Printed").
            located(By.xpath("(//span[contains(text(),'More')])[1]"));
    public static final Target VERIFY_PRODUCT_UNE =Target.the("").
            located(By.xpath("(//td[@class='cart_total'])[1]"));
    public static final Target VERIFY_PRODUCT_TWO =Target.the("").
            located(By.xpath("(//td[@class='cart_total'])[2     ]"));

}
