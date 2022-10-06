package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class Variables {
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    public static IntroPage introPage;
    public static HomePage homePage;
    public static ProfilePage profilePage;
    public static SearchPage searchPage;
    public static ProductPage productPage;
    public static ShoppingCartPage shoppingCartPage;

    public static String URL_PATH;
    public static long TIMEOUT;
    public static String DEVICE_NAME;
    public static String UDID;
    public static String PLATFORM_NAME;
    public static String PLATFORM_VERSION;
    public static String APP_PACKAGE;
    public static String APP_ACTIVITY;
    public static String SEARCH_TERM;
    public static String REGISTRATION_DATA_FILE_PATH;
}
