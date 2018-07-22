package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.Constant;

import java.io.File;
import java.io.IOException;

public class BaseClass {

    public static WebDriver driver;
    @BeforeTest
    public static void intialiseWebdriver()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(Constant.URL);
    }

    @AfterMethod
    public static void onTestFailureScreenShot(ITestResult result) throws IOException
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            File screenshotFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("E:\\failure.png"));
        }
    }

    //Test1234
    @AfterTest
    public static void closeBrowser() throws IOException
    {
            driver.quit();
    }
}
