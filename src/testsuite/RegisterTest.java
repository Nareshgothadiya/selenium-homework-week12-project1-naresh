package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Register"));
        // This is expected from our requirment
        String expectextMessage = "Register";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//h1[text()='Register']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Register"));
        clickOnElement(By.id("gender-male"));

        sendTextToElement(By.id("FirstName"), "prime");
        sendTextToElement(By.name("LastName"), "testing123");

        //sendTextToElement(By.name("DateOfBirthDay:"), "13");
       // sendTextToElement(By.name("DateOfBirthMonth"), "November");
       // sendTextToElement(By.name("DateOfBirthYear"), "1982");

        sendTextToElement(By.name("Email"), "testing147@gmail.com");
        sendTextToElement(By.name("Password"), "testing123");
        sendTextToElement(By.name("ConfirmPassword"), "testing123");
        clickOnElement(By.xpath("//button[text()='Register']"));


        // This is expected from our requirment
        String expectextMessage = "Your registration completed";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        //Validate Actual and expected  //div[text()='Your registration completed']
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
