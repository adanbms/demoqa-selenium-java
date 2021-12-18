package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HappyPath {
    private FirefoxDriver driver = Hooks.getDriver();

    @Given("^An user is on the QATools page$")
    public void an_user_is_on_the_QATools_page() throws Throwable {
        WebElement mainBannerLocator =  driver.findElement(By.className("banner-image"));
        mainBannerLocator.isDisplayed();
    }

    @When("^clicks on  BookStoreAplication option$")
    public void clicks_on_BookStoreAplication_option() throws Throwable {
        WebElement bookStoreLocator = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[2]/svg/path"));
        bookStoreLocator.click();
    }

    @Then("^will be redirected to the BookStore$")
    public void will_be_redirected_to_the_BookStore() throws Throwable {
        WebElement mainHeaderLocator = driver.findElement(By.className("main-header"));
        Assert.assertEquals("Book Store", mainHeaderLocator.getText());
    }
}
