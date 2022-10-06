package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ProductPage {
    @FindBy(id = "com.adidas.app:id/tvProductName")
    private WebElement productName;

    @FindBy(id = "com.adidas.app:id/tvProductCurrentPrice")
    private WebElement productPrice;

    @FindBy(id = "com.adidas.app:id/anchoredButton")
    private WebElement selectSizeBtn;

    @FindBy(id = "com.adidas.app:id/adidasStatefulInternalButton")
    private WebElement addToBagBtn;

    @FindBy(xpath = "//android.view.View/android.widget.TextView[1]")
    private WebElement addedToBagTitle;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button")
    private WebElement viewBagBtn;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getSelectSizeBtn() {
        return selectSizeBtn;
    }

    public WebElement getAddToBagBtn() {
        return addToBagBtn;
    }

    public WebElement getAddedToBagTitle() {
        return addedToBagTitle;
    }

    public WebElement getViewBagBtn() {
        return viewBagBtn;
    }
}
