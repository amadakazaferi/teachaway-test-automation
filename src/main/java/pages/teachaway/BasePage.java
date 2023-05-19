package pages.teachaway;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasePage extends PageObject {

    @FindBy(xpath = "//ul[contains(@class,'megamenu-nav nav level-0')]")
    private WebElementFacade megaMenuNav0;

    ////ul[contains(@class,'megamenu-nav nav level-0')]//li[contains(@class,'tb-megamenu-item level-1')]
    @FindBy(xpath = "//li[contains(@class,'tb-megamenu-item level-1')]")
    private List<WebElementFacade> megaMenuNav0Items;

    private String nav1Item = "//li[contains(@class,'tb-megamenu-item level-1') and @data-label='%s']";


    public WebElementFacade getMegaMenuNav0() { return megaMenuNav0; }

    public List<WebElementFacade> getMegaMenuNav0Items() { return megaMenuNav0Items; }

    public WebElementFacade getNav1Item(String item) {
        return find(By.xpath(String.format(nav1Item, item)));
    }


    public void navigateTo(String url){
      getDriver().navigate().to(url);
    }

}
