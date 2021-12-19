package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HappyPath extends TestBase{
    @Given("^An user is on the QATools page$")
    public void an_user_is_on_the_QATools_page() throws Throwable {
        Thread.sleep(1000); //this line will be updated in future
        WebElement mainBannerLocator = driver.findElement(homePage.getMainBannerLocator());
        mainBannerLocator.isDisplayed();
    }

    @When("^clicks on  BookStoreAplication option$")
    public void clicks_on_BookStoreAplication_option() throws Throwable {
        WebElement bookStoreLocator = driver.findElement(homePage.getBookStoreLocator());
        bookStoreLocator.click();
    }

    @Then("^will be redirected to the BookStore$")
    public void will_be_redirected_to_the_BookStore() throws Throwable {
        WebElement mainHeaderLocator = driver.findElement(bookStore.getMainHeaderLocator());
        Assert.assertEquals(bookStore.getTitlePage(), mainHeaderLocator.getText());
    }
}
