package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class IntroPage {
    @FindBy(xpath = "//android.view.ViewGroup[6]/android.widget.RadioButton")
    private WebElement canadaCheckBox;

    @FindBy(id = "com.adidas.app:id/introScreenGetStarted")
    private WebElement changeCountryBtn;

    @FindBy(id = "com.adidas.app:id/requestPermissionTitle")
    private WebElement keepItLocalStr;

    @FindBy(id = "com.adidas.app:id/requestPermission")
    private WebElement enableLocationBtn;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement permission;

    @FindBy(id = "com.adidas.app:id/shoppingPreferenceTitle")
    private WebElement setPreferencesStr;

    @FindBy(id = "com.adidas.app:id/shopping_preference_radio_group_female")
    private WebElement womenWearBtn;

    @FindBy(id = "com.adidas.app:id/whats_new_button")
    private WebElement whatsNewBtn;

    public WebElement getCanadaCheckBox() {
        return canadaCheckBox;
    }

    public WebElement getChangeCountryBtn() {
        return changeCountryBtn;
    }

    public WebElement getKeepItLocalStr() {
        return keepItLocalStr;
    }

    public WebElement getEnableLocationBtn() {
        return enableLocationBtn;
    }

    public WebElement getPermission() {
        return permission;
    }

    public WebElement getSetPreferencesStr() {
        return setPreferencesStr;
    }

    public WebElement getWomenWearBtn() {
        return womenWearBtn;
    }

    public WebElement getWhatsNewBtn() {
        return whatsNewBtn;
    }
}
