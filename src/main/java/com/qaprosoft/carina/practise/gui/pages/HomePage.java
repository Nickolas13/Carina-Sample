package com.qaprosoft.carina.practise.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"wrapper\"]/nav/div/ul[2]/li[1]/a/b")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/nav/div/ul[2]/li[1]/ul/li[1]/a")
    ExtendedWebElement studentButton;

    @FindBy(xpath = "/html/body/div[2]/nav/div/ul[2]/li[3]/a/img")
    ExtendedWebElement changeLanguageToEnglishIcon;

    @FindBy(xpath = "/html/body/div[2]/nav/div/ul[1]/li[1]/a/i")
    ExtendedWebElement sideBarButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://portal.bsu.edu.ge/");
    }
    public boolean isSideBarButtonPresent(){
        return sideBarButton.isElementPresent();
    }
    public void clickSideBarButton(){
        sideBarButton.click();
    }
    public boolean isLoginButtonPresent(){
        return loginButton.isElementPresent();
    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public boolean isStudentButtonPresent(){
        return studentButton.isElementPresent();
    }
    public boolean isChangeLanguageToEnglishPresent(){
        return changeLanguageToEnglishIcon.isElementPresent();
    }
    public void clickChangeLanguageToEnglishIcon(){
        changeLanguageToEnglishIcon.click();
    }
    public LoginPage clickStudentButton(){
        studentButton.click();
        return new LoginPage(getDriver());
    }




}
