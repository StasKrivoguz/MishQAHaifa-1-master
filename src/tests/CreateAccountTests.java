package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CreateAccountTests extends TestBase{

        public void createNewAccountTest() {
            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),20);
            WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
            createAccount.click();


            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Cancel')]"),20);
            WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
            mailField.click();
            mailField.sendKeys(generateRandomWord(10) + "@gmail.com");


            WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
            passwordField.click();
            passwordField.sendKeys("example");

            WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
            repPasswordField.click();
            repPasswordField.sendKeys("example");

            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
            WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
            registrationButton.click();

            waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"), 20);
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));

        }
    @Test
    public void createNewAccountAndLoginTest() {
            waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),20);
        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(generateRandomWord(8)+"@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"), 20);

       /* WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));*/

      /*  WebElement cancelButton = driver
                .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        //menuButton = driver.findElement(By.cssSelector('mat-icon.but.mat-icon'));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("mishUser37784@gmail.com");


        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();

        waitUntilElementIsLoaded(driver,By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        WebElement iconMenu1 = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu1.getAttribute("mattooltip").equals("Menu"));*/
    }
    }

