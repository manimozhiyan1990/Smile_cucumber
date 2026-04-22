package reusablecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class LaunchBrowser {


public static WebDriver driver;


    public static void naviagteToHomePage() throws IOException {
        File file = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prob = new Properties();
        prob.load(fis);
        switch (prob.getProperty("browser").toLowerCase()){
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firebox":
                driver= new FirefoxDriver();
                break;

            default:
                throw new InvalidPropertiesFormatException("Enter valid browser");

        }
        driver.get(prob.getProperty("url"));

    }
}
