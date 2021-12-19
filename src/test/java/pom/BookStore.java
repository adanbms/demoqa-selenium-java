package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStore extends BasePage{
    private By mainHeaderLocator = By.className("main-header");
    private String titlePage = "Book Store";

    public BookStore(WebDriver driver){
        super(driver);
    }

    public boolean isTitlePageDisplayed() throws Exception{
        return this.getText(mainHeaderLocator).equals(titlePage);
    }
}
