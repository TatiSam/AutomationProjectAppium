package extensions;

import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class Verifications {
    public static void verifyTextEquals(String actual, String expected) {
        assertEquals(actual.toLowerCase(), expected);
    }

    public static void verifyTextContains(String text, String str) {
        assertTrue(text.toLowerCase().contains(str));
    }

    public static void verifyElementIsDisplayed(WebElement element) {
        assertTrue(element.isDisplayed());
    }
}
