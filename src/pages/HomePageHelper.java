package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends PageBase{

    public HomePageHelper(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),45);

    }
}
