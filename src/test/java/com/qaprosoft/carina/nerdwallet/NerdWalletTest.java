package com.qaprosoft.carina.nerdwallet;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.nerdwallet.gui.components.ComparisonTab;
import com.qaprosoft.carina.nerdwallet.gui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NerdWalletTest implements IAbstractTest {

    @Test(groups = "comparisonTab")
    public void comparison(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home Page isn't opened");
        ComparisonTab comparisonTab = homePage.getComparisonTab();
        Assert.assertTrue(comparisonTab.isPresentInComparisonTab(ComparisonTab.ComparisonItems.MORTGAGES),"Specified item isn't present");
        comparisonTab.chooseToCompare(ComparisonTab.ComparisonItems.MORTGAGES);
        Assert.assertTrue(comparisonTab.isCompareButtonPresent(ComparisonTab.Panels.MORTGAGES_PANEL),"Compare button isn't present");
        comparisonTab.clickCompareButton(ComparisonTab.Panels.MORTGAGES_PANEL);
    }
}
