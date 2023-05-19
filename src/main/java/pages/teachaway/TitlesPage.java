package pages.teachaway;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TitlesPage extends BasePage{

    @FindBy(className = "entry-title")
    private WebElementFacade landingPageTitle;

    public WebElementFacade getLandingPageTitle() { return landingPageTitle; }
}
