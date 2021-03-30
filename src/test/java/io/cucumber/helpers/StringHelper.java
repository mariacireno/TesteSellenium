package io.cucumber.helpers;

public class StringHelper {

    private static String stringWithoutSpaces(String string) {
        return string.replace(" ", "");
    }

    public static String getTabName(String string) {
        String tabName = stringWithoutSpaces(string);
        return tabName.toLowerCase();
    }  
    
    public static String getButtonName(String button, String tab) {
        String tabName = stringWithoutSpaces(tab).toLowerCase();
        String buttonName = stringWithoutSpaces(button).toLowerCase();
        return buttonName.concat(tabName);
    }  

}
