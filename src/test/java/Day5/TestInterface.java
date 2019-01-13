package Day5;

import org.testng.annotations.Test;

public class TestInterface {
    Selenium driver;

    @Test
    public void getTitle()
    {
        String path = System.getProperty("user.dir")+"\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new RuchikaWebDriver();
    }
}
