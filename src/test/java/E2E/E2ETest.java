package E2E;

import base.BaseTest;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import utilities.ManageDDT;
import utilities.Variables;
import workFlows.IntroWorkFlow;
import workFlows.ProfileWorkFlow;
import workFlows.SearchWorkFlow;
import workFlows.ShoppingWorkFlow;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class E2ETest extends BaseTest {

    @Test(description = "Start with Intro Activity")
    public void test0001(){
        try {
            IntroWorkFlow.countryChoice();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        IntroWorkFlow.verifyPageContainKeepItLocal("keep it local");
        IntroWorkFlow.allowPermission();
        IntroWorkFlow.verifyPageContainSetYourPreferences("set your shopping preference");
        IntroWorkFlow.preferencesChoice();
    }

    @Test(description = "Login", dataProvider = "loginData", dataProviderClass = ManageDDT.class)
    public void test0002(String email, String password){
        ProfileWorkFlow.login(email, password);
        ProfileWorkFlow.verifyLoggedIn("my account");
        ProfileWorkFlow.closeProfilePage();
    }

    @Test(description = "Search term")
    public void test0003(){
        SearchWorkFlow.searchTerm(Variables.SEARCH_TERM);
        SearchWorkFlow.verifyHeader("products");
    }

    @Test(description = "Choose category")
    public void test0004(){
        SearchWorkFlow.chooseWomenShoes();
        SearchWorkFlow.verifyPlpTitle("women shoes");
        SearchWorkFlow.verifyFirstResult(Variables.SEARCH_TERM);
    }

    @Test(description = "Like first result")
    public void test0005(){
        SearchWorkFlow.clickLikeFirstProduct();
        SearchWorkFlow.verifyCountLikedItems("1");
    }

    @Test(description = "First result of search term")
    public void test0006(){
        SearchWorkFlow.clickOnFirstResult();
        SearchWorkFlow.verifyProductName(Variables.SEARCH_TERM);
        SearchWorkFlow.verifyProductPrice();
    }

    @Test(description = "Add first product to shopping cart")
    public void test0007(){
        ShoppingWorkFlow.chooseSize();
        ShoppingWorkFlow.verifyAddedToBag();
        ShoppingWorkFlow.goToShoppingBag();
        ShoppingWorkFlow.verifyProductsAmount("1 item");
    }

    @Test(description = "Search another product")
    public void test0008(){
        ShoppingWorkFlow.clickOnSearchButton();
        SearchWorkFlow.searchProduct();
        SearchWorkFlow.verifyFirstResult(Variables.SEARCH_TERM);
    }

    @Test(description = "First result of another product")
    public void test0009(){
        SearchWorkFlow.clickOnFirstResult();
        SearchWorkFlow.verifyProductName(Variables.SEARCH_TERM);
        SearchWorkFlow.verifyProductPrice();
    }

    @Test(description = "Add another product to shopping cart")
    public void test0010(){
        ShoppingWorkFlow.chooseSize();
        ShoppingWorkFlow.verifyAddedToBag();
        ShoppingWorkFlow.goToShoppingBag();
        ShoppingWorkFlow.verifyProductsAmount("2 items");
    }

    @Test(description = "Remove product from shopping cart")
    public void test0011(){
        ShoppingWorkFlow.removeProduct();
        ShoppingWorkFlow.verifyProductsAmount("1 item");
    }
}
