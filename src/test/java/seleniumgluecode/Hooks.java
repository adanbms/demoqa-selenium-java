package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    private static FirefoxDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver.exe");
        driver =  new FirefoxDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static FirefoxDriver getDriver(){
        return driver;
    }
}
