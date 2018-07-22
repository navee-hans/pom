package logintest;

import Base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Constant;

public class LoginTest extends BaseClass{

    @Test
    public void LoginTest()
    {
        LoginPage loginpage = PageFactory.initElements(BaseClass.driver, LoginPage.class);
        loginpage.inValidLogin(Constant.UserName, Constant.PassWord);
        HomePage homepage = new HomePage(driver);
        Assert.assertFalse(homepage.userNameDisplayed(Constant.ActualResult));
    }

}
