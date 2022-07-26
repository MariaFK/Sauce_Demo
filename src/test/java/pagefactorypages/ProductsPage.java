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

    public void clickAddItemToCartButton() {
        addItemToCartButton.click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    public void clickLinkedInIcon() {
        linkedInIcon.click();
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
