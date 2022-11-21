package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));

        //this is expected from our requirment
        String expectedTextMessage = "Welcome, Please Sign In!";

        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        //Validate Actual and expected text
        Assert.assertEquals(expectedTextMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "prime123@gmail.com");
        sendTextToElement(By.name("Password"), "testing123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //this is expected from our requirment
        String expectedTextMessage = "Log out";

        //find the welcome text elements and get text
        String actualmessage = getTextFromElement(By.xpath("//a[@href='/logout']"));

        //Validate Actual and expected text
        Assert.assertEquals(expectedTextMessage, actualmessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "prime123@gmail.com");
        sendTextToElement(By.name("Password"), "testing123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //this is expected from our requirment
        String expectedTextMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";

        //find the welcome text elements and get text
        String actualmessage = getTextFromElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        //li[contains(text(),'No customer account found')]
        //Validate Actual and expected text
        Assert.assertEquals(expectedTextMessage, actualmessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}