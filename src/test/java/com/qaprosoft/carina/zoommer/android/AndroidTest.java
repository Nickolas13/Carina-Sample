package com.qaprosoft.carina.zoommer.android;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.users.User;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.qaprosoft.carina.zoommer.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidTest extends AbstractTest {

    @Test
    public void TestLogin(){
        User user = new User("nika","1148");
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
