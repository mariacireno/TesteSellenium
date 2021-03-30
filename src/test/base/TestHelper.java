package io.cucumber.maria;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestHelper {

    protected static WebDriver browser;
    
    public static void openBrowser() {

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("linux") || osName.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        } else { 
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        }
		
		browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static void goToPage(String site) {
        browser.get(site);
        browser.findElement(By.id("nav_automobile")).click();
    }

    public static void selectAutomobile() {
        browser.quit();
    }

    public static WebElement getCssElement(String seletor) {
		return browser.findElement(By.cssSelector(seletor));
	}

    public static WebElement getCssElementById(String seletor) {
		return browser.findElement(By.id(seletor));
	}
	
	public static List<WebElement> getCssElements(String seletor) {
		return browser.findElements(By.cssSelector(seletor));
	}

    public static void selectCollapse(String field, String choice) {
        Select makeSelect = new Select(getCssElementById(field));
        makeSelect.selectByVisibleText(choice);
    }

    public static void fillField(String field, String text) {
        getCssElementById(field).sendKeys(text);
    }

    public static WebElement getXPath(String xpath) {
        return browser.findElement(By.xpath(xpath));
    }
}
