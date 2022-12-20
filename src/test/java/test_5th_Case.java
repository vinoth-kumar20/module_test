import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_5th_Case {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("WebDriver.chrome.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void test_case_5() {
        String baseUrl = "https://ultimateqa.com/";
        driver.get(baseUrl);
        String testTitle = "Homepage - Ultimate QA";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle, testTitle);

    }
    @AfterMethod
    public void CloseBrowser()
    {
        driver.close();
    }
}
