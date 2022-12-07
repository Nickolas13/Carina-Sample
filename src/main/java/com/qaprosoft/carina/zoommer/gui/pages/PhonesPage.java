package com.qaprosoft.carina.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.zoommer.gui.components.PhoneSpecs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PhonesPage extends AbstractPage {

//    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[11]/label['%d']")
//    ExtendedWebElement ramMemory;
    @FindBy(xpath = "//h5[contains(text(),\"Оперативная память\")]/following-sibling::div//label[contains(text(),'%s')]")
    ExtendedWebElement ramMemory;

    @FindBy(xpath = "//h5[contains(text(),\"Внутренняя память\")]/following-sibling::div//label[contains(text(),'%s')]")
    ExtendedWebElement phoneMemory;

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[1]/a")
    ExtendedWebElement seeMoreReleaseYears;

    @FindBy(xpath = "//*[@id=\"js-filter-form\"]/div[2]/div[1]/label[5]")
    ExtendedWebElement chooseYear;



    public PhonesPage(WebDriver driver) {
        super(driver);
    }
    public boolean isRamMemoryPresent(PhoneSpecs s){
        ramMemory.format(s.getSpec()).scrollTo();
        return ramMemory.format(s.getSpec()).isElementPresent();
    }
    public boolean isPhoneMemoryPresent(PhoneSpecs s){
        phoneMemory.format(s.getSpec()).scrollTo();
        return phoneMemory.format(s.getSpec()).isElementPresent();
    }
    public boolean isSeeMoreReleaseYearsPresent(){
        return seeMoreReleaseYears.isElementPresent();
    }
    public boolean isChooseYearPresent(){
        return chooseYear.isElementPresent();
    }
    public void chooseRamMemory(PhoneSpecs s){
        ramMemory.format(s.getSpec()).click();
    }
    public void choosePhoneMemory(PhoneSpecs s){
        phoneMemory.format(s.getSpec()).click();
    }
    public void clickSeeMoreReleaseYears(){
        seeMoreReleaseYears.click();
    }
    public void clickChosenYear(){
        chooseYear.click();
    }




}
