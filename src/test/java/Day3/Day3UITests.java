package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Day3UITests {

    WebDriver driver;
    @Test
    public void test001() {
        String path = "C:\\Users\\Vijay\\IdeaProjects\\JavaBootCampNov\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);

        driver = new FirefoxDriver();
        openMainPage();
        typeQuery("Automation");
        submitQuery();
        checkingResult();
        openFirstLink();
    }


    private void openFirstLink() {
        List<WebElement> lsElement = driver.findElements(By.tagName("a"));
        System.out.println(lsElement.get(95).getText());
    }

    private void checkingResult() {
        boolean isDisplayed= driver.findElement(By.id("resultStats")).isDisplayed();
        System.out.println("isDisplayed:"+isDisplayed);
    }

    private void submitQuery() {
        driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
    }

    private void typeQuery(String query) {
       driver.findElement(By.cssSelector(".gLFyf")).sendKeys(query);

    }

    private void openMainPage()
    {
        driver.get("http://google.com");
    }
}
