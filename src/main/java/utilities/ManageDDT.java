package utilities;

import org.testng.annotations.DataProvider;

/**
 * @author Tatiana Samoilenko, Sep 2022
 * @project QA-Automation next.co.il
 */
public class ManageDDT {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData(){
        return new Object[][] {
                {"********", "********"}
        };
    }
}
