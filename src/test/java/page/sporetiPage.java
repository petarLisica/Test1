package page;

import base.komtrejdBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sporetiPage extends komtrejdBase {

    public sporetiPage() {

        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath = "//a[@title=\"Električni šporeti\"]")
    WebElement elektricniSporeti;

    public void klikNaElektricneSporete() {
        elektricniSporeti.click();
    }

}
