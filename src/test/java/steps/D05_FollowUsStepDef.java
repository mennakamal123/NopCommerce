package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_HomePage;

import java.util.ArrayList;

import static base.TestBase.driver;

public class D05_FollowUsStepDef {
    ArrayList<String> tabs;
    P01_HomePage HomePage = new P01_HomePage(driver);

    @Given(": User Is in Home Page")
    public void userIsInHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        tabs = new ArrayList<>(driver.getWindowHandles());
    }

    @And(": User Clicks On Facebook Link")
    public void userClicksOnFacebookLink() {
        HomePage.ClickOnFacebookFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to Facebook TAP")
    public void userIsRedirectedToFacebookTAP() {
       Assert.assertEquals(driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']")).getText(),"See more on Facebook");
        closeCurrentTab();
    }

    @And(": User Clicks On X Link")
    public void userClicksOnXLink() {
        HomePage.ClickOnXFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to X TAP")
    public void userIsRedirectedToXTAP() {
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3'][1]")).getText(),"Don’t miss what’s happening");
        closeCurrentTab();
    }

    @And(": User Clicks On Youtube Link")
    public void userClicksOnYoutubeLink() {
        HomePage.ClickOnYoutubeFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to Youtube TAP")
    public void userIsRedirectedToYoutubeTAP() {
       // Assert.assertEquals(driver.findElement(By.id("tile")).getText(),"Playlists by nopCommerce");
        //yt-formatted-string[@class='style-scope ytd-guide-signin-promo-renderer']
        Assert.assertEquals(driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-guide-signin-promo-renderer']")).getText(),"Sign in to like videos, comment, and subscribe.");
        closeCurrentTab();
    }

    private void switchToNewTab() {
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    private void closeCurrentTab() {
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }


}
