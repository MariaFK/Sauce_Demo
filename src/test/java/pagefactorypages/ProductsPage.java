package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class ProductsPage extends BasePage {

    @FindBy(css = "[name='add-to-cart-sauce-labs-backpack']")
    private WebElement addItemToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//li[@class='social_linkedin']//a")
    private WebElement linkedInIcon;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpenedPage() {
        return addItemToCartButton.isDisplayed();
    }

    public ProductsPage clickAddItemToCartButton() {
        addItemToCartButton.click();
        return this;
    }

    public ShoppingCartPage clickShoppingCartButton() {
        shoppingCartButton.click();
        return new ShoppingCartPage(driver);
    }

    public LinkedInPage clickLinkedInIcon() {
        linkedInIcon.click();
        return new LinkedInPage(driver);
    }

    public LinkedInPage switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return new LinkedInPage(driver);
    }
}
