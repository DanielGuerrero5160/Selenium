package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
//open facebook
        driver.get("https://www.facebook.com/");
        //send in the username
        driver.findElement(By.id("email")).sendKeys("Daniel");
        //send in the password
        driver.findElement(By.name("pass")).sendKeys("password1");
//click create new account
       // driver.findElement(By.linkText("Create new account")).click();

        //click forgot password
        driver.findElement(By.partialLinkText("password?")).click();
driver.quit();
    }
}
