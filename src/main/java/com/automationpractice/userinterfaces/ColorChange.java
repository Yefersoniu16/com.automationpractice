package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorChange {

    public static final Target PRINTED_SUMMER_DRESS =Target.the("Printed summer dress").
            located(By.xpath("(//span[@class='available-now'])[5]"));
    public static final Target MORE_PRINTED =Target.the("More Printed").
            located(By.xpath("(//span[contains(text(),'More')])[5]"));
    public static final Target COLOR =Target.the("color").
            located(By.xpath("(//a[@class='color_pick'])[1]"));
    public static final Target VERIFY_COLOR =Target.the("Verificar color").
            located(By.xpath("(//a[contains(text(),'Color : Black, Size : S')])[2]"));
}
