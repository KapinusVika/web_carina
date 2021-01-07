package com.qaprosoft.carina.demo.gui.pages.vek;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PopularItemPage extends AbstractPage {


    @FindBy(className = "g-price item__price cr-price__in")
    private ExtendedWebElement price;

    @FindBy(className = "reviews-rate cr-reviews-rate-5")
    private ExtendedWebElement reviewsFiveStars;

    public PopularItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return price.isPresent();
    }

    public int getReviewsFiveStarsCount() {
        return Integer.parseInt(reviewsFiveStars.getText());
    }
}
