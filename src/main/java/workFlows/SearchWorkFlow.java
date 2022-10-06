package workFlows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;

import static utilities.Variables.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class SearchWorkFlow {
    @Step("Search term: {0}")
    public static void searchTerm(String str){
        UIActions.clickElement(homePage.getSearchBtn());
        UIActions.sendKeysToElement(searchPage.getSearchBar(), str);
        UIActions.hideKeyboard();
    }

    @Step("Search product")
    public static void searchProduct(){
       clickOnShoesButton();
       clickOnAllShoesButton();
    }

    @Step("Click on like first result")
    public static void clickLikeFirstProduct(){
        UIActions.clickElement(searchPage.getFirstItemLikeBtn());
    }

    @Step("Choose women shoes")
    public static void chooseWomenShoes(){
        UIActions.clickElement(searchPage.getWomenShoesBtn());
    }

    @Step("Click on first result")
    public static void clickOnFirstResult(){
        UIActions.clickElement(searchPage.getFirstItemTitle());
    }

    @Step("Verify header")
    public static void verifyHeader(String str){
        Verifications.verifyTextContains(searchPage.getHeader().getText(), str);
    }

    @Step("Verify plpTitle")
    public static void verifyPlpTitle(String str){
        Verifications.verifyTextContains(searchPage.getPlpTitle().getText(), str);
    }

    @Step("Verify first result")
    public static void verifyFirstResult(String str){
        Verifications.verifyTextContains(searchPage.getFirstItemTitle().getText(), str);
    }

    @Step("Verify product name contains: {0}")
    public static void verifyProductName(String str){
        Verifications.verifyTextContains(productPage.getProductName().getText(), str);
    }

    @Step("Verify product price is displayed")
    public static void verifyProductPrice(){
        Verifications.verifyElementIsDisplayed(productPage.getProductPrice());
    }

    @Step("Verify count liked items equal: {0}")
    public static void verifyCountLikedItems(String str){
        Verifications.verifyTextEquals(searchPage.getCountLikedItems().getText(), str);
    }

    private static void clickOnShoesButton(){
        UIActions.clickElement(shoppingCartPage.getShoesBtn());
    }

    private static void clickOnAllShoesButton(){
        UIActions.clickElement(shoppingCartPage.getAllShoesBtn());
    }
}
