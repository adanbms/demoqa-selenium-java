package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver; //inicializa el driver con el que está usando la clase de los Test
    }

    public void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
        }catch(Exception e){
            throw new Exception("Was not possible do click on " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try{
            return driver.findElement(element).isDisplayed();
        }catch(Exception e){
            throw new Exception(element + "was not found");
        }
    }

    public String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch(Exception e){
            throw new Exception(element + "was not found");
        }
    }
}
