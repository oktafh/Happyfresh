package com.testingBDD.Service;

import com.testingBDD.Page.ISelectorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.reflect.*;

/**
 * Created by disaputra on 16/08/2017.
 */

public class Engine {
    public WebDriver driver;
    private WebDriverWait wait;
    private String Element;
    public ISelectorPage iSelectorPage;
    private ParameterizedType parameterizedType;
    public By by;
    protected Class clazz;


    public <T> T Carousel(Class<T> cla) {
        return cla.cast(iSelectorPage.Carousel());
    }

    public <T> T Field(Class<T> cla) {
        return cla.cast(iSelectorPage.Field());
    }

    public <T> T Section(Class<T> cla) {
        return cla.cast(iSelectorPage.Section());
    }

    public <T> T Button(Class<T> cla) {
        return cla.cast(iSelectorPage.Button());
    }

    public Engine (ISelectorPage iselectorPage){
        this.iSelectorPage = iselectorPage;
        this.clazz = iSelectorPage.getClass();
        this.parameterizedType = (ParameterizedType)clazz.getGenericInterfaces()[0];
    }

    public Engine (){

    }

    public WebDriver Process(WebDriverWait wait, String Element) {
        this.wait = wait;
        this.Element = Element;
        this.WaitElementByCss(this.wait,this.Element);
        return this.driver;
    }

    public boolean WaitElementByCss(WebDriverWait wait,String Element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Element)));
        return true;
    }

    public boolean scroll_Page(WebElement webelement, int scrollPoints)
    {
        try
        {
            Actions dragger = new Actions(this.driver);
            // drag downwards
            int numberOfPixelsToDragTheScrollbarDown = 10;
            for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown)
            {
                dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release(webelement).build().perform();
            }
            Thread.sleep(50);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

}
