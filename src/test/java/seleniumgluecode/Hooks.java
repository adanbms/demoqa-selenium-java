package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.abstract_factory.DriverManager;
import runner.abstract_factory.DriverType;
import runner.abstract_factory.FactoryDriverManager;

public class Hooks {
    private static WebDriver driver;
    private static DriverManager driverManager;

    @Before
    public void setUp(){
        driverManager = FactoryDriverManager.getManager(DriverType.FIREFOX);
        driver =  driverManager.getDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
