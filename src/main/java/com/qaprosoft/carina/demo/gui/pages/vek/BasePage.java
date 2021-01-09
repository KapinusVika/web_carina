package com.qaprosoft.carina.demo.gui.pages.vek;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.compare.PopularPrimeryComponent;
import com.qaprosoft.carina.demo.gui.components.compare.ReviewsComponent;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BasePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasePage.class);

    @FindBy(className = "logotype")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//ul[@class ='b-foreign_goods']/li")
    private List<PopularPrimeryComponent> primeryComponents;

    public BasePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://21vek.by");
    }

    @Override
    public boolean isPageOpened() {
        return logo.isPresent() && primeryComponents.size() > 0;
    }


    public PopularItemPage openItemFromPrimaryPane(String title) {

        for (PopularPrimeryComponent component : primeryComponents) {
            if (component.getName().equals(title)) {
                return component.navigateTo();
            }
        }
        throw new NoSuchElementException(String.format("The item with title '%s' not found!", title));
    }

    public PopularItemPage openRew(String title) {

        for (PopularPrimeryComponent component : primeryComponents) {
            if (component.getName().equals(title)) {
                return component.navigateTo();
            }
        }
        throw new NoSuchElementException(String.format("The item with title '%s' not found!", title));

    }




}
