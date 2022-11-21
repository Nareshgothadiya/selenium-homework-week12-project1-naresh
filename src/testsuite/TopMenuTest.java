package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Computers"));
        // This is expected from our requirment
        String expectextMessage = "Computers";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/computers']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Electronics"));
        // This is expected from our requirment
        String expectextMessage = "Electronics";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/electronics']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Apparel"));
        // This is expected from our requirment
        String expectextMessage = "Apparel";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/apparel']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Digital downloads"));
        // This is expected from our requirment
        String expectextMessage = "Digital downloads";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/digital-downloads']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Books"));
        // This is expected from our requirment
        String expectextMessage = "Books";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/books']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Jewelry"));
        // This is expected from our requirment
        String expectextMessage = "Jewelry";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/jewelry']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Gift Cards"));
        // This is expected from our requirment
        String expectextMessage = "Gift Cards";
        //find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/gift-cards']"));
        //Validate Actual and expected
        Assert.assertEquals(expectextMessage, actualMessage);  //Assert Statement

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
