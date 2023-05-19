package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;
import pages.teachaway.BasePage;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class MegaMenuUser extends BasePage {

    private BasePage basePage;

    @Step("#actor hover in the menu")
    public void hoverOnMenu() {
        Actions actions = new Actions(basePage.getDriver());
        basePage.setImplicitTimeout(30, ChronoUnit.SECONDS);
        if (basePage.getMegaMenuNav0().isDisplayed())
            actions.moveToElement(basePage.getMegaMenuNav0()).perform();
        basePage.resetImplicitTimeout();
    }

    @Step("#actor clicks on clickable menu items")
    public void clickOnMenuItem(String menuItemName) {
        basePage.setImplicitTimeout(30, ChronoUnit.SECONDS);
        basePage.getNav1Item(menuItemName).waitUntilClickable().click();

//        Actions actions = new Actions(basePage.getDriver());
//        List<WebElementFacade> nav1Items = basePage.getMegaMenuNav0Items();
//        for (WebElementFacade item : nav1Items) {
//            if (item.getAttribute("class").contains("dropdown")) {
//                actions.moveToElement(item).perform();
//            } else {
//                item.waitUntilClickable().click();
//            }
//        }
        basePage.resetImplicitTimeout();
    }
}
