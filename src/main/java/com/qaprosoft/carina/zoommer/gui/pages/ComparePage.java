package com.qaprosoft.carina.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.zoommer.gui.components.Compare;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[7]/header/div[1]/div/div[2]/div[1]/div")
    ExtendedWebElement languagesMenuButton;

    @FindBy(css = "a[title='RUSSIAN']")
    ExtendedWebElement selectRussian;

    @FindBy(className = "add-text")
    ExtendedWebElement addDeviceButton;

    @FindBy(xpath = "//*[@id=\"diffbtn\"]")
    ExtendedWebElement showDifferencesButton;

    @FindBy(css = "div[id='eu-cookie-ok']")
    ExtendedWebElement acceptCookie;

    public ComparePage(WebDriver driver) {
        super(driver);
        setPageURL("https://zoommer.ge/compareproducts");
    }

    public boolean isAddDeviceButtonPresent(){
        return addDeviceButton.isElementPresent();
    }
    public boolean isShowDifferencesButtonPresent(){
        return showDifferencesButton.isElementPresent();
    }
    public boolean isSelectRussianPresent(){
        return selectRussian.isElementPresent();
    }

    public boolean isLanguagesMenuButtonPresent(){
        return languagesMenuButton.isElementPresent();
    }

    public void hoverLanguagesMenubutton(){
        languagesMenuButton.hover();
    }
    public void clickSelectRussian(){
        selectRussian.click();
    }

    public Compare clickAddDeviceButton(){
        addDeviceButton.click();
        return new Compare(getDriver());
    }
    public void clickShowDifferencesButton(){
        showDifferencesButton.click();
    }
    public boolean isAcceptCookiePresent(){
        return acceptCookie.isElementPresent();
    }
    public void clickAcceptCookie(){
        acceptCookie.click();
    }
}
