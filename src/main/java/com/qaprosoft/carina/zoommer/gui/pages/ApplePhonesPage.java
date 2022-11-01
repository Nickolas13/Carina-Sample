package com.qaprosoft.carina.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ApplePhonesPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[11]/label[2]")
    ExtendedWebElement ramMemory4Gb;

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[10]/label[3]")
    ExtendedWebElement phoneMemory256;

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[1]/a")
    ExtendedWebElement seeMoreReleaseYears;

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[1]/label[5]")
    ExtendedWebElement currentYearChoice;

    @FindBy(xpath = "//*[@id=\"js-filter-cont\"]/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/a/h4")
    ExtendedWebElement iphone14;

    public ApplePhonesPage(WebDriver driver) {
        super(driver);
    }
    public boolean isIphone14Present(){
        return iphone14.isElementPresent();
    }
    public void scrollToIphone14(){
        iphone14.scrollTo();
    }
    public void clickIphone14(){
        iphone14.click();
    }
    public boolean isRamMemory4GbPresent(){
        return ramMemory4Gb.isElementPresent();
    }
    public boolean isPhoneMemory256Present(){
        return phoneMemory256.isElementPresent();
    }
    public boolean isSeeMoreReleaseYearsPresent(){
        return seeMoreReleaseYears.isElementPresent();
    }
    public boolean isCurrentYearChoicePresent(){
        return currentYearChoice.isElementPresent();
    }
    public void clickRamMemory4Gb(){
        ramMemory4Gb.click();
    }
    public void clickPhoneMemory256(){
        phoneMemory256.click();
    }
    public void clickSeeMoreReleaseYears(){
        seeMoreReleaseYears.click();
    }
    public void clickCurrentYear(){
        currentYearChoice.click();
    }


}
