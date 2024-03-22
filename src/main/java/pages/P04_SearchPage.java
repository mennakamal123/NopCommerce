package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_SearchPage extends P00_BasePage{
    public P04_SearchPage(WebDriver Driver) {
        super(Driver);
    }


    By AddFirstItemToCart = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    public void ClickOnAddFirstItemToCart(){
        ClickOnElement(AddFirstItemToCart);
    }
    By ShoppingCartLinkInMessage = By.xpath("//p[@class='content']//a[@href='/cart'][1]");
    public void ClickOnShoppingCartLinkInMessage(){
        ClickOnElement(ShoppingCartLinkInMessage);
    }

    By AddFirstItemToWishList = By.xpath("//button[@title='Add to wishlist']");
    public void ClickOnAddFirstItemToWishList(){
        ClickOnElement(AddFirstItemToWishList);
    }

    By WishListLinkMessage = By.xpath("//a[@href='/wishlist'][1]");
    public void ClickOnWishListLinkMessage(){
        ClickOnElement(WishListLinkMessage);
    }


}
