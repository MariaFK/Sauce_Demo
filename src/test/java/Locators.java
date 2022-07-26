import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(USERNAME);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);

        //find by className
        WebElement loginButton = driver.findElement(By.className("submit-button"));

        loginButton.click();

        //find by tagname (there is not unique tagname)
        WebElement titleProduct = driver.findElement(By.tagName("span"));

        //find by linktext
        WebElement twitterLink = driver.findElement(By.linkText("Twitter"));

        //find by partial linkText
        WebElement linkedInLink = driver.findElement(By.partialLinkText("Linked"));

        //find by xPath
        //by attribute
        WebElement sortButtonZtoA = driver.findElement(By.xpath("//option[@value='za']"));
        //by text
        WebElement sortButtonLowToHigh = driver.findElement(By.xpath("//option[text()='Price (low to high)']"));
        //by partial content of the attrubute
        WebElement sortButtonHighToLow = driver.findElement(By.xpath("//option[contains(@value,'hil')]"));
        //by partial text
        WebElement sortButtonAtoZ = driver.findElement(By.xpath("//option[contains(text(),'to Z')]"));
        //by ancestor
        WebElement socialNetworks = driver.findElement(By.xpath("//a[contains(text(),'Twitter')]/ancestor::ul"));
        //by parent
        WebElement priceAndAddToCartField = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/parent::div"));
        //search with AND
        WebElement imageOfBackpack = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack' and @class='inventory_item_img']"));

        // find by css
        //by className
        WebElement menuButton = driver.findElement(By.cssSelector(".bm-burger-button"));
        //by id
        WebElement menu = driver.findElement(By.cssSelector("#bm-menu-wrap"));
        //by tagname
        WebElement menuButton1 = driver.findElement(By.cssSelector(".bm-burger-button button"));
        //by attribute
        WebElement sortButton = driver.findElement(By.cssSelector("[class^=product]"));
        WebElement facebookLink = driver.findElement(By.cssSelector("[class$=_facebook]"));
        WebElement inventoryElements = driver.findElement(By.cssSelector("[class*=inventory]"));
        menuButton1.click();
        WebElement AllItemsButton = driver.findElement(By.cssSelector(".bm-item-list :first-child"));
        WebElement logOutButton = driver.findElement(By.cssSelector(".bm-item-list :nth-child(3)"));
    }

}
