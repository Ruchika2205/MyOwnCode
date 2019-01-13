package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XPathTests {

    WebDriver driver;

    @Test
    public void test001() {
        String path = "C:\\Users\\Vijay\\IdeaProjects\\JavaBootCampNov\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);

        driver = new FirefoxDriver();
        String url = "http://52.9.182.211:3001/v1/log-in";
        driver.get(url);
        //Absolute path
        String xPath1 = "/html/body/div/div/form/div/div[1]/div/input";
        //Relative Path
        String xPath2 = "//form/div/div[1]/div/input";
        //Single attribute with tag name
        String xPath3 = "//input[@name='restaurant_id']";
        driver.findElement(By.xpath(xPath1)).sendKeys("Testing");
        //Single attribute without tag name
        String xPath4 = "//input[@name='email']";
        driver.findElement(By.xpath(xPath2)).sendKeys("testing@gmail.com");
        //Multiple Attribute
        String xPath5 = "//input[@name='password'][@type='password]";
        //Using AND
        String xPath6 = "//input[@name='password' and @type='password]";
        //Using OR
        String xPath7 = "//*[@name='password' or @type='password]";
        //Start-with()
        String xPath8 = "//*[starts-with(@name,'pass')]";
        driver.findElement(By.xpath(xPath6));
        //Start-with() without any characters. Will give multiple elements. Use findElements
        String xPath9 = "//*[starts-with(@name,'')]";
        //Text
        String xPath10 = "//*[text()='Log In']";
        //Last
        String xPath11 = "//*[@type='text'][last()]";
        //Position
        String xPath12 = "//*[@type='text'][position()=1]";
        //Following
        //Preceding




    }
}
