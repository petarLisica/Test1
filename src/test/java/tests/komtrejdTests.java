package tests;

import base.komtrejdBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.*;

public class komtrejdTests extends komtrejdBase {

    komtrejdPage KomtrejdPage;
    belaTehnikaPage BelaTehnikaPage;
    sporetiPage SporetiPage;
    elektricniSporetiPage ElektricniSporetiPage;
    crniSporetiPage CrniSporetiPage;
    prviCrniProveraPage PrviCrniProveraPage;
    gorenjeEC6352WPAPage GorenjeEC6352WPAPage;

    @Before
    public void setUpPage() {
        KomtrejdPage = new komtrejdPage();
        BelaTehnikaPage = new belaTehnikaPage();
        SporetiPage = new sporetiPage();
        ElektricniSporetiPage = new elektricniSporetiPage();
        CrniSporetiPage = new crniSporetiPage();
        PrviCrniProveraPage = new prviCrniProveraPage();
        GorenjeEC6352WPAPage = new gorenjeEC6352WPAPage();
    }

    @Test
    public void pronalazenjeElemenataTest() {

        KomtrejdPage.hoverOverMenu();
        KomtrejdPage.clickBelaTehnika();
        BelaTehnikaPage.klikNaSporete();
        SporetiPage.klikNaElektricneSporete();
        ElektricniSporetiPage.klikCrno();
        CrniSporetiPage.klikniPrviCrni();
        Assert.assertEquals("Crna", PrviCrniProveraPage.asertovanjeBojeCrna() );
        driver.navigate().back();


    }

    @Test
    public void klitanjeNaBeluTehniku(){
        wdwait.until(ExpectedConditions.visibilityOf(KomtrejdPage.menu));
        KomtrejdPage.hoverOverMenu();
        wdwait.until(ExpectedConditions.visibilityOf(KomtrejdPage.belaTehnika));
        KomtrejdPage.clickBelaTehnika();
        wdwait.until(ExpectedConditions.visibilityOf(BelaTehnikaPage.sporeti));
        BelaTehnikaPage.klikNaSporete();
        wdwait.until(ExpectedConditions.visibilityOf(SporetiPage.elektricniSporeti));
        SporetiPage.klikNaElektricneSporete();
        wdwait.until(ExpectedConditions.visibilityOf(ElektricniSporetiPage.beloSelektor));
        ElektricniSporetiPage.selektujBelo();
        wdwait.until(ExpectedConditions.visibilityOf(ElektricniSporetiPage.gorenjeSelektor));
        ElektricniSporetiPage.selektujGorenje();
        wdwait.until(ExpectedConditions.visibilityOf(ElektricniSporetiPage.prviDropDownSelektor));
        ElektricniSporetiPage.selectDropdown();
        wdwait.until(ExpectedConditions.visibilityOf(ElektricniSporetiPage.ceniOpadajuce));
        ElektricniSporetiPage.klikniNaCeniOpadajuce();
        wdwait.until(ExpectedConditions.visibilityOf(ElektricniSporetiPage.gorenjeEC6352WPA));
        ElektricniSporetiPage.klikniGorenjeEC6352WPA();
        wdwait.until(ExpectedConditions.visibilityOf(GorenjeEC6352WPAPage.bojaSporeta));
        Assert.assertEquals("Bela", GorenjeEC6352WPAPage.asertovanjeBojeBela());
        driver.navigate().back();


    }
}
