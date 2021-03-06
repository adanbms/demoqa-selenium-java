package runner.abstract_factory;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    @Override
    protected void createDriver(){
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
