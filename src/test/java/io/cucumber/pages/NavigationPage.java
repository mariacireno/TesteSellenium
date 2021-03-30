package io.cucumber.pages;

import io.cucumber.helpers.*;

public class NavigationPage {
        
    public void enterWebsite(String page) {
        TestHelper.openBrowser();
        TestHelper.goToPage(page);
    }

    public void selectTab(String tab) {
        String tabId = StringHelper.getTabName(tab);
        TestHelper.getCssElementById(tabId).click();  
    }

    public void pressButton(String button, String tab) throws InterruptedException {
        Thread.sleep(1000);
        TestHelper.getCssElementById(StringHelper.getButtonName(button, tab)).click();
    }

    public void pressSend() {
        TestHelper.getCssElementById("sendemail").click();
    }

    public String checkSentEmailMessage() throws InterruptedException  {
        Thread.sleep(12000);
        return TestHelper.getCssElement("h2").getText();
    }

    public void closeBrowser() {
        TestHelper.closeBrowser();
    }
    
}
