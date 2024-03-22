package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P02_RegisterPage extends P00_BasePage{
    public P02_RegisterPage(WebDriver Driver) {
        super(Driver);
    }
    By LogoLink = By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']");
    public void ClickOnLogoLink(){
        ClickOnElement(LogoLink);
    }
    By FemaleGender = By.id("gender-female");
    public void ClickOnFemaleGender(){
        ClickOnElement(FemaleGender);
    }
    By FirstNameField = By.id("FirstName");
    public void SetFirstName(String Text){
        SetElementText(FirstNameField,Text);
    }
    By LastNameField = By.id("LastName");
    public void SetLastName(String Text){
        SetElementText(LastNameField,Text);
    }
    By Day_DateOfBirthList = By.xpath("//select[@name='DateOfBirthDay']");
    public void SetDay_DateOfBirthList(String Text){
        Select SelectDay = new Select(driver.findElement(Day_DateOfBirthList));
        SelectDay.selectByVisibleText(Text);
    }
    By Month_DateOfBirthList = By.xpath("//select[@name='DateOfBirthMonth']");
    public void SetMonth_DateOfBirthList(String MonthNumber){
        Select SelectMonth = new Select(driver.findElement(Month_DateOfBirthList));
        SelectMonth.selectByValue(MonthNumber);
    }

    By Year_DateOfBirthList = By.xpath("//select[@name='DateOfBirthYear']");
    public void SetYear_DateOfBirthList(String YearNumber){
        Select SelectYear = new Select(driver.findElement(Year_DateOfBirthList));
        SelectYear.selectByValue(YearNumber);
    }

    By EmailField = By.id("Email");
    public void SetEmailField(String Text){
        SetElementText(EmailField,Text);
    }

    By CompanyField = By.id("Company");
    public void SetCompanyField(String Text){
        SetElementText(CompanyField,Text);
        }
    By NewsLetterCheckBox = By.id("Newsletter");
    public void ClickOnNewsLetterCheckBox(){
        ClickOnElement(NewsLetterCheckBox);
    }
    By PasswordField = By.id("Password");
    public void SetPasswordField(String Text){
        SetElementText(PasswordField, Text);
    }
    By ConfirmPasswordField = By.id("ConfirmPassword");
    public void SetConfirmPasswordField(String Text){
        SetElementText(ConfirmPasswordField, Text);
    }
    public void ResetConfirmPasswordField(String Text){
        ResetElementText(ConfirmPasswordField, Text);
    }

    By RegisterButton = By.id("register-button");
    public void ClickOnRegisterButton(){
        ClickOnElement(RegisterButton);
    }

}
