package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsexecuter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        //using js executer

        //to highlight username box

        //1 declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //2. Execute Script

        js.executeScript("arguments[0].style.border='5px solid blue'",username);
        //click the login button
      WebElement loginButton=  driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0].click();",loginButton);

js.executeScript("window.scrollBy(0,350","");



    }
}
