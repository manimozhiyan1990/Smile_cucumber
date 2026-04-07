package javabasics;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asserations {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
       String actualTitle = driver.getTitle();
       String expectedTitle = "Facebook";

        System.out.println(driver.getTitle());

      Assert.assertEquals(expectedTitle,actualTitle);

       System.out.println("Test passed");
    }


}
