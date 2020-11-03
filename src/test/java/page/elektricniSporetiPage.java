package page;

import base.komtrejdBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class elektricniSporetiPage extends komtrejdBase {

    public elektricniSporetiPage() {

        PageFactory.initElements(driver,this);
    }

    /*-----ELEMENTI-----*/

    public @FindBy(xpath = "//label[@for=\"filter_data_filter_382\"]")
    WebElement crnoSelektor;

    public @FindBy(xpath = "//label[@for=\"filter_data_brend_142\"]")
    WebElement gorenjeSelektor;

    public @FindBy(xpath = "//label[@for=\"filter_data_filter_384\"]")
    WebElement beloSelektor;

    public @FindBy(xpath = "(//div[@class=\"category-sort-by dropdown\"])[1]")
    WebElement prviDropDownSelektor;

    public @FindBy(xpath = "//a[@data-order-by=\"desc\"]")
    WebElement ceniOpadajuce;

    public @FindBy(xpath = "//a[@title=\"EC6352WPA staklokeramički šporet\"]")
    WebElement gorenjeEC6352WPA;


    /*-----METODI-----*/

    public void klikCrno() {
        crnoSelektor.click();
    }

    public void selektujGorenje() {
        gorenjeSelektor.click();
    }

    public void selektujBelo() {
        beloSelektor.click();
    }

    public void selectDropdown () {
        prviDropDownSelektor.click();
    }

    public void klikniNaCeniOpadajuce() {
        ceniOpadajuce.click();
    }

    public void klikniGorenjeEC6352WPA() {
        gorenjeEC6352WPA.click();
    }
}


