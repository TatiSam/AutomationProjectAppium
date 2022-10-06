package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ShoppingCartPage {
    @FindBy(id = "com.adidas.app:id/productsAmount")
    private WebElement productsAmount;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Shop\"]/android.widget.FrameLayout/android.widget.ImageView")
    private WebElement searchBtn;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View" +
            "/android.view.View/android.view.View/android.widget.TextView[1]")
    private WebElement shoesBtn;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[1]")
    private WebElement allShoesBtn;

    @FindBy(id = "com.adidas.app:id/moreOptionImage")
    private WebElement moreOptionBtn;

    @FindBy(xpath = "//android.widget.TextView[4]")
    private WebElement removeBtn;

    public WebElement getProductsAmount() {
        return productsAmount;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getShoesBtn() {
        return shoesBtn;
    }

    public WebElement getAllShoesBtn() {
        return allShoesBtn;
    }

    public WebElement getMoreOptionBtn() {
        return moreOptionBtn;
    }

    public WebElement getRemoveBtn() {
        return removeBtn;
    }
}
