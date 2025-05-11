package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

public class LoginPageSteps {
    WebDriver driver;
    LoginPage loginPage;
    Response response;

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_homepage() {
        Assertions.assertTrue(loginPage.isHomePageDisplayed());
    }

    @When("the user sends a GET request to {string}")
    public void user_sends_get_request(String url) {
        response = RestAssured.get(url);
    }

    @Then("the API response status code should be {int}")
    public void api_response_should_be(int statusCode) {
        Assertions.assertEquals(statusCode, response.getStatusCode());
    }

    @When("the user clicks on logout button")
    public void user_clicks_logout_request() {
        loginPage.clickLogout();
    }

    @Then("user should be redirected to loginpage")
    public void user_should_be_redirected_to_loginpage(){
        loginPage.isLoginPageDisplayed();
        driver.quit();
    }
}