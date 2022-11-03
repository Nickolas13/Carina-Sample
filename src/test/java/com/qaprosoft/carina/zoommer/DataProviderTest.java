package com.qaprosoft.carina.zoommer;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.users.User;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends AbstractTest {
    @DataProvider(name = "dprovider")
    public Object[][] dpMethod(){
        return new Object[][] {
                {new User("nika","nika")},
                {new User("gigi","gigi")}};
    }



    @Test(dataProvider = "dprovider")
    public void TestLogin(User user){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(),"Welcome page hasn't opened");
        Assert.assertTrue(welcomePage.isClickNextBtnPresent(),"next button isn't present");
        LoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertFalse(loginPage.isLoginBtnActive(),"Login button shouldn't be active");
        Assert.assertTrue(loginPage.isNameInputFieldPresent(),"name input field isn't present");
        Assert.assertTrue(loginPage.isPasswordInputFieldPresent(),"password input field isn't present");
        loginPage.typeCredentials(user);

        Assert.assertTrue(loginPage.isSelectMaleSexPresent(),"male gender selection isn't present");
        loginPage.selectMaleSex();

        Assert.assertTrue(loginPage.isCheckPrivacyPolicyCheckboxPresent(),"privacy/policy checkbox isn't present");
        loginPage.checkPrivacyPolicyCheckbox();

        CarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(), "description page isn't opened");

    }


}


