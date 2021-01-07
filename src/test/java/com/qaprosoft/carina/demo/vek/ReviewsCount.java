package com.qaprosoft.carina.demo.vek;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.vek.BasePage;


import org.testng.annotations.Test;

public class ReviewsCount extends BaseTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testOpenArticle() {
        BasePage homePage = openHomePage(getDriver());

    }
}
