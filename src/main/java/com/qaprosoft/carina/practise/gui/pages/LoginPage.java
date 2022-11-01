package com.qaprosoft.carina.practise.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"u1\"]")
    ExtendedWebElement userIdInputField;

    @FindBy(xpath = "//*[@id=\"p1\"]")
    ExtendedWebElement userPasswordInputField;

    @FindBy(xpath = "//*[@id=\"Login-1\"]")
    ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserIdInputFieldPresent(){
        return userIdInputField.isElementPresent();
    }

    public boolean isUserPasswordInputFieldPresent(){
        return userPasswordInputField.isElementPresent();
    }
    public boolean isLoginButtonPresent(){
        return loginButton.isElementPresent();
    }
    public void userIdInputFieldType(String keys){
        userIdInputField.type(keys);
    }
    public void userPasswordInputFieldType(String keys){
        userPasswordInputField.type(keys);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
