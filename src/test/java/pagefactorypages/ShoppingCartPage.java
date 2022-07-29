package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(css = "[class='inventory_item_name']")
    private WebElement itemName;

    @FindBy(css = "[class='inventory_item_price']")
    private WebElement itemPrice;

    @FindBy(id = "continue-shopping")
    private WebElement continueShoppingButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpenedPage() {
        return continueShoppingButton.isDisplayed();
    }

    public String itemName() {
        return itemName.getText();
    }

    public String expectedItemName() {
        return "Sauce Labs Backpack";
    }

    public String itemPrice() {
        return itemPrice.getText();
    }

    public String expectedItemPrice() {
        return "$29.99";
    }
}
