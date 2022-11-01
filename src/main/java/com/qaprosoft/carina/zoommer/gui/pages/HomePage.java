package com.qaprosoft.carina.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.zoommer.gui.components.Compare;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractPage {

    @FindBy(className = "compare-button")
    ExtendedWebElement compareButton;

    @FindBy(xpath = "/html/body/div[7]/header/div[1]/div/div[2]/div[1]/div")
    ExtendedWebElement languagesMenuButton;

    @FindBy(css = "a[title='RUSSIAN']")
    ExtendedWebElement selectRussian;

//    //Navigation Bat Elements
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a")
//    ExtendedWebElement mobilePhones;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")
//    ExtendedWebElement tabsAccessories;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")
//    ExtendedWebElement laptopsIT;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[4]/a")
//    ExtendedWebElement audioSystems;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[5]/a")
//    ExtendedWebElement gaming;
//
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[6]/a")
//    ExtendedWebElement tvMonitors;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[7]/a")
//    ExtendedWebElement digitalVideoCameras;
//
//    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li[8]/a")
//    ExtendedWebElement smartHome;
    @FindBy(css = "div[id='eu-cookie-ok']")
    ExtendedWebElement acceptCookie;
    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li")
    List<ExtendedWebElement> navigationBar;

    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[2]/div/ul[1]/div/li[2]/a")
    ExtendedWebElement brandApple;


    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://zoommer.ge");
    }

    public boolean isCompareButtonPresent(){
        return compareButton.isElementPresent();
    }
    public Compare clickCompareButton(){
        compareButton.click();
        return new Compare(getDriver());
    }
    public void hoverNavigationBarElement(int index){
        navigationBar.get(index).hover();
    }

    public void clickNavigationBarElement(int index){
        navigationBar.get(index).click();
    }
    public boolean isBrandApplePresent(){
        return brandApple.isElementPresent();
    }
    public ApplePhonesPage clickBrandApple(){
        brandApple.click();
        return new ApplePhonesPage(getDriver());
    }

    public boolean[] areNavigationBarElementsPresent(){
        boolean[] elementsPresent = new boolean[navigationBar.size()];
        for(int i = 0; i < navigationBar.size(); i++){
            elementsPresent[i] = navigationBar.get(i).isElementPresent() ? true : false;
        }
        return elementsPresent;

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

    public boolean isAcceptCookiePresent(){
        return acceptCookie.isElementPresent();
    }
    public void clickAcceptCookie(){
        acceptCookie.click();
    }
}
