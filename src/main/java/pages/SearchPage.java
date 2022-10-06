package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class SearchPage {
    @FindBy(id = "com.adidas.app:id/searchInputField")
    private WebElement searchBar;

    @FindBy(id = "com.adidas.app:id/tvHeader")
    private WebElement header;

    @FindBy(id = "com.adidas.app:id/tvPlpTitle")
    private WebElement plpTitle;

    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup" +
            "/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    private WebElement womenShoesBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[2]/android.view.ViewGroup" +
            "/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView" +
            "/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement firstItemTitle;

    @FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.ToggleButton")
    private WebElement firstItemLikeBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Wishlist\"]/android.widget.TextView")
    private WebElement countLikedItems;

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getWomenShoesBtn() {
        return womenShoesBtn;
    }

    public WebElement getPlpTitle() {
        return plpTitle;
    }

    public WebElement getFirstItemTitle() {
        return firstItemTitle;
    }

    public WebElement getFirstItemLikeBtn() {
        return firstItemLikeBtn;
    }

    public WebElement getCountLikedItems() {
        return countLikedItems;
    }
}
