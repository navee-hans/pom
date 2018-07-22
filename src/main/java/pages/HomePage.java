package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="_1vp5")
    public WebElement userNameText;

    public boolean userNameDisplayed(String expectedResult)
    {
        String actualResult = userNameText.getText();
        if(actualResult.equals(expectedResult)) {
            return true;
        }
        return false;
    }
}
