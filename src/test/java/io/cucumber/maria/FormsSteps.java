package io.cucumber.maria;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import io.cucumber.java.pt.*;

public class FormsSteps {

    StringHelper stringHelper = new StringHelper();
    
    @Dado("que entrei no site {string}")
    public void que_entrei_no_site(String site) {
        TestHelper.openBrowser();
        TestHelper.goToPage(site);
    }

    @Entao("selecione a aba {string}")
    public void selecione_a_aba(String string) {
        String tabId = stringHelper.getTabName(string);
        TestHelper.getCssElementById(tabId).click();
        // Depois retirar esse print
        System.out.println(tabId);
    }

    @E("pressione next")
    public void pressione_next() {
        TestHelper.getCssElement("div.field.buttons > button.next").click();
    }

    @Entao("pressione {string} para {string}")
    public void pressione_botao_para(String button, String tab) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Button Name = " + stringHelper.getButtonName(button, tab));
        TestHelper.getCssElementById(stringHelper.getButtonName(button, tab)).click();
    }

    @Entao("preencha o formulario Vehicle Data")
    public void preencha_o_formulario_Vehicle_Data() {
        // Make
        TestHelper.selectCollapse("make", "BMW");
        // Engine Performance
        TestHelper.fillField("engineperformance", "1000");
        // Date of Manufacture
        TestHelper.fillField("dateofmanufacture", "08/20/2020");
        // Number of seats
        TestHelper.selectCollapse("numberofseats", "5");
        // Fuel type
        TestHelper.selectCollapse("fuel", "Gas");
        // List Price
        TestHelper.fillField("listprice", "80000");
        // License Plate Number
        TestHelper.fillField("licenseplatenumber", "OTTO2020");
        // Annual Mileage
        TestHelper.fillField("annualmileage", "2000");
    }

    @Entao("preencha o formulario Insurant Data")
    public void preencha_o_formulario_Insurant_Data() {
        // First Name
        TestHelper.fillField("firstname", "Maria");
        // Last Name
        TestHelper.fillField("lastname", "Cireno");
        // Date of birth
        TestHelper.fillField("birthdate", "02/28/1989");
        // Gender
        TestHelper.getXPath("//input[@id='genderfemale']//following-sibling::span[@class='ideal-radio']").click();
        // Street Address
        TestHelper.fillField("streetaddress", "Estrada das Ubaias, 2885");
        // Country
        TestHelper.selectCollapse("country", "Brazil");
        // Zip Code
        TestHelper.fillField("zipcode", "52051380");
        // City
        TestHelper.fillField("city", "Recife");
        // Country
        TestHelper.selectCollapse("occupation", "Selfemployed");
        // Hobbies
        //TestHelper.getCssElements("div.field.idealforms-field.idealforms-field-checkbox>p.group>label.ideal-radiocheck-label").get(4).click();
        TestHelper.getXPath("//input[@id='other']//following-sibling::span[@class='ideal-check']").click();
        // Website
        TestHelper.fillField("website", "https://www.linkedin.com/in/maria-cireno-aab9509/");
    }

    @Entao("preencha o formulario Product Data")
    public void preencha_o_formulario_Product_Data() {
        // Start Data
        TestHelper.fillField("startdate", "05/01/2021");
        // Insurance Sum
        TestHelper.selectCollapse("insurancesum", "5.000.000,00");
        // Merit Rating
        TestHelper.selectCollapse("meritrating", "Bonus 6");
        // Damage Insurance
        TestHelper.selectCollapse("damageinsurance", "Full Coverage");
        // Optional Products
        TestHelper.getXPath("//input[@id='EuroProtection']//following-sibling::span[@class='ideal-check']").click();
        TestHelper.getXPath("//input[@id='LegalDefenseInsurance']//following-sibling::span[@class='ideal-check']").click();
        // Courtesy Car
        TestHelper.selectCollapse("courtesycar", "Yes");
    }
    
    @Entao("preencha o formulario Price Option")
    public void preencha_o_formulario_Price_Option() {
        TestHelper.getXPath("//input[@id='selectultimate']//following-sibling::span[@class='ideal-radio']").click();
    }

    @Entao("preencha o formulario Send Quote")
    public void preencha_o_formulario_Send_Quote() {
        // E-Mail
        TestHelper.fillField("email", "mariacireno@gmail.com");
        // Phone
        TestHelper.fillField("phone", "5581988961959");
        // Username
        TestHelper.fillField("username", "mariacireno");
        // Password
        TestHelper.fillField("password", "123456Qa");
        // Confirm Password
        TestHelper.fillField("confirmpassword", "123456Qa");
    }

    @E("pressione send")
    public void pressione_send() {
        TestHelper.getCssElementById("sendemail").click();
    }

    @Entao("verifique na tela a mensagem {string}")
    public void verifique_na_tela_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(12000);
        // colocar um while esperando ficar visivel
        assertEquals(string, TestHelper.getCssElement("h2").getText());
        TestHelper.closeBrowser();
    }
}
