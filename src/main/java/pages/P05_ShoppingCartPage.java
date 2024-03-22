package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_ShoppingCartPage extends P00_BasePage{
    public P05_ShoppingCartPage(WebDriver Driver) {
        super(Driver);
    }
        By LogoLink = By.xpath("//img[@alt='nopCommerce demo store']");
    public void ClickOnLogoLink(){
        ClickOnElement(LogoLink);
    }
}
