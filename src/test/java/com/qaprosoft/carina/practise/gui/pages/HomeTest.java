package com.qaprosoft.carina.practise.gui.pages;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeTest extends AbstractTest {







    @Test(groups = "portalbsu")
    public void TestLoginToStudentAccount() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isChangeLanguageToEnglishPresent(),"ENG lan change icon isn't present");
        homePage.clickChangeLanguageToEnglishIcon();

        assertTrue(homePage.isLoginButtonPresent(),"Home page isn't opened");
        homePage.clickLoginButton();
        assertTrue(homePage.isStudentButtonPresent(),"Student button isn't present");

        LoginPage loginPage = homePage.clickStudentButton();
        assertTrue(loginPage.isUserIdInputFieldPresent(),"UserID input field isn't present");
        loginPage.userIdInputFieldType("4665465465");

        assertTrue(loginPage.isUserPasswordInputFieldPresent(),"password field isn't present");
        loginPage.userPasswordInputFieldType("654654646");

        assertTrue(loginPage.isLoginButtonPresent(),"login button isn't present");
        loginPage.clickLoginButton();
    }

    @Test(groups = "portalbsu")
    public void TestSideBarOpenClose(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isSideBarButtonPresent(),"Sidebar Button isn't present");
        homePage.clickSideBarButton();
    }
}