package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumbasic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.tradingview.com/chart/cAWezuyp/");
        driver.navigate().back();
        driver.navigate().forward();


    }
}