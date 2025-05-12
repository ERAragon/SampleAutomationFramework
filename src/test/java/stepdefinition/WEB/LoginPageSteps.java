package stepdefinition.WEB;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;
import utils.ConfigReader;
import utils.DriverManager;

public class LoginPageSteps {
    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        driver.get(ConfigReader.get("url"));
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_homepage() {
        Assert.assertTrue("Home page not displayed!", loginPage.isHomePageDisplayed());
    }

    @When("the user clicks on logout button")
    public void user_clicks_logout_request() {
        loginPage.clickLogout();
    }

    @Then("user should be redirected to loginpage")
    public void user_should_be_redirected_to_loginpage() {
        Assert.assertTrue("Login page not displayed!", loginPage.isLoginPageDisplayed());
    }
}
