package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ResultsPageLocators {
    //@FindBy(how = How.CLASS_NAME, using = "a-price-whole")
    @FindBy(how = How.CLASS_NAME, using = "s-image")
    public List<WebElement> priceList;
}
