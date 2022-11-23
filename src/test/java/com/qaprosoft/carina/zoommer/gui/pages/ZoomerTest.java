package com.qaprosoft.carina.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.zoommer.gui.components.Compare;
import com.qaprosoft.carina.zoommer.gui.components.Language;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ZoomerTest extends AbstractTest {

    @BeforeMethod
    public void ChangeLanguage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page isn't opened");
        Assert.assertTrue(homePage.isAcceptCookiePresent(),"Cookie agreement button isn't present");
        homePage.clickAcceptCookie();

        //change language to russian
        Assert.assertTrue(homePage.isLanguagesMenuButtonPresent(),"Languages Menu isn't present");
        homePage.hoverLanguagesMenubutton();
        homePage.selectLanguage(Language.RUSSIAN);

    }

    @Test
    public void TestFilterIphonesByCurrentYear(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Page isn't opened");
//        for(int i = 0; i < homePage.areNavigationBarElementsPresent().length; i++){
//            Assert.assertTrue(homePage.areNavigationBarElementsPresent()[i],"N"+i+" element isn't present");
//        }

        //element 0 is mobile phone
        homePage.hoverNavigationBarElement(0);
        Assert.assertTrue(homePage.isBrandApplePresent(),"Phone brand Apple isn't present");
        ApplePhonesPage applePhonesPage = homePage.clickBrandApple();
        Assert.assertTrue(applePhonesPage.isSeeMoreReleaseYearsPresent(),"See more button isn't present");
        applePhonesPage.clickSeeMoreReleaseYears();
        Assert.assertTrue(applePhonesPage.isCurrentYearChoicePresent(),"Current year isn't present in choices");
        applePhonesPage.clickCurrentYear();
    }



    @Test
    public void TestFilterIphonesByRam(){
        HomePage homePage = new HomePage(getDriver());


        homePage.hoverNavigationBarElement(0);

        Assert.assertTrue(homePage.isBrandApplePresent(),"Phone brand Apple isn't present");
        ApplePhonesPage applePhonesPage = homePage.clickBrandApple();
        Assert.assertTrue(applePhonesPage.isRamMemory4GbPresent(),"4gb Ram isn't present");
        applePhonesPage.clickRamMemory4Gb();
    }

    @Test
    public void TestFindIphoneWithSpecificStorage(){
        HomePage homePage = new HomePage(getDriver());

        homePage.hoverNavigationBarElement(0);
        Assert.assertTrue(homePage.isBrandApplePresent(),"Phone brand Apple isn't present");
        ApplePhonesPage applePhonesPage = homePage.clickBrandApple();
        Assert.assertTrue(applePhonesPage.isPhoneMemory256Present(),"Phone memory 256gb isn't present");
        applePhonesPage.clickPhoneMemory256();
        Assert.assertTrue(applePhonesPage.isIphone14Present(),"iphone 14 isn't present");
        applePhonesPage.scrollToIphone14();
        applePhonesPage.clickIphone14();
    }

    @Test
    public void TestCompareTwoPhones(){
        HomePage homePage = new HomePage(getDriver());

        Assert.assertTrue(homePage.isCompareButtonPresent(),"compare button isn't present");

        Compare compare = homePage.clickCompareButton();
        Assert.assertTrue(compare.isAddProductButtonPresent(),"add product button isn't present");
        compare.clickAddProductButton();

        Assert.assertTrue(compare.isDeviceSearchBarPresent(),"Device search bar isn't present");
        compare.deviceSearchBarType("Samsung galaxy s22");

        Assert.assertTrue(compare.isSearchedSamsungPresent(),"Samsung isn't present in results");
        compare.chooseSearchedSamsung();

        Assert.assertTrue(compare.isAddProductButtonPresent(),"add product button isn't present");
        compare.clickAddProductButton();
        Assert.assertTrue(compare.isDeviceSearchBarPresent(),"Device search bar isn't present");
        compare.deviceSearchBarType("Iphone 14");

        Assert.assertTrue(compare.isSearchedIphonePresent(),"iphone isn't present in results");
        compare.chooseSearchedIphone();

        Assert.assertTrue(compare.isStartCompareButtonPresent(),"start compare isn't present");
        compare.clickStartCompareButton();
    }

//    @Test
//    public void TestComparingPage(){
//        ComparePage comparePage = new ComparePage(getDriver());
//        comparePage.open();
//        Assert.assertTrue(comparePage.isPageOpened(),"Page isn't opened");
//
//        //change language to russian
//        Assert.assertTrue(comparePage.isLanguagesMenuButtonPresent(),"Languages Menu isn't present");
//        comparePage.hoverLanguagesMenubutton();

//
//
//        //add samsung to comparison
//        Assert.assertTrue(comparePage.isAddDeviceButtonPresent(),"Add product button isn't present");
//        Compare compare = comparePage.clickAddDeviceButton();
//        Assert.assertTrue(compare.isDeviceSearchBarPresent(),"device search bar isn't present");
//        compare.deviceSearchBarType("Samsung Galaxy S22");
//        Assert.assertTrue(compare.isSearchedSamsungPresent(),"Samsung galaxy s22 isn't present");
//        compare.chooseSearchedSamsung();
//
//        //add iphone to comparison
//        Assert.assertTrue(comparePage.isAddDeviceButtonPresent(),"Add product button isn't present");
//        comparePage.clickAddDeviceButton();
//        Assert.assertTrue(compare.isDeviceSearchBarPresent(),"device search bar isn't present");
//        compare.deviceSearchBarType("Iphone 14");
//        Assert.assertTrue(compare.isSearchedIphonePresent(),"Iphone 14 isn't present");
//        compare.chooseSearchedIphone();
//
//        Assert.assertTrue(comparePage.isShowDifferencesButtonPresent(),"differences button isn't present");
//        comparePage.clickShowDifferencesButton();
//        pause(7);
//
//    }

}