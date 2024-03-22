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

public class D01_InvalidRegisterStepDef {
    P01_HomePage HomePage = new P01_HomePage(driver);
    P02_RegisterPage RegisterPage = new P02_RegisterPage(driver);

    @Given(": User CChange Currency & navigate to register page")
    public void userCChangeCurrencyNavigateToRegisterPage() {
        HomePage.SelectEuroCurrency();
        HomePage.ClickOnRegisterPageLink();

    }
    @When(":Selecting GGender")
    public void selectingGGender() {
        RegisterPage.ClickOnFemaleGender();
    }

    @And(":Filling FFirst name")
    public void fillingFFirstName() {
        RegisterPage.SetFirstName("Maha");
    }

    @And(":Leaving Last Name without Filling")
    public void leavingLastNameWithoutFilling() {
        RegisterPage.SetLastName("");
    }

    @And(":Selecting DDate of birth d-m-y")
    public void selectingDDateOfBirthDMY() {
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

    @And(":Filling EEmail")
    public void fillingEEmail() {
        RegisterPage.SetEmailField("M.AhmedDDDDDAA@gmail.com");
    }

    @And(":Filling CCompany name")
    public void fillingCCompanyName() {
        RegisterPage.SetCompanyField("XYZ");
    }

    @And(":Selecting NNewsletter")
    public void selectingNNewsletter() {
        RegisterPage.ClickOnNewsLetterCheckBox();
    }

    @And(": Filling PPassword")
    public void fillingPPassword() {
        RegisterPage.SetPasswordField("M.ahmed@123");
    }

    @And(":Filling CConfirm Password the same to Password Field")
    public void fillingCConfirmPasswordTheSameToPasswordField() {
        RegisterPage.SetConfirmPasswordField("M.ahmed@123");
    }

    @And(":Clicking on RRegister Button")
    public void clickingOnRRegisterButton() {
        RegisterPage.ClickOnRegisterButton();
    }

    @Then(":Error Message of Registration will appear that Last name is required.")
    public void errorMessageOfRegistrationWillAppearThatLastNameIsRequired() {

        Assert.assertEquals(driver.findElement(By.id("LastName-error")).getText(),"Last name is required.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And(":Filling LLast Name")
    public void fillingLLastName() {
        RegisterPage.SetLastName("Ahmed");

    }

    @And(": Filling Confirm Password NOT the same to Password Field")
    public void fillingConfirmPasswordNOTTheSameToPasswordField() {
        RegisterPage.ResetConfirmPasswordField("M.ahmed@456");
    }
    @And(":Clicking on RRRegister Button")
    public void clickingOnRRRegisterButton() {
        RegisterPage.ClickOnRegisterButton();
    }

    @Then(":Error Message of Registration will appear that Password do not match.")
    public void errorMessageOfRegistrationWillAppearThatPasswordDoNotMatch() {
        Assert.assertEquals(driver.findElement(By.id("ConfirmPassword-error")).getText(),"The password and confirmation password do not match.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
