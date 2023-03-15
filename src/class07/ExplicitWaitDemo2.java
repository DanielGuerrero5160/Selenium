package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement alertButton=driver.findElement(By.xpath("//button[@id='alert']"));
        alertButton.click();
        //wait until the altert is present
        WebDriverWait wait=new WebDriverWait(driver,20);
        //using method alertIsPresent to wait for the alert to be present.
        wait.until(ExpectedConditions.alertIsPresent());
        //accepting the alert
        driver.switchTo().alert().accept();
    }
}
