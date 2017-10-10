package com.testingBDD;

import com.testingBDD.Element.ElFarmHouse;
import com.testingBDD.Element.ElHappyFresh;
import com.testingBDD.Page.FarmMarketPage;
import com.testingBDD.Page.HappyFreshPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.testingBDD.Service.Engine;
import com.testingBDD.Constant.*;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.lang.Exception;
import static org.junit.Assert.*;

/**
 * Created by disaputra on 05/10/2017.
 */
public class BeginningHappyFreshStep {

    public WebDriver control;
    public WebElement element;
    public Configuration conf;
    public WebDriverWait wait;
    public Driver driver;
    public Engine engine;
    public String Xpath;
    public String CSSSelector;

    @Given("^prepara and navigate$")
    public void prepara_and_navigate() {
        conf = new Configuration();
        driver = new Driver();
        control = driver.BrowserControl("chrome",conf);
        driver.ClearCache(control);
        wait = new WebDriverWait(control,conf.timeout);
        engine = new Engine(new HappyFreshPage(control));
    }

    @When("^Open Happyfresh for validate URL$")
    public void Website_HappyFresh_Has_Been_Opened() throws Throwable {

        try {
            control = driver.StartNavigate(control,conf.WebsiteURL);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Get URL and equals with \"([^\"]*)\"$")
    public void Get_URL_and_equals_with(String arg1) {
        try {
            assertTrue((control.getCurrentUrl()).equals(arg1));
        }
        catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    @When("^Website HappyFresh Opened and Ready$")
    public void Website_HappyFresh_ready() {

        try {
            //engine.WaitElementByCss(wait,"div[class=\"stores-carousel-wrapper\"]");
            CSSSelector = engine.Carousel(ElHappyFresh.class)._carouselSlider().getCSSElement();
            engine.WaitElementByCss(wait,CSSSelector);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Searching FarmMarket on Carousel and Click$")
    public void Navigate_FarmMarket_onCarousel() {
        try {
            //element = control.findElement(By.cssSelector("#carousel-9"));
            CSSSelector = engine.Carousel(ElHappyFresh.class)._carouselFarmMarket().getCSSElement();
            element = control.findElement(By.cssSelector(CSSSelector));
        }
        catch (ElementNotVisibleException e) {
            for (int i = 1; i< 10; i++){
                //element = control.findElement(By.cssSelector("div[class=\"stores-carousel-prev\"] img[data-pointer=\"5\"]"));
                //element.click();
                //element.clear();
                //element = control.findElement(By.cssSelector("#carousel-9"));
                CSSSelector = engine.Carousel(ElHappyFresh.class)._carouselPrevButton().getCSSElement();
                element = control.findElement(By.cssSelector(CSSSelector));
                element.click();
                element.clear();
                CSSSelector = engine.Carousel(ElHappyFresh.class)._carouselFarmMarket().getCSSElement();
                element = control.findElement(By.cssSelector(CSSSelector));

                if (element.equals(null)) {
                    i = i+1;
                }
                else
                    i=10;
            }
        }
        element.click();

    }

    @When ("^Website FarmMarket Has Been Opened$")
    public void Website_FarmMarket_Opened () {
        engine = new Engine(new FarmMarketPage(control));
        try {
            //engine.WaitElementByCss(wait,"section[class=\"main-content\"]");
            //engine.WaitElementByCss(wait,"button[class=\"nav-login open-popup\"]");
            CSSSelector = engine.Section(ElFarmHouse.class)._sMainPage().getCSSElement();
            engine.WaitElementByCss(wait,CSSSelector);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then ("^Searching Button Login and Click$")
    public void Search_Button_Login () {
        try {
            //element = control.findElement(By.cssSelector("button[class=\"nav-login open-popup\"]"));
            CSSSelector = engine.Button(ElFarmHouse.class)._bLogin().getCSSElement();
            element = control.findElement(By.cssSelector(CSSSelector));
        }
        catch (ElementNotVisibleException e) {
            e.printStackTrace();
        }
        element.click();
    }

    @When ("^username and password show$")
    public void Prompt_Login_Visible() {
        CSSSelector = engine.Field(ElFarmHouse.class)._fEmail().getCSSElement();
        engine.WaitElementByCss(wait,CSSSelector);
        element = control.findElement(By.cssSelector(CSSSelector));
    }

    @Then ("^filled it$")
    public void do_Login_FarmMarket() {
        element.sendKeys("dhony.imamsaputra@gmail.com");
        CSSSelector = engine.Field(ElFarmHouse.class)._fPassword().getCSSElement();
        engine.WaitElementByCss(wait,CSSSelector);
        element = control.findElement(By.cssSelector(CSSSelector));
        element.sendKeys("1234567");
        try {
            assertTrue("This Test Pass",!(element.equals(null)));
        } catch (AssertionError e) {
            e.printStackTrace();
        }

    }
}
