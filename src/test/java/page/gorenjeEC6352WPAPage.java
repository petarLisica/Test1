package page;

import base.komtrejdBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gorenjeEC6352WPAPage extends komtrejdBase {

    public gorenjeEC6352WPAPage() {
        PageFactory.initElements(driver,this);
    }

    /*-----ELEMENTI-----*/

    public @FindBy(xpath = "/html/body/main/section/div/div/div/div[3]/div[2]/div[2]/table/tbody/tr[4]/td[2]")
    WebElement bojaSporeta;

    /*-------------------*/

    /*-----METODI-----*/

    public String asertovanjeBojeBela() {
        return bojaSporeta.getText();
    }
}

