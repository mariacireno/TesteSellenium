package io.cucumber.pages;

import io.cucumber.helpers.*;

public class PricePage {

    private String priceOption;

    public PricePage() {
        this.priceOption = "ultimate"; // silver, gold, platinum, ultimate
    }
    
    public void fillPriceOption() {
        String xpath = "//input[@id='select" + this.priceOption + "']//following-sibling::span[@class='ideal-radio']";
        TestHelper.getXPath(xpath).click();
    }
}
