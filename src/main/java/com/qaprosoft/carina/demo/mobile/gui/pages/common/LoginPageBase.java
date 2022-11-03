package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.demo.mobile.gui.pages.android.users.User;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoginPageBase extends AbstractPage {

	public LoginPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void typeName(String name);

	public abstract void typePassword(String password);

	public abstract void typeCredentials(User user);

	public abstract boolean isSelectMaleSexPresent();

	public abstract boolean isNameInputFieldPresent();

	public abstract boolean isPasswordInputFieldPresent();

	public abstract boolean isCheckPrivacyPolicyCheckboxPresent();

	public abstract void selectMaleSex();

	public abstract void checkPrivacyPolicyCheckbox();

	public abstract CarinaDescriptionPageBase clickLoginBtn();

	public abstract boolean isLoginBtnActive();

	public abstract CarinaDescriptionPageBase login();

}
