import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.*;



public class caseFile
{



//    public void openBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//    }

    @Test
    public void test_case()
    {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.google.co.in";
        driver.get(baseUrl);
        String testTitle = "Google";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle, testTitle);

        driver.close();

    }
  /*  @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }*/
}
