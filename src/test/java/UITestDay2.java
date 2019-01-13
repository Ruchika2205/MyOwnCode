import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UITestDay2 {

    @Test
    public void test001() {
        String path = "C:\\Users\\Vijay\\IdeaProjects\\JavaBootCampNov\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
    }

    @Test
    public void test002() {
        String path = "C:\\Users\\Vijay\\IdeaProjects\\JavaBootCampNov\\src\\test\\Resources\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }


}
