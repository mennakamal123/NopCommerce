package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_LoginPage extends P00_BasePage{
    public P03_LoginPage(WebDriver Driver) {
        super(Driver);
    }
    By EmailField = By.id("Email");
    public void SetEmailField(String Text) {
        SetElementText(EmailField,Text);
    }
    By PasswordField = By.id("Password");
    public void SetPasswordField(String Text){
        SetElementText(PasswordField,Text);
    }
    By RememberMeCheckBox = By.id("RememberMe");
    public void ClickOnRememberMeCheckBox(){
        ClickOnElement(RememberMeCheckBox);
    }
    By LoginButton = By.xpath("//button[@class='button-1 login-button']");
    public void ClickOnLoginButton(){
        ClickOnElement(LoginButton);
    }


}
