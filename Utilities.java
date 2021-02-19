package Mentoring.Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utilities {
    public static void click(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).build().perform();


    }
}
