package habrahabr;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by kutsenko on 09.04.17.
 */
public class TestBase {
    protected WebDriver driver;
    protected MainPage mainPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
    }

    @After
    public void stop() {
//        driver.quit();
    }
}
