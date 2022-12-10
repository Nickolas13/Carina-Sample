package com.qaprosoft.carina.nerdwallet.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class ComparisonTab extends AbstractUIObject {

    @FindBy(xpath = "//button[@id='%s']")
    ExtendedWebElement chooseItem;

    @FindBy(xpath = "//div[@id=\"%s\"]")
    ExtendedWebElement panel;

    @FindBy(xpath = "//div[@id=\"%s\"]//a")
    ExtendedWebElement compareButton;


    public ComparisonTab(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public enum ComparisonItems {
        CREDIT_CARDS("credit_cards"),
        BANKING("banking"),
        TRAVEL("travel"),
        SMALL_BUSINESS("small_business"),
        PERSONAL_LOANS("personal_loans"),
        MORTGAGES("mortgages"),
        INSURANCE("insurance"),
        INVESTING("investing"),
        STUDENT_LOANS("student_loans");

        private String chosenItem;

        ComparisonItems(String chosenItem) {
            this.chosenItem = chosenItem;
        }

        public String getChosenItem() {
            return chosenItem;
        }
    }

    public enum Panels {
        CREDIT_CARDS_PANEL("credit_cards-panel"),
        BANKING_PANEL("banking-panel"),
        TRAVEL_PANEL("travel-panel"),
        SMALL_BUSINESS_PANEL("small_business-panel"),
        PERSONAL_LOANS_PANEL("personal_loans-panel"),
        MORTGAGES_PANEL("mortgages-panel"),
        INSURANCE_PANEL("insurance-panel"),
        INVESTING_PANEL("investing_panel"),
        STUDENT_LOANS_PANEL("student_loans-panel");

        private String chosenPanel;

        Panels(String chosenPanel) {
            this.chosenPanel = chosenPanel;
        }

        public String getChosenPanel() {
            return chosenPanel;
        }
    }


    public boolean isPresentInComparisonTab(ComparisonItems c){
        return chooseItem.format(c.getChosenItem()).isElementPresent();
    }

    public boolean isPanelPresent(Panels p){
        return panel.format(p.getChosenPanel()).isElementPresent();
    }
    public void chooseToCompare(ComparisonItems c){
        chooseItem.format(c.getChosenItem()).click();
    }
    public boolean isCompareButtonPresent(Panels p){
        return compareButton.format(p.getChosenPanel()).isElementPresent();
    }
    public void clickCompareButton(Panels p){
        compareButton.format(p.getChosenPanel()).click();
    }
}
