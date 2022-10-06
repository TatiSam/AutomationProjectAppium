package extensions;

import org.openqa.selenium.WebElement;
import utilities.Variables;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class UIActions{
    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void sendKeysToElement(WebElement webElement, String keysToSend) {
        webElement.sendKeys(keysToSend);
    }

    public static void hideKeyboard() {
        Variables.driver.hideKeyboard();
    }

    public static void goBack() {
        Variables.driver.navigate().back();
    }
}
