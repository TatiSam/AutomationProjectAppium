package workFlows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;

import static utilities.Variables.introPage;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class IntroWorkFlow {
    @Step("Choose country Canada")
    public static void countryChoice(){
        UIActions.clickElement(introPage.getCanadaCheckBox());
        UIActions.clickElement(introPage.getChangeCountryBtn());
    }

    @Step("Allow permission")
    public static void allowPermission(){
        UIActions.clickElement(introPage.getEnableLocationBtn());
        UIActions.clickElement(introPage.getPermission());
    }

    @Step("Choose preferences")
    public static void preferencesChoice(){
        UIActions.clickElement(introPage.getWomenWearBtn());
        UIActions.clickElement(introPage.getWhatsNewBtn());
    }

    @Step("Verify page contains: {0}")
    public static void verifyPageContainKeepItLocal(String str){
        Verifications.verifyTextEquals(introPage.getKeepItLocalStr().getText().toLowerCase(), str);
    }

    @Step("Verify page contains: {0}")
    public static void verifyPageContainSetYourPreferences(String str){
        Verifications.verifyTextContains(introPage.getSetPreferencesStr().getText().toLowerCase(), str);
    }
}
