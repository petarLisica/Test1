package page;

import base.komtrejdBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crniSporetiPage extends komtrejdBase {

    public crniSporetiPage() {

        PageFactory.initElements(driver,this);
    }

    /*ELEMENTI*/

    public @FindBy(xpath = "//a[@title=\"Končar SE5040CR1 električni šporet\"]")
    WebElement prviCrniSporet;

    /*Metodi*/

    public void klikniPrviCrni() {
        prviCrniSporet.click();
    }
}
