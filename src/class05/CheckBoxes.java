package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
       List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
      /* for(WebElement w:checkBoxes){
           String value=w.getAttribute("value");
           if(value.equals("Option-3")) {
               w.click();
           }
       }
       */

        for (int i = 0; i < checkBoxes.size(); i++) {
            String value=checkBoxes.get(i).getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                checkBoxes.get(i).click();
            }

        }

        }
    }

