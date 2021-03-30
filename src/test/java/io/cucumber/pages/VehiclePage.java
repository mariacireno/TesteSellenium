package io.cucumber.pages;

import io.cucumber.helpers.*;

public class VehiclePage {

    private String make; 
    private String engine;
    private String manufactureDate;    
    private String seats;
    private String fuelType;
    private String listPrice;
    private String plateNumber;
    private String annualMileage;
        
    public VehiclePage() {
        this.make = "BMW"; //Audi, BMW, Ford, Honda, Mazda, Mercedes Benz, Nissan, Opel, Porsche, Renault, Skoda, Suzuki, Toyota, Volkswagen, Volvo
        this.engine = "1000"; // 1 a 2000
        this.manufactureDate = "08/20/2020"; // Past date
        this.seats = "5"; // 1 a 9
        this.fuelType = "Gas"; // Petrol, Diesel, Electric Power, Gas, Other
        this.listPrice = "80000"; // 500 a 100000
        this.plateNumber = "OTTO2020";
        this.annualMileage = "2000"; // 100 a 100000
    }

    public void fillMake() {
        TestHelper.selectCollapse("make", this.make);
    }

    public void fillEngine() {
        TestHelper.fillField("engineperformance", this.engine);
    }
    
    public void fillManufactureDate() {
        TestHelper.fillField("dateofmanufacture", this.manufactureDate);
    }

    public void fillNumberOfSeats() {
        TestHelper.selectCollapse("numberofseats", this.seats);
    }

    public void fillFuelType() {
        TestHelper.selectCollapse("fuel", this.fuelType);
    }

    public void fillListPrice() {
        TestHelper.fillField("listprice", this.listPrice);
    }

    public void fillLicensePlateNumber() {
        TestHelper.fillField("licenseplatenumber", this.plateNumber);
    }

    public void fillAnnualMileage() {
        TestHelper.fillField("annualmileage", this.annualMileage);
    }
    

}