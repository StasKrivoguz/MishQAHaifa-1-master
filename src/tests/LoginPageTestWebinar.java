package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventAuthPageHelperWebinar;
import pages.HomePageHelperWebinar;
import pages.LoginPageHelperWebinar;
import org.testng.Assert;
import pages.*;

public class LoginPageTestWebinar extends TestBase{
HomePageHelperWebinar homePageWebinar;
LoginPageHelperWebinar loginPageWebinar;
EventAuthPageHelperWebinar eventAuthPageWebinar;

@BeforeMethod
    public void initPage(){
    homePageWebinar = PageFactory.initElements(driver,HomePageHelperWebinar.class);
    loginPageWebinar = PageFactory.initElements(driver,LoginPageHelperWebinar.class);
    eventAuthPageWebinar = PageFactory.initElements(driver, EventAuthPageHelperWebinar.class);
}
@Test
public void  loginPositive(){
    homePageWebinar.pressLoginButton();
    loginPageWebinar.waitUntilPageIsLoaded();
    loginPageWebinar.enterValueToFieldEmail("mishUser1@gmail.com");
    loginPageWebinar.enterValueToFieldPassword("example");
    loginPageWebinar.pressLogInButton();
    eventAuthPageWebinar.waitUntilPageLoaded();
    Assert.assertEquals("Menu",eventAuthPageWebinar.getToolTipIconMenu());
    Assert.assertTrue(eventAuthPageWebinar.isHeaderPageCorrect("Find event"));
}
    @Test
    public void negativeLogin(){
        homePageWebinar.waitUntilPageIsLoaded();
        homePageWebinar.pressMenuButton();
        homePageWebinar.pressLogOutButton();
        homePageWebinar.pressLoginButton();
        loginPageWebinar.waitUntilPageIsLoaded();
        loginPageWebinar.enterValueToFieldEmail("misshUser1@gmail.com");
        loginPageWebinar.enterValueToFieldPassword("example");
        loginPageWebinar.pressLogInButton();
        Assert.assertTrue(loginPageWebinar.isAlertTextCorrect("Wrong authorization, login or password"));
    }
}
