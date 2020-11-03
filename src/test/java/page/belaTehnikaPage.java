package page;

import base.komtrejdBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class belaTehnikaPage extends komtrejdBase {

    public belaTehnikaPage() {

        PageFactory.initElements(driver,this);
    }

    /*ELEMENTI*/

    public @FindBy(xpath = "//a[@title=\"Šporeti\"]")
    WebElement sporeti;

    /*METODI*/

    public void klikNaSporete() {
        sporeti.click();
    }


}
