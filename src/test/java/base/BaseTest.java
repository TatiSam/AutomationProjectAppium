package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ManagePages;
import utilities.Variables;

import java.net.URL;
import java.time.Duration;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class BaseTest extends Variables {
    @BeforeClass
    public void setup(){
        DEVICE_NAME = "SM-G960F";
        UDID = "2460f131fc1c7ece";
        PLATFORM_NAME = "Android";
        PLATFORM_VERSION = "10";
        APP_PACKAGE = "com.adidas.app";
        APP_ACTIVITY = "com.adidas.intro.IntroActivity";
        URL_PATH = "http://127.0.0.1:4723/wd/hub";
        TIMEOUT = 30;
        SEARCH_TERM = "shoes";
        REGISTRATION_DATA_FILE_PATH = ".\\files\\next-registration.xlsx";
        initApp();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    private void initApp() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, UDID);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
            desiredCapabilities.setCapability("appPackage", APP_PACKAGE);
            desiredCapabilities.setCapability("appActivity", APP_ACTIVITY);
            URL url = new URL(URL_PATH);
            driver = new AndroidDriver(url, desiredCapabilities);
            actions = new Actions(driver);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        ManagePages.initPages();
    }
}
