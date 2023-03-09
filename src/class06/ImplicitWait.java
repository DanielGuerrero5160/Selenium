package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //implicit wait below-program will wait dynamically until the element is found,
        //we do not need to keep writing it for it to wait.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //the implicit wait starts being used in every driver.find element we use for the rest of the script
        driver.findElement(By.linkText("Create new account")).click();
//send your first name
        driver.findElement(By.name("firstname")).sendKeys("Daniel");
    }
}
