package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ProfilePage {
    @FindBy(id = "com.adidas.app:id/login")
    private WebElement loginBtn;

    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'Email')]")
    private WebElement emailBtn;

    @FindBy(xpath = "//android.widget.EditText[contains(@text, 'Email')]")
    private WebElement emailBox;

    @FindBy(id = "com.adidas.app:id/formFieldActionContainer")
    private WebElement actionBtn;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.EditText")
    private WebElement passwordBox;

    @FindBy(id = "com.adidas.app:id/adidasStatefulInternalButton")
    private WebElement signInBtn;

    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'MY ACCOUNT')]")
    private WebElement headerTitle;

    @FindBy(xpath = "//android.view.View[1]/android.view.View[2]")
    private WebElement closeBtn;

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getEmailBtn() {
        return emailBtn;
    }

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getActionBtn() {
        return actionBtn;
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    public WebElement getSignInBtn() {
        return signInBtn;
    }

    public WebElement getHeaderTitle() {
        return headerTitle;
    }

    public WebElement getCloseBtn() {
        return closeBtn;
    }
}
