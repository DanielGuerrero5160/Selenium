package class06HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement startButton=driver.findElement(By.xpath("//button"));
startButton.click();
        WebElement finishButton=driver.findElement(By.xpath("//div[@id='finish']"));
        finishButton.click();
        WebElement hiddenText=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("Hidden Text is: "+hiddenText.getText());


    }
}
