package workFlows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;

import static utilities.Variables.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ShoppingWorkFlow {
    @Step("Choose size")
    public static void chooseSize(){
        UIActions.clickElement(productPage.getSelectSizeBtn());
        UIActions.clickElement(productPage.getAddToBagBtn());
    }

    @Step("Remove product")
    public static void removeProduct(){
        UIActions.clickElement(shoppingCartPage.getMoreOptionBtn());
        UIActions.clickElement(shoppingCartPage.getRemoveBtn());
    }

    @Step("Go to shopping bag")
    public static void goToShoppingBag(){
        UIActions.clickElement(productPage.getViewBagBtn());
    }

    @Step("Go back")
    public static void goBack(){
        UIActions.goBack();
    }

    @Step("Click on search button")
    public static void clickOnSearchButton(){
        UIActions.clickElement(shoppingCartPage.getSearchBtn());
    }

    @Step("Verify added to bag")
    public static void verifyAddedToBag(){
        Verifications.verifyElementIsDisplayed(productPage.getAddedToBagTitle());
    }

    @Step("Verify products amount equal to: {0}")
    public static void verifyProductsAmount(String str){
        Verifications.verifyTextEquals(shoppingCartPage.getProductsAmount().getText(), str);
    }
}
