package stepdefinition.WEB;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver(); // ensure driver is created
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
