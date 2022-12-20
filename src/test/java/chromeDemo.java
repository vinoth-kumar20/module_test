import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeDemo {
   @Test
    public void chrome(){
        System.setProperty("webDriver.chrome.driver",
                "C:\\Users\\VINOTH\\IdeaProjects\\module_test\\browserdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}
