import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase2 {
    WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void test_case() {
        String baseUrl = "https://www.gmail.com";
        driver.get(baseUrl);
        String testTitle = "Gmail";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle, testTitle);

    }
    @AfterMethod
    public void CloseBrowser()
    {
        driver.close();
    }
}
