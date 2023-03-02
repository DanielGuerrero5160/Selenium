package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site facebook
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
       WebElement createNewBtn= driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));
       createNewBtn.click();
       Thread.sleep(1000);
       WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
       firstName.sendKeys("Daniel");


    }
}
