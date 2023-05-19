package utils.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.teachaway.BasePage;
import steps.MegaMenuUser;

import static utils.settings.TeachAwaySettings.teachAwayBaseUrl;

public class GlobalHooks {
    private static final Logger log = LoggerFactory.getLogger(GlobalHooks.class.getName());
    private BasePage basePage;

    private MegaMenuUser menuUser;

/**The whole idea of the Hooks class is to perform actions,
 * which we need to perform before or after we start the test scenarios
 * the actions most of the cases include Driver instantiation and driver quit,
 * but this action is covered by SerenityBDD library
 * Other actions covered are:
 * the navigation to the Home Page,
 * login, logout from a user account
 * data creation / cleaning for users or products.
 **/

    @Before
    public void before(){
        log.info("Driver has been instantiated and test started");
//        basePage.navigateTo(teachAwayBaseUrl);
    }

    @After
    public void after(){
        log.info("Test finished. Driver quit");
    }
}
