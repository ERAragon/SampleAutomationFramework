package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By submitButton = By.id("submit");
    private final By homepageIndicator = By.cssSelector("h1.post-title");
    private final By logoutButton = By.xpath("//a[text()='Log out']");
    private final By loginpageIndicator = By.xpath("//h2[text()='Test login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        type(usernameField, username);
    }

    public void enterPassword(String password) {
        type(passwordField, password);
    }

    public void clickSubmit() {
        click(submitButton);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSubmit();
    }

    public boolean isHomePageDisplayed() {
        return isVisible(homepageIndicator);
    }

    public void clickLogout() {
        click(logoutButton);
    }

    public boolean isLoginPageDisplayed() {
        return isVisible(loginpageIndicator);
    }
}
