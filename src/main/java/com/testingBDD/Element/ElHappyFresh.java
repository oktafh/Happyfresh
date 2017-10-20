package com.testingBDD.Element;

/**
 * Created by disaputra on 27/07/2017.
 */
public class ElHappyFresh {

    protected String IdElement;
    protected String XPathElement;
    protected String ClassElement;
    protected String NameElement;
    protected String TextElement;
    protected String CSSElement;
    protected String CategoryElement;
    protected Integer LengthCarouselSlider;

    public ElHappyFresh(String keyword){
        if (keyword.equals("carousel")){
            this._carouselSlider();
            this._carouselFarmMarket();
            this._carouselPrevButton();
            this._carouselNextButton();
        }
        else if (keyword.equals("button")){

        }
    }

    public ElHappyFresh _carouselSlider(){
        this.ClassElement = "stores-carousel-wrapper";
        this.IdElement = "carousel-52";
        this.CSSElement = "div[class=\"stores-carousel-each\"]";
        return this;
    }

    public ElHappyFresh _carouselFarmMarket(){
        this.IdElement = "carousel-9";
        this.CSSElement = "#carousel-9";
        return this;
    }

    public ElHappyFresh _carouselPrevButton() {
        this.CSSElement = "div[class=\"stores-carousel-prev\"] img[data-pointer=\"5\"]";
        return this;
    }

    public ElHappyFresh _carouselNextButton() {
        this.CSSElement = "div[class=\"stores-carousel-next\"] img[data-pointer=\"5\"]";
        return this;
    }


    public String getCSSElement() {

        return CSSElement;
    }

    public void setCSSElement(String csselement) {

        this.CSSElement = csselement;
    }

    public String getIdElement() {

        return IdElement;
    }

    public void setIdElement(String idElement) {

        this.IdElement = idElement;
    }

    public String getXPathElement() {
        return XPathElement;
    }

    public void setXPathElement(String XPathElement) {

        this.XPathElement = XPathElement;
    }

    public String getClassElement() {

        return ClassElement;
    }

    public void setClassElement(String classElement) {

        this.ClassElement = classElement;
    }

    public String getNameElement() {

        return NameElement;
    }

    public void setNameElement(String nameElement) {

        this.NameElement = nameElement;
    }

    public String getTextElement() {

        return TextElement;
    }

    public void setTextElement(String textElement) {

        this.TextElement = textElement;
    }

    public String getCategoryElement() {

        return CategoryElement;
    }

    public void setCategoryElement(String categoryElement) {

        this.CategoryElement = categoryElement;
    }

}
