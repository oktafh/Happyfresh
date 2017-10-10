package com.testingBDD.Page;

import com.testingBDD.Element.ElFarmHouse;

import org.openqa.selenium.WebDriver;


/**
 * Created by disaputra on 26/07/2017.
 */

public class FarmMarketPage implements ISelectorPage<ElFarmHouse> {

    private WebDriver driver;

    public ElFarmHouse Field(){
        ElFarmHouse elFarmHouse = new ElFarmHouse("field");
        return elFarmHouse;
    }

    public ElFarmHouse Carousel(){
        ElFarmHouse elFarmHouse = new ElFarmHouse("carousel");
        return elFarmHouse;
    }

    public ElFarmHouse Section(){
        ElFarmHouse elFarmHouse = new ElFarmHouse("section");
        return elFarmHouse;
    }

    public ElFarmHouse Button(){
        ElFarmHouse elFarmHouse = new ElFarmHouse("button");
        return elFarmHouse;
    }


     public FarmMarketPage(WebDriver driver){
        this.driver = driver;
    }


}
