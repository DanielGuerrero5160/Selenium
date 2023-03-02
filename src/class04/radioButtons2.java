package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site syntax site
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //find all the age group radio buttons
       List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@name='ageGroup']"));
//iterate over the list to see desired button
       for(WebElement e:radioButtons){
           String age=e.getAttribute("value");
           //if the value of the element is 5-10, click on it
           if(age.equalsIgnoreCase("5 - 15")){
               e.click();
           }
}

    }
}
