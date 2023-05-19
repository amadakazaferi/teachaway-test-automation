package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import pages.teachaway.BasePage;
import steps.MegaMenuUser;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.settings.TeachAwaySettings.teachAwayBaseUrl;

public class MegaMenuSteps  {

    private BasePage basePage;
    @Steps(shared = true)
    private MegaMenuUser megaMenuUser;

    @Given("a user navigates to Teach Away website")
    public void userNavigateToPage() {
        basePage.navigateTo(teachAwayBaseUrl);
    }

    @When("the user is located to the mega menu")
    public void userHoverOnMegaMenu() {
        megaMenuUser.hoverOnMenu();
    }

    @Then("all the {int} items are displayed correctly in this order")
    public void allTheItemsAreDisplayedCorrectlyInThisOrder(int itemsNumber, List<List<String>> dataTable) {

        int megaMenuItemsNr = basePage.getMegaMenuNav0Items().size();
        assertEquals(itemsNumber, megaMenuItemsNr);

        List<String> items = dataTable.get(0);
        int index = 0;
        List<WebElementFacade> nav1Items = basePage.getMegaMenuNav0Items();
        for (WebElementFacade item : nav1Items) {
             assertEquals(item.getText(), basePage.getNav1Item(items.get(index)).getText());
             index++;
        }

    }
}
