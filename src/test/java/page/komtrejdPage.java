package page;

import base.komtrejdBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class komtrejdPage extends komtrejdBase {

    public komtrejdPage() {

        PageFactory.initElements(driver, this);
    }

    /*ELEMENTI*/

    public @FindBy(css = ".am-opener.sharkskin-collapse")
    WebElement menu;

    public @FindBy(xpath = "//a[@href=\"/bela-tehnika\"]")
    WebElement belaTehnika;

    /*METODE*/

    public void hoverOverMenu() {
        Actions hover = new Actions(driver);
        hover.moveToElement(menu).perform();
    }

    public void clickBelaTehnika() {
        belaTehnika.click();
    }

}
