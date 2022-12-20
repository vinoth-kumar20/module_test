import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase3 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void test_Case_3() {
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
        String testTitle = "Facebook – log in or sign up";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle, testTitle);

    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}

