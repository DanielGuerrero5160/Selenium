package class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class class04HWTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement w:checkBoxes){
           String box=w.getAttribute("value");
           if(box.equals("Option-2")){
               w.click();
           }
        }
    }
}
