package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_HomePage;
import pages.P04_SearchPage;
import pages.P05_ShoppingCartPage;

import static base.TestBase.driver;

public class D06_SearchAndAddingItemsToWishList {
    String ItemName;
    P01_HomePage HomePage = new P01_HomePage(driver);
    P04_SearchPage SearchPage =new P04_SearchPage(driver);
    P05_ShoppingCartPage ShoppingCartPage =new P05_ShoppingCartPage(driver);
    @Given(": User Redirected to home page after successful login")
    public void userRedirectedToHomePageAfterSuccessfulLogin() {
        HomePage.ClickOnLogoLink();
    }

    @When(": User Fill Search Field by phone")
    public void userFillSearchFieldByPhone() {
        HomePage.SetSearchField("phone");
    }

    @And(": Click on Search Button")
    public void clickOnSearchButton() {
        HomePage.ClickOnSearchButton();
    }

    @Then(": User Will redirected to Search Page")
    public void userWillRedirectedToSearchPage() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(),"Search");
    }

    @And(": User Clicks on Add to WishList for the first Item")
    public void userClicksOnAddToWishListForTheFirstItem() {
        ItemName = driver.findElement(By.xpath("//h2[@class='product-title']//a[@href='/htc-one-m8-android-l-50-lollipop']")).getText();
        SearchPage.ClickOnAddFirstItemToWishList();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": Message will appear as the addition to WishList happen successfully")
    public void messageWillAppearAsTheAdditionToWishListHappenSuccessfully() {
        Assert.assertEquals(driver.findElement(By.xpath("//a[@href='/wishlist'][1]")).getText(),"wishlist");
    }

    @And(": User Clicks On Message Link WishList")
    public void userClicksOnMessageLinkWishList() {
        SearchPage.ClickOnWishListLinkMessage();
    }

    @Then(": User is redirected to WishList Page")
    public void userIsRedirectedToWishListPage() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(),"Wishlist");
    }

    @And(": User Clicks on logo to go to Home Page")
    public void userClicksOnLogoToGoToHomePage() {
        ShoppingCartPage.ClickOnLogoLink();
    }

    @And(": User Clicks on WishList Link")
    public void userClicksOnWishListLink() {
        HomePage.ClickOnWishListPageLink();
    }

    @Then(": Added Item Is Placed In WishList")
    public void addedItemIsPlacedInWishList() {
        Assert.assertEquals(driver.findElement(By.xpath("//td[@class='product']//a[@href='/htc-one-m8-android-l-50-lollipop']")).getText(),ItemName);
    }
    @And(":User Clicks on Logout")
    public void userClicksOnLogout() {
        HomePage.ClickOnLogoutPageLink();

    }

    @Then(": User is Logged out")
    public void userIsLoggedOut() {
        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='ico-login']")).getText(),"Log in");
    }


}
