package com.qaprosoft.carina.demo.vek;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.vek.BasePage;
import com.qaprosoft.carina.demo.gui.pages.vek.PopularItemPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopularItemTest extends BaseTest{
    private static final String ITEM_EXPECTED =
            "Фитнес-трекер Xiaomi Mi Smart Band 5 / BHR4219RU";

    @Test(description = "The proper item opened correct")
    @MethodOwner(owner = "kapinus")
    public void testOpenItem() {
        BasePage homePage = openHomePage(getDriver());
        PopularItemPage itemPage = homePage.openItemFromPrimaryPane(ITEM_EXPECTED);
        Assert.assertTrue(itemPage.isPageOpened(), "Item Page was not opened!");
    }
}
