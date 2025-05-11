package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By submitButton = By.id("submit");
    private By homepageIndicator = By.cssSelector("h1.post-title");
    private By logoutButton = By.xpath("//a[text()='Log out']");
    private By loginpageIndicator = By.xpath("//h2[text()='Test login']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(homepageIndicator).isDisplayed();
    }
    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }
    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginpageIndicator).isDisplayed();
    }
}