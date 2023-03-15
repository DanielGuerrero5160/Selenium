package class06HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //switching to iframe
        driver.switchTo().frame(iframe);
        //find text in text box
        WebElement textBox=driver.findElement(By.xpath("//p"));
        //clear text box in iframe
       textBox.clear();
       //add new text to textbox
       textBox.sendKeys("Hello World!");
       //return to main page
       driver.switchTo().defaultContent();
    }
}
