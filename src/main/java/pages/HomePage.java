package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class HomePage {
    @FindBy(id = "com.adidas.app:id/browseIcon")
    private WebElement searchBtn;

    @FindBy(id = "com.adidas.app:id/profileButton")
    private WebElement profileBtn;

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getProfileBtn() {
        return profileBtn;
    }
}
