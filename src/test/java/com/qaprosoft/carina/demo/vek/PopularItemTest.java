package com.qaprosoft.carina.demo.vek;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.vek.BasePage;
import com.qaprosoft.carina.demo.gui.pages.vek.PopularItemPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopularItemTest extends BaseTest{
    private static final String ITEM_EXPECTED =
            "Xiaomi Mi True Wireless Earbuds Basic 2 / BHR4272GL/TWSEJ061LS (черный)";

    @Test(description = "The proper item opened correct")
    @MethodOwner(owner = "kapinus")
    public void testOpenArticle() {
        BasePage homePage = openHomePage(getDriver());
        PopularItemPage itemPage = homePage.openItemFromPrimaryPane(ITEM_EXPECTED);
        Assert.assertTrue(itemPage.isPageOpened(), "Item Page was not opened!");
    }
}
