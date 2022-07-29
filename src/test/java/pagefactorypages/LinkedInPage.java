package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInPage extends BasePage {

    @FindBy(css = "[data-test-id='nav-logo']")
    private WebElement LinkedInLogo;

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpenedPage() {
        return LinkedInLogo.isDisplayed();
    }

    public boolean isLinkedInLogoDisplayed() {
        return LinkedInLogo.isDisplayed();
    }

}
