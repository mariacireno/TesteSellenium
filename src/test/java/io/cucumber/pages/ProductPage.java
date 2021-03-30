package io.cucumber.pages;

import io.cucumber.helpers.*;

public class ProductPage {

    private String startDate;
    private String insuranceSum;
    private String meritRating;    
    private String damageInsurance;
    private String[] optionalProducts;
    private String courtesyCar;

    public ProductPage(){
        this.startDate = "05/01/2021";
        this.insuranceSum = "5.000.000,00"; // 3, 5, 7, 10, 15, 20, 25, 30, 35 MI
        this.meritRating = "Bonus 6"; // Super Bonus, Bonus 1 to 9, Malus 10 to 17
        this.damageInsurance = "Full Coverage"; // No Coverage, Partial Coverage, Full Coverage
        this.optionalProducts = new String[]{"EuroProtection", "LegalDefenseInsurance"}; // At least one of the two
        this.courtesyCar = "Yes"; // Yes, No
    }

    public void fillStartDate(){
        TestHelper.fillField("startdate", this.startDate);
    }

    public void fillInsuranceSum(){
        TestHelper.selectCollapse("insurancesum", this.insuranceSum);
    }

    public void fillMeritRating(){
        TestHelper.selectCollapse("meritrating", this.meritRating);
    }

    public void fillDamageInsurance(){
        TestHelper.selectCollapse("damageinsurance", this.damageInsurance);
    }

    public void fillOptionalProduct(){               
        for(String product : this.optionalProducts) {
            String xpath = "//input[@id='" + product + "']//following-sibling::span[@class='ideal-check']";
            TestHelper.getXPath(xpath).click();
        }        
    }

    public void fillCourtesyCar(){
        TestHelper.selectCollapse("courtesycar", this.courtesyCar);
    }

}
