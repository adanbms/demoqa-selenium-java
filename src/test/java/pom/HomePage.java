package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By mainBannerLocator =  By.className("banner-image");
    private By bookStoreLocator = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div");

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
