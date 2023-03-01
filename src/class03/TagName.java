package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //using tagname to find all links on the webpage
        //we can save them all into an arraylist
     List<WebElement> links= driver.findElements(By.tagName("a"));
     //print elements of the list
        for(WebElement e:links){
         String s=e.getAttribute("href");
            System.out.println(s);
        }

    }
}
