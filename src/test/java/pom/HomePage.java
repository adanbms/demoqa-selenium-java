package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private By mainBannerLocator =  By.className("banner-image");
    private By bookStoreLocator = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div");

    public By getBookStoreLocator() {
        return bookStoreLocator;
    }

    public By getMainBannerLocator() {
        return mainBannerLocator;
    }
}
