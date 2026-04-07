package stepdefinition;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusablecode.LaunchBrowser;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static reusablecode.LaunchBrowser.driver;

public class Hooks {

    @Before
    public void setUp() throws IOException {
        System.out.println("Browser opened");
        LaunchBrowser.naviagteToHomePage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Browser closed");
        driver.quit();
    }

    @AfterStep
  public void takeScreenShot(Scenario sc){
        byte[] screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(screenshotAs,"image/png", sc.getName());


    }
    @BeforeStep
    public void takeScreenshot(){
        System.out.println("before step");
    }
}
