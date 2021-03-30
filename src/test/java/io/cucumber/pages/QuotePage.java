package io.cucumber.pages;

import io.cucumber.helpers.*;

public class QuotePage {
    
    private String email;
    private String phone;
    private String username;    
    private String password;

    public QuotePage() {
        this.email = "mariacireno@gmail.com"; // Valid email
        this.phone = "5581988961959"; // Only numbers
        this.username = "mariacireno";
        this.password = "123456Qa"; // Minimum of six digits, at least one number, one letter in upper case and one in lower case
    }

    public void fillEmail(){
        TestHelper.fillField("email", this.email);
    }

    public void fillPhone(){
        TestHelper.fillField("phone", this.phone);
    }

    public void fillUsername(){
        TestHelper.fillField("username", this.username);
    }

    public void fillPassword(){
        TestHelper.fillField("password", this.password);
    }

    public void fillConfirmPassword(){
        TestHelper.fillField("confirmpassword", this.password);
    }

    
}
