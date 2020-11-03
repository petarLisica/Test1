package page;

import base.komtrejdBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prviCrniProveraPage extends komtrejdBase {

    public prviCrniProveraPage() {

        PageFactory.initElements(driver,this);
    }

    /*Elementi*/

    public @FindBy(xpath = "//tr[@data-specid=\"4619\"]/td")
    WebElement bojaSporeta;

    /*METODI*/

    public String asertovanjeBojeCrna() {
        return bojaSporeta.getText();


    }

}
