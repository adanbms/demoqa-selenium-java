package pom;

import org.openqa.selenium.By;

public class BookStore {
    private By mainHeaderLocator = By.className("main-header");
    private String titlePage = "Book Store";

    public By getMainHeaderLocator() {
        return mainHeaderLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }
}
