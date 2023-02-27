package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import java.sql.Driver;

public class Task2 {
    /*
    HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clcikng on create new account 🙂
we will discuss "WHY" in future
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
       driver.findElement(By.name("firstname")).sendKeys("Daniel");
        driver.findElement(By.name("lastname")).sendKeys("Guerrero");
        driver.findElement(By.name("reg_email__")).sendKeys("123-456-7890");
        driver.findElement(By.name("reg_passwd__")).sendKeys("passw3rd");
        driver.findElement(By.className("_8esa")).click();

driver.quit();

driver.close();
    }
}
