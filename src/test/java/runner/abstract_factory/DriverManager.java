package runner.abstract_factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected static WebDriver driver;

    protected abstract void createDriver();

    public void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(){
        if(driver==null){
            createDriver();
        }
        return driver;
    }
}
