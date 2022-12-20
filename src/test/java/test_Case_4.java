import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_Case_4 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("WebDriver.chrome.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }


    @Test
    public void test_Case() {
        String baseUrl = "https://www.microsoft.com";
        driver.get(baseUrl);
        String testTitle = "Microsoft – Cloud, Computers, Apps & Gaming";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle, testTitle);

    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
