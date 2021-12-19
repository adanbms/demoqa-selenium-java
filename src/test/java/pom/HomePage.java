package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(className = "banner-image")
    private WebElement mainBannerLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[6]/div")
    private WebElement bookStoreLocator;

    public HomePage(WebDriver driver){
        super(driver);
    }

    //Make this methods here could be redundant but is like POM should be implemented
    public boolean mainBannerIsDisplayed() throws Exception {
        return this.isDisplayed(mainBannerLocator);
    }

    public void clickOnBookStoreElement() throws Exception {
        this.click(bookStoreLocator);
    }
}
