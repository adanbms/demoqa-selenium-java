package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStore extends BasePage{

    @FindBy(className = "main-header")
    private WebElement mainHeaderLocator;

    private String titlePage = "Book Store";

    public BookStore(WebDriver driver){
        super(driver);
    }

    public boolean isTitlePageDisplayed() throws Exception{
        return this.getText(mainHeaderLocator).equals(titlePage);
    }
}
