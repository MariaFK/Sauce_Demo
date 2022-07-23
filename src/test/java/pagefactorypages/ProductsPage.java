package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(css = "[name='add-to-cart-sauce-labs-backpack']")
    private WebElement addItemToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddItemToCartButton() {
        addItemToCartButton.click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }
}
