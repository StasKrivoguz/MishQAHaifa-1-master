package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHelper extends PageBase {

    public LoginPageHelper(WebDriver driver){
        super(driver);
    }
    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Cancel')]"),
                20);
    }
    public String goToLoginButton(){
        WebElement goToLoginButton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        return goToLoginButton.getText();
    }
    public void pressToLoginButton(){
        WebElement goToLoginButton = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        goToLoginButton.click();
    }

}
