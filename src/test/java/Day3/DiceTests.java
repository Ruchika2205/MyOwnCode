package Day3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DiceTests {

    WebDriver driver;
    By searchFieldKeyword = By.id("search-field-keyword");
    By searchFieldLocation = By.id("search-field-location");
    By findTechJobs = By.id("findTechJobs");
    By posiCountId = By.id("posiCountId");

    By login = By.id("Login_1");
    By email = By.id("Email_1");
    By password = By.id("Password_1");
    By lgnBtn = By.id("LoginBtn_1");
    By accountName = By.id("dice-login-customer-name");

    By forOne = By.id("for_one");
    By forLoc = By.id("for_loc");
    //By radiusS = By.xpath("//*[@id = 'radiusS']");
    By radiusS = By.xpath("//*[@id='radiusMileAnchor']");
    By advSearch = By.id("adv_search");


    By smartToggleCareer = By.id("smart-toggle-Career");
    By skillCenter = By.xpath("/html/body/div[5]/header/div[1]/div/div[2]/ul[1]/li[1]/ul/li[2]/a");
    By skill = By.id("s");
    //By skillSubmit = By.cssSelector("div.hidden-sm:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)");
    By skillSubmit = By.xpath("/html/body/div[5]/div/div[1]/div/div/div[1]/div/div/button");
    //By assertSkill = By.cssSelector(".skills-header > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h1:nth-child(1)");

    By assertSkill = By.cssSelector(".skills-header div:nth-child(1) div:nth-child(2) div:nth-child(1) h1:nth-child(1)");
    //By assertSkill = By.xpath("//*[@class='skills-header']/div/div[2]/div/h1");


    By partTimeCheckBox = By.xpath("//*[@class = 'typeChkBox' and @value = 'Part Time']");
    By assertPartTime = By.xpath("//h1[contains(text(),'Part-Time')]");

    String mainPage = "https://www.dice.com";


   @BeforeSuite
   public void setup()
   {
       String path = System.getProperty("user.dir")+"\\src\\test\\Resources\\geckodriver-v0.23.0-win64\\geckodriver.exe";
       System.setProperty("webdriver.gecko.driver", path);
       driver = new FirefoxDriver();
   }

   @AfterSuite
   public void afterSuite()
   {
       driver.quit();
   }

    @Test
    public void test001() {
        //Test Data
        String keywordForSearch = "Webdriver";
        String location ="San Francisco";
        OpenMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        findResults();
        assertFunction(posiCountId);

    }

    @Test
    public void test002() {
        //Test Data
        String keywordForSearch = "TestNG";
        String location ="San Francisco";
        OpenMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        findResults();
        assertFunction(posiCountId);

    }
    
    @Test
    public void test003() {
        OpenMainPage();
        String email_id = "ruchikasinha22@gmail.com";
        String pass = "Sqa0310*";
        driver.findElement(login).click();
        typeEmail(email_id);
        typePassword(pass);
        login();
        System.out.println(driver.findElement(accountName).getText());
        assertFunction(accountName);
        //Signout
        driver.findElement(accountName).click();
        driver.findElement(By.cssSelector("button.btn.btn-link")).click();
        Assert.assertEquals(pageTitle(),"Sign In");
    }


    
    @Test
    public void test004() {
        String keyword = "sqa";
        String city = "San Francisco";
        OpenMainPage();
        //driver.findElement(By.xpath("//form/fieldset/div[4]/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//*[text()='Advanced Search']")).click();
        typeKeywordInAdvance(keyword);
        typeCity(city);
        //scroll to slider
        //driver.findElement(By.id("telecommute2")).click();
        moveSlider(radiusS);
        clickAdvancedSearch();
        assertFunction(posiCountId);
    }


    //Search for part time jobs
    @Test
    public void test_partTime() {
        String keywordForSearch = "Webdriver";
        String location ="San Francisco";
        OpenMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        findResults();
        assertFunction(partTimeCheckBox);
        checkPartTime();
        assertFunction(assertPartTime);
    }

    @Test
    public void test_skills_Center() {
        String skillKeyword = "Software Testing";
        OpenMainPage();
        clickCareer();
        openSkillCenter();
        typeKeywordForSkill(skillKeyword);
        searchSkill();
        assertFunction(assertSkill);

    }


    //Responsive Design
    @Test
    public void test005()
    {
        OpenMainPage();
        boolean isDisplayed = driver.findElement(By.xpath("//button[@class= 'navbar-toggle']")).isDisplayed();
        Assert.assertFalse(isDisplayed);
        //exactly where the navbar-toggle gets visible(full size is (1000,1000)
        Dimension d = new Dimension(991,800);
        driver.manage().window().setSize(d);
        isDisplayed = driver.findElement(By.xpath("//button[@class= 'navbar-toggle']")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    
    //test001, test002, test_Part_Time methods start
    private void findResults() {
        driver.findElement(findTechJobs).click();
    }

    private void typeLocation(String location) {
        driver.findElement(searchFieldLocation).clear();
        driver.findElement(searchFieldLocation).sendKeys(location);
    }

    private void typeKeyword(String keywordForSearch) {
        driver.findElement(searchFieldKeyword).sendKeys(keywordForSearch);
    }
    //test001, test002, test_Part_Time methods end

    //Test003 methods start

    private void login() {
       driver.findElement(lgnBtn).click();
    }

    private void typePassword(String pass) {
       driver.findElement(password).sendKeys(pass);
    }

    private void typeEmail(String email_id) {
       driver.findElement(email).sendKeys(email_id);
    }

    private String pageTitle()
    {
        return driver.getTitle();

    }
    //Test003 methods end

    
    //Test004 method starts
    private void moveSlider(By radiusS) {
       WebElement slider = driver.findElement(radiusS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'left: 100%;')",slider);
        /*
        Actions action = new Actions(driver);

        Dimension sliderSize = slider.getSize();
        int sliderWidth = sliderSize.getWidth();
        int sliderHeight = sliderSize.getHeight();
        int xCoord = slider.getLocation().getX();
        int yCoord = slider.getLocation().getY();
       //action.moveToElement(slider, ((sliderWidth*xCoord)/100), 0).click();
        //System.out.println(slider.isDisplayed());
        action.moveToElement(slider);
        action.click();
       /*
        action.click(slider).build().perform();
        action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        action.dragAndDropBy(slider,sliderWidth+xCoord,0).build();
        //action.build();
        action.perform();
        */

       //slider = driver.findElement(radiusS);
       String sliderPercent = slider.getAttribute("style");
       System.out.println(sliderPercent);
       Assert.assertTrue(sliderPercent.contains("left: 100"));
    }

    private void clickAdvancedSearch() {
        driver.findElement(advSearch).click();
    }

    private void typeCity(String city) {
        driver.findElement(forLoc).clear();
       driver.findElement(forLoc).sendKeys(city);
    }

    private void typeKeywordInAdvance(String keyword) {
       driver.findElement(forOne).sendKeys(keyword);
    }
    //Test004 method ends


    
    //test_PartTime method
    private void checkPartTime() {
       driver.findElement(partTimeCheckBox).click();
    }

    
    // test_Skills_Center methods start
    private void searchSkill() {
       driver.findElement(skillSubmit).click();
    }

    private void typeKeywordForSkill(String skillKeyword) {
       driver.findElement(skill).sendKeys(skillKeyword);
    }

    private void openSkillCenter() {
        driver.findElement(skillCenter).click();
    }

    private void clickCareer() {
       driver.findElement(smartToggleCareer).click();
    }

    //test_Skills_Center methods end

    //Common methods for all test methods start

    private void OpenMainPage() {
        driver.get(mainPage);
    }
    
    private void assertFunction(By element) {
       waitForElement(element);
       boolean isDisplayed =  driver.findElement(element).isDisplayed();

        Assert.assertTrue(isDisplayed);
    }

    private void waitForElement(By elementId) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementId));
    }
    //Common methods for all test methods end

    

    
}
