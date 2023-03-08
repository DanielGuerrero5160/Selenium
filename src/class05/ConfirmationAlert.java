package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //switching focus of webdriver to the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();//this will accept a simple alert

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
       alert.sendKeys("Daniel");//we can use alert again because we already created it
        //and because the focus switches to the alert when we click the button
       alert.accept();


    }
}
