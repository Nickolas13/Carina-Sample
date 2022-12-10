package com.qaprosoft.carina.nerdwallet.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.nerdwallet.gui.components.ComparisonTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    @FindBy(xpath = "//div[@id=\"verticalComparisonTab\"]")
    private ComparisonTab comparisonTab;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.nerdwallet.com/?trk=nw_gn_5.0");
    }

    public ComparisonTab getComparisonTab(){
        return comparisonTab;
    }


}
