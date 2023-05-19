package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;
import pages.teachaway.BasePage;

import java.time.temporal.ChronoUnit;

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


}
