package com.testingBDD.Element;

/**
 * Created by disaputra on 27/07/2017.
 */
public class ElFarmHouse {
    protected String IdElement;
    protected String XPathElement;
    protected String ClassElement;
    protected String NameElement;
    protected String TextElement;
    protected String CSSElement;
    protected String CategoryElement;

    public ElFarmHouse result;

    public ElFarmHouse(String keyword){
        if (keyword.equals("field")){
            this._fEmail();
            this._fPassword();
        }

        else if (keyword.equals("button")){
            this._bLogin();
            this._aforgotPassword();
        }

        else if (keyword.equals("section")){
            this._sMainPage();
        }
    }

    public ElFarmHouse _fEmail(){
        this.IdElement = "login-email";
        this.CSSElement = "input[id=\"login-email\"]";
        return this;
    }

    public ElFarmHouse _fPassword(){
        this.IdElement = "login-password";
        this.CSSElement = "input[id=\"login-password\"]";
        return this;
    }

    public ElFarmHouse _bLogin(){
        this.CSSElement = "button[class=\"nav-login open-popup\"]";
        return this;
    }

    public ElFarmHouse _aforgotPassword(){
        this.CSSElement = "li[data-reactid=\".0.1.0.0.1.0.2.0.0.1.0.3.1.1.0.1.0\"] a[name=\"reset-password\"]";
        return this;
    }

    public ElFarmHouse _sMainPage() {
        this.CSSElement = "section[class=\"main-content\"]";
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
