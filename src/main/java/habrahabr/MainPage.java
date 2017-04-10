package habrahabr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by kutsenko on 09.04.17.
 */
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get("https://habrahabr.ru/company/luxoft/blog/280784/");
        return this;
    }

    public WebElement choseMenuBtn (String name) {
        List<WebElement> menu = driver.findElements(By.cssSelector("#navbar-links li"));
        for (WebElement el: menu) {
            if (el.getText().equals(name)){
                el.click();
                return el;
            }
        }
        return null;
    }
}
