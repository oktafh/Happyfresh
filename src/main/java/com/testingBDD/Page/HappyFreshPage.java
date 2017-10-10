package com.testingBDD.Page;

import com.testingBDD.Element.ElHappyFresh;
import org.openqa.selenium.WebDriver;


/**
 * Created by disaputra on 26/07/2017.
 */

public class HappyFreshPage implements ISelectorPage<ElHappyFresh> {

    private WebDriver driver;

    public ElHappyFresh Field(){
        ElHappyFresh elHappyFresh = new ElHappyFresh("field");
        return elHappyFresh;
    }

    public ElHappyFresh Carousel(){
        ElHappyFresh elHappyFresh = new ElHappyFresh("carousel");
        return elHappyFresh;
    }

    public ElHappyFresh Section(){
        ElHappyFresh elHappyFresh = new ElHappyFresh("section");
        return elHappyFresh;
    }

    public ElHappyFresh Button(){
        ElHappyFresh elHappyFresh = new ElHappyFresh("button");
        return elHappyFresh;
    }

     public HappyFreshPage(WebDriver driver){
        this.driver = driver;
    }

}
