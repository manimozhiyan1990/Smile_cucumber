package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusablecode.LaunchBrowser;

import static reusablecode.LaunchBrowser.driver;

public class Amazon extends LaunchBrowser {

    @When("user enter search Product name {string} in search box")
    public void userEnterSearchProductNameInSearchBox(String productname) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);

    }

    @And("user click the search box button")
    public void userClickTheSearchBoxButton() {
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    @Then("user validate title of home page")
    public void userValidateTitleOfHomePage() {
        String expectedTitle = "Amazon.in : Table";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    public void testMethod(){
        System.out.println("Git test Passed");
    }
}

