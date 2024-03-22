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

public class D04_SearchAndAddingItemsToCartStepDef {
    String ItemName;
    P01_HomePage HomePage = new P01_HomePage(driver);
    P04_SearchPage SearchPage =new P04_SearchPage(driver);
    P05_ShoppingCartPage ShoppingCartPage =new P05_ShoppingCartPage(driver);
    @Given(": User redirected to home page after successful login")
    public void userRedirectedToHomePageAfterSuccessfulLogin() {
        HomePage.ClickOnLogoLink();
    }

    @When(": User fill Search Field by Laptop")
    public void userFillSearchFieldByLaptop() {
        HomePage.SetSearchField("Laptop");
    }

    @And(": Click On Search Button")
    public void clickOnSearchButton() {
        HomePage.ClickOnSearchButton();
    }

    @Then(": User will redirected to Search Page")
    public void userWillRedirectedToSearchPage() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(),"Search");
    }

    @And(": User Clicks on Add to cart for the first Item")
    public void userClicksOnAddToCartForTheFirstItem() {
        ItemName = driver.findElement(By.xpath("//div[@class='details']//a[@href='/asus-n551jk-xo076h-laptop']")).getText();
        SearchPage.ClickOnAddFirstItemToCart();
     try {
      Thread.sleep(4000);
     } catch (InterruptedException e) {
      e.printStackTrace();
     }

    }

    @Then(": Message will appear as the addition to cart happen successfully")
    public void messageWillAppearAsTheAdditionToCartHappenSuccessfully() {
     Assert.assertEquals(driver.findElement(By.xpath("//p[@class='content']")).getText(),"The product has been added to your shopping cart");
    }

    @And(": User Clicks On Message Link Shopping Cart")
    public void userClicksOnMessageLinkShoppingCart() {
     SearchPage.ClickOnShoppingCartLinkInMessage();
    }

    @Then(": User is redirected to Shopping Cart Page")
    public void userIsRedirectedToShoppingCartPage() {
     Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(),"Shopping cart");
    }

    @And(": User Clicks on Logo to go to Home Page")
    public void userClicksOnLogoToGoToHomePage() {
     ShoppingCartPage.ClickOnLogoLink();
    }

    @And(": User Clicks on Shopping Cart Link")
    public void userClicksOnShoppingCartLink() {
     HomePage.ClickOnShoppingCartPageLink();
    }

    @Then(": Added Item Is Placed On Cart")
    public void addedItemIsPlacedOnCart() {
        Assert.assertEquals(driver.findElement(By.xpath("//td[@class='product']//a[@href='/asus-n551jk-xo076h-laptop']")).getText(),ItemName);
    }
}
