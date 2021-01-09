package com.qaprosoft.carina.demo.gui.components.compare;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.vek.PopularItemPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class PopularPrimeryComponent extends AbstractUIObject {

    @FindBy(xpath = "//span[@class = 'foreign_goods__name-main']")
    private ExtendedWebElement titleLabel;

    public PopularPrimeryComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getName() {
        titleLabel.assertElementPresent(18);
        return titleLabel.getText();
    }

    public PopularItemPage navigateTo() {
        titleLabel.click();
        return new PopularItemPage(this.driver);
    }

}
