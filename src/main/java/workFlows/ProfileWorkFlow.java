package workFlows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import static utilities.Variables.*;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ProfileWorkFlow {
    @Step("Login with email: {0} and password: {1}")
    public static void login(String email, String password){
        UIActions.clickElement(homePage.getProfileBtn());
        UIActions.clickElement(profilePage.getLoginBtn());
        UIActions.clickElement(profilePage.getEmailBtn());
        UIActions.sendKeysToElement(profilePage.getEmailBox(), email);
        UIActions.clickElement(profilePage.getActionBtn());
        UIActions.sendKeysToElement(profilePage.getPasswordBox(), password);
        UIActions.clickElement(profilePage.getSignInBtn());
    }

    @Step("Close profile page")
    public static void closeProfilePage(){
        UIActions.clickElement(profilePage.getCloseBtn());
    }

    @Step("Verify logged in")
    public static void verifyLoggedIn(String str){
        Verifications.verifyTextEquals(profilePage.getHeaderTitle().getText().toLowerCase(), str);
    }
}
