package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeTest
    public void StartBrowser(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.navigate().to("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();
    }

    @AfterTest
    public void CloseBrowser(){
       driver.quit();
        }



}
