package io.cucumber.maria;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.pt.*;
import io.cucumber.pages.*;

public class FormsSteps {
   
    private NavigationPage navigation = new NavigationPage();
    private VehiclePage vehicle = new VehiclePage();
    private InsurantPage insurant = new InsurantPage();
    private ProductPage product = new ProductPage();
    private PricePage price = new PricePage();
    private QuotePage quote = new QuotePage();
    
    @Dado("que entrei no site {string}")
    public void que_entrei_no_site(String site) {
        navigation.enterWebsite(site);
    }

    @Entao("selecione a aba {string}")
    public void selecione_a_aba(String string) {
        navigation.selectTab(string);   
    }

    @Entao("pressione {string} para {string}")
    public void pressione_botao_para(String button, String tab) {
        try {
            navigation.pressButton(button, tab);
        } catch (InterruptedException e) {
            System.out.println("Tempo de espera insuficiente!");
        }
    }

    @Entao("preencha o formulario Vehicle Data")
    public void preencha_o_formulario_Vehicle_Data() {
        // Make
        vehicle.fillMake();
        // Engine Performance
        vehicle.fillEngine();
        // Date of Manufacture
        vehicle.fillManufactureDate();
        // Number of seats
        vehicle.fillNumberOfSeats();
        // Fuel type
        vehicle.fillFuelType();
        // List Price
        vehicle.fillListPrice();
        // License Plate Number
        vehicle.fillLicensePlateNumber();
        // Annual Mileage
        vehicle.fillAnnualMileage();
    }

    @Entao("preencha o formulario Insurant Data")
    public void preencha_o_formulario_Insurant_Data() {
        // First Name
        insurant.fillFirstName();
        // Last Name
        insurant.fillLastName();
        // Date of birth
        insurant.fillBirthDate();
        // Gender
        insurant.fillGender();
        // Street Address
        insurant.fillAddress();
        // Country
        insurant.fillCountry();
        // Zip Code
        insurant.fillZipCode();
        // City
        insurant.fillCity();
        // Occupation
        insurant.fillOccupation();
        // Hobbies
        insurant.fillHobbies();
        // Website
        insurant.fillWebsite();
    }

    @Entao("preencha o formulario Product Data")
    public void preencha_o_formulario_Product_Data() {
        // Start Date
        product.fillStartDate();
        // Insurance Sum
        product.fillInsuranceSum();
        // Merit Rating
        product.fillMeritRating();
        // Damage Insurance
        product.fillDamageInsurance();
        // Optional Products
        product.fillOptionalProduct();
        // Courtesy Car
        product.fillCourtesyCar();
    }
    
    @Entao("preencha o formulario Price Option")
    public void preencha_o_formulario_Price_Option() {
        // Price option
        price.fillPriceOption();
    }

    @Entao("preencha o formulario Send Quote")
    public void preencha_o_formulario_Send_Quote() {
        // E-Mail
        quote.fillEmail();
        // Phone
        quote.fillPhone();
        // Username
        quote.fillUsername();
        // Password
        quote.fillPassword();
        // Confirm Password
        quote.fillConfirmPassword();
    }

    @E("pressione send")
    public void pressione_send() {
        navigation.pressSend();
    }

    @Entao("verifique na tela a mensagem {string}")
    public void verifique_na_tela_a_mensagem(String string) {
        try {
            assertEquals(string, navigation.checkSentEmailMessage());
        } catch (InterruptedException e) {
            System.out.println("Tempo de espera insuficiente para envio de email!");
        }
        navigation.closeBrowser();
    }
}
