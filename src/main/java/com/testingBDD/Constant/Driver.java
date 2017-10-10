package com.testingBDD.Constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by disaputra on 15/08/2017.
 */
public class Driver {

    public WebDriver Control;
    private DesiredCapabilities desiredCapabilities;

    public WebDriver StartNavigate(WebDriver control,String URL){
        control.manage().window().maximize();
        control.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        control.navigate().to(URL);
        return control;
    }


    public WebDriver BrowserControl(String option,Configuration conf){
        System.setProperty(conf.WebdriverKey,conf.WebdriverPath);
        if (option.equals("chrome")){
            this.Control = new ChromeDriver();
            this.desiredCapabilities = DesiredCapabilities.chrome();
        }
        else if (option.equals("firefox")){
            this.Control = new FirefoxDriver();
            this.desiredCapabilities = DesiredCapabilities.firefox();
        }

        return Control;
    }

    public void ClearCache(WebDriver control){
        this.Control = control;
        this.Control.manage().deleteAllCookies();
    }

}
