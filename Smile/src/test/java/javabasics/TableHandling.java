package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://en.wikipedia.org/wiki/Infosys");
        WebElement element = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody//tr[1]//td[2]"));

        System.out.println(  element.getText());

        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody"));
       for(WebElement Elements : elements){
           WebElement list = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody"));
           System.out.println(list.getText());
       }




        Thread.sleep(3000);
        driver.close();
    }
}
