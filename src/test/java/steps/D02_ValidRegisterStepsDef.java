package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_HomePage;
import pages.P02_RegisterPage;

import static base.TestBase.driver;

public class D02_ValidRegisterStepsDef {
    P01_HomePage HomePage = new P01_HomePage(driver);
    P02_RegisterPage RegisterPage = new P02_RegisterPage(driver);

    @Given(": User Change Currency & navigate to register page")
    public void userChangeCurrencyNavigateToRegisterPage() {
        HomePage.SelectEuroCurrency();
        HomePage.ClickOnRegisterPageLink();

    }

    @When(":Selecting Gender")
    public void selectingGender() {
        RegisterPage.ClickOnFemaleGender();
    }

    @And(":Filling First name")
    public void fillingFirstName() {
        RegisterPage.SetFirstName("Maha");
    }

    @And(":Filling Last Name")
    public void fillingLastName() {
        RegisterPage.SetLastName("Ahmed");
    }

    @And(":Selecting Date of birth d-m-y")
    public void selectingDateOfBirthDMY() {
        RegisterPage.SetDay_DateOfBirthList("20");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RegisterPage.SetMonth_DateOfBirthList("3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RegisterPage.SetYear_DateOfBirthList("1980");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And(":Filling Email")
    public void fillingEmail() {
        RegisterPage.SetEmailField("M.AhmedDAAA@gmail.com");
    }

    @And(":Filling Company name")
    public void fillingCompanyName() {
        RegisterPage.SetCompanyField("XYZ");
    }

    @And(":Selecting Newsletter")
    public void selectingNewsletter() {
        RegisterPage.ClickOnNewsLetterCheckBox();
    }

    @And(": Filling Password")
    public void fillingPassword() {
        RegisterPage.SetPasswordField("M.ahmed@123");
    }

    @And(":Filling Confirm Password the same to Password Field")
    public void fillingConfirmPasswordTheSameToPasswordField() {
        RegisterPage.SetConfirmPasswordField("M.ahmed@123");
    }

    @And(":Clicking on Register Button")
    public void clickingOnRegisterButton() {
        RegisterPage.ClickOnRegisterButton();
    }

    @Then(":Success Message of Registration will appear")
    public void successMessageOfRegistrationWillAppear() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(),"Your registration completed");
    }



}
