package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    WebDriver wait;
    WebDriver driver;
    @FindBy(css="input[name='email']")
    public WebElement usernameTextField;

    @FindBy(css="input[name='pass']")
    public WebElement passwordTextField;

    @FindBy(css="input[id='u_0_2']")
    public WebElement loginButton;

    public void validLogin(String UserName, String PassWord)
    {
            usernameTextField.sendKeys(UserName);
            passwordTextField.sendKeys(PassWord);
            loginButton.click();
    }
}
