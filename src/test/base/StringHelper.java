package io.cucumber.maria;

public class StringHelper {

    private String stringWithoutSpaces(String string) {
        return string.replace(" ", "");
    }

    public String getTabName(String string) {
        String tabName = stringWithoutSpaces(string);
        return tabName.toLowerCase();
    }  
    
    public String getButtonName(String button, String tab) {
        String tabName = stringWithoutSpaces(tab).toLowerCase();
        String buttonName = stringWithoutSpaces(button).toLowerCase();
        return buttonName.concat(tabName);
    }  

}
