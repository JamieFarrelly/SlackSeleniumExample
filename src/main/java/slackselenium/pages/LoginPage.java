package slackselenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(id="signin_btn")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public void enterEmail(String email) {
        this.emailInput.clear();
        this.emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        this.passwordInput.clear();
        this.passwordInput.sendKeys(password);
    }

    public ChannelPage clickLoginButton() {
        loginButton.click();
        return new ChannelPage(driver);
    }
}