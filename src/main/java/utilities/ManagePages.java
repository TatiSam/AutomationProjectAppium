package utilities;

import org.openqa.selenium.support.PageFactory;
import pages.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ManagePages{
    public static void initPages() {
        Variables.introPage = PageFactory.initElements(Variables.driver, IntroPage.class);
        Variables.homePage = PageFactory.initElements(Variables.driver, HomePage.class);
        Variables.profilePage = PageFactory.initElements(Variables.driver, ProfilePage.class);
        Variables.searchPage = PageFactory.initElements(Variables.driver, SearchPage.class);
        Variables.productPage = PageFactory.initElements(Variables.driver, ProductPage.class);
        Variables.shoppingCartPage = PageFactory.initElements(Variables.driver, ShoppingCartPage.class);
    }
}
