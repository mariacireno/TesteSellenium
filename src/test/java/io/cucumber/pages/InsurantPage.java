package io.cucumber.pages;

import io.cucumber.helpers.*;

public class InsurantPage {

    private String firstName;
    private String lastName;
    private String birthDate;    
    private String gender;
    private String address;
    private String country;
    private String zipcode;
    private String city;
    private String occupation;
    private String hobbies;
    private String website;

    public InsurantPage() {
        this.firstName = "Maria";
        this.lastName = "Cireno";
        this.birthDate = "02/28/1989"; // Past date
        this.gender = "female"; // male, female
        this.address = "Estrada das Ubaias, 2885";
        this.country = "Brazil"; // Valid country
        this.zipcode = "52051380"; // Only numbers
        this.city = "Recife";
        this.occupation = "Selfemployed"; // Employee, Public Official, Farmer, Unemployed, Selfemployed
        this.hobbies = "other"; // speeding, bungeejumping, cliffdiving, skydiving, other
        this.website = "https://www.linkedin.com/in/maria-cireno-aab9509/"; // valid URL
    }

    public void fillFirstName(){
        TestHelper.fillField("firstname", this.firstName);
    }

    public void fillLastName(){
        TestHelper.fillField("lastname", this.lastName);
    }
    
    public void fillBirthDate(){
        TestHelper.fillField("birthdate", this.birthDate);
    }

    public void fillGender(){
        String xpath = "//input[@id='gender" + this.gender + "']//following-sibling::span[@class='ideal-radio']";
        TestHelper.getXPath(xpath).click();
    }

    public void fillAddress(){
        TestHelper.fillField("streetaddress", this.address);
    }

    public void fillCountry(){
        TestHelper.selectCollapse("country", this.country);
    }

    public void fillZipCode(){
        TestHelper.fillField("zipcode", this.zipcode);
    }

    public void fillCity(){
        TestHelper.fillField("city", this.city);
    }

    public void fillOccupation(){
        TestHelper.selectCollapse("occupation", this.occupation);
    }

    public void fillHobbies(){
        String xpath = "//input[@id='" + this.hobbies + "']//following-sibling::span[@class='ideal-check']";
        TestHelper.getXPath(xpath).click();
    }

    public void fillWebsite(){
        TestHelper.fillField("website", this.website);
    }
     

}
