package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsUnAutPageHelper extends PageBase{

    public EventsUnAutPageHelper(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Filters')]"),20);
    }

    public String getHeader() {
        WebElement titlePage = driver.findElement(By
                .xpath("//h1[@class='gorisontal-center']"));
        return titlePage.getText();
    }
}
